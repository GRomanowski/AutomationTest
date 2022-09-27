import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseActionTest{
    @Test
    public void performAction() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/");
        driver.findElement(By.linkText("Podstawowa strona testowa")).click();
//        driver.findElement(By.id("fname")).sendKeys("Adam");
//        driver.findElement(By.name("username")).sendKeys("AAA");
//        driver.findElement(By.name("username")).sendKeys(Keys.TAB);
        WebElement samochody = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(samochody);
        cars.selectByValue("mercedes");
//        cars.selectByIndex(1);

        WebElement paragraf = driver.findElement(By.cssSelector(".topSecret"));
        System.out.println("By text: " + paragraf.getText());
        System.out.println("By text: " + paragraf.getAttribute("value"));
        System.out.println("By text: " + paragraf.getAttribute("textContent"));
        driver.close();
    }
}
