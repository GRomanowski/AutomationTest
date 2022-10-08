import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementExistTest {
    WebDriver driver;

    @Test
    public void elementExistTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(elementExists(By.tagName("p")));
        System.out.println(elementExists(By.id("topSecret")));

        System.out.println(elementExistsSecond(By.tagName("p")));
        System.out.println(elementExistsSecond(By.id("topSecret")));
//        driver.findElement(By.tagName("p"));
//        driver.findElement(By.id("topSecret"));
    }

    public boolean elementExists(By locator) {
        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
    public boolean elementExistsSecond(By locator) {
        return driver.findElements(locator).size() > 0;
    }
}

