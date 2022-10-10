import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WaitTest {
    WebDriver driver;


    @Test
    public void implicitTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }

    @Test
    public void explicitTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }

    @Test
    public void fluentWaitTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.ignoring(NoSuchElementException.class);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p")));
        driver.findElement(By.cssSelector("p"));
        driver.close();
    }
}
