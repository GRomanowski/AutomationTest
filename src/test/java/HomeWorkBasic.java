import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWorkBasic {

    @Test
    public void basicSiteTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
// Pobieranie nazwy h1
        WebElement h1Name = driver.findElement(By.xpath("/html/body/h1"));
        Assert.assertTrue(h1Name.getText().equals("Witaj na stronie testowej"));
// Klikanie na przycisk kliknij mnie

//        Actions action = new Actions(driver);
//        action.click(driver.findElement(By.id("clickOnMe"))).perform();

//        driver.close();
    }
}
