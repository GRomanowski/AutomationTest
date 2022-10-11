import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorTest {

    @Test
    public void findElements() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//        By buttonId = By.id("clickOnMe");
//        driver.findElement(buttonId).click();

        // szukanie tekstu
//        driver.findElement(By.linkText("Visit W3Schools.com!"));
        driver.findElement(By.cssSelector("li:nth-child(2)"));
        driver.close();


    }
}
