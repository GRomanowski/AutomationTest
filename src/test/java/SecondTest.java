import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SecondTest extends BaseTest{

    @Test
    public void findSeleniumTutorial() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumdemo.com/");
        driver.findElement(By.linkText("Shop")).click();
        WebElement seleniumProduct = driver.findElement(By.xpath("//h2[text()='Java Selenium WebDriver']"));
        Assert.assertTrue((seleniumProduct.isDisplayed()));
        driver.quit();
    }
}
