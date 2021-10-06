import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class new_test {
   public WebDriver driver;
    @Test
    public void ts(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("http://www.google.com");
    }
}
