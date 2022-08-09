import org.junit.Test;
import org.openqa.selenium.InvalidArgumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTest {


    @Test
    public void openGoogleTest() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\grzeg\\Drivers\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.google.de/");
        getDriver("chrome");
    }

    public WebDriver getDriver(String browser) {
        switch (browser) {
            case "chrome" -> {
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\grzeg\\Drivers\\chromedriver.exe");
                return new ChromeDriver();
            }
            case "firefox" -> {
                System.setProperty("webdriver.gecko.driver", "C:\\Users\\grzeg\\Drivers\\geckodriver.exe");
                return new FirefoxDriver();
            }
            case "edge" -> {
                System.setProperty("webdriver.edge.driver", "C:\\Users\\grzeg\\Drivers\\msedgedriver.exe");
                return new EdgeDriver();
            }
            default -> throw new InvalidArgumentException("Invalid browser name");
        }
    }
}
