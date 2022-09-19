import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseActionTest {

    @Test
    public void performAction(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
        driver.findElement(By.id("fname")).sendKeys("Adam");
        driver.findElement(By.name("username")).sendKeys("AAA");
        driver.findElement(By.name("username")).sendKeys(Keys.TAB);


    }
}
