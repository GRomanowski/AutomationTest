import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.opera.OperaDriver;

public class WebDriverManagerTest {

    @Test
    public void openBrowser() {
        WebDriverManager.chromedriver().setup();
//        WebDriverManager.iedriver().setup();
//        ChromeOptions options = new ChromeOptions();
//        InternetExplorerOptions options1 = new InternetExplorerOptions();
//        options1.withInitialBrowserUrl("www.google.pl");
//        WebDriver driver = new InternetExplorerDriver(options1);

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.pl/");
        driver.manage().window().maximize();
    }
}


