import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumTest {


    @Test
    public void openGoogleTest() {
        WebDriver driver = getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
        // znalezienie przycisku
        WebElement agreeButton = driver.findElement(By.xpath("//div[text()='Zaakceptuj wszystko']"));
        // klikniecie przycisku
        agreeButton.click();
        // znajdz pole wyszukiwania
        WebElement searchField = driver.findElement(By.name("q"));
        // wprowadz wartosc Selenium do pola
        searchField.sendKeys("Selenium");
        // zasymuluj nacisniecie przycisku Enter
        searchField.sendKeys(Keys.ENTER);
        // znalezc rezultat
        WebElement result = driver.findElement(By.xpath("//a[contains(@href,'selenium.dev')]//h3"));

        Assert.assertTrue(result.isDisplayed());
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
