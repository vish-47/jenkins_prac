import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class newtest {
   public WebDriver driver;
    @Test
    public void ts(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://www.google.com");
        System.out.println(driver.getCurrentUrl());
        driver.manage().window().setSize(new Dimension(1440, 875));
        driver.findElement(By.name("q")).sendKeys("amazon");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector(".eKjLze .LC20lb")).click();
        System.out.println(driver.getCurrentUrl());



    }
}
