import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class ImageTest {

    @Test
    public void isImageDisplayed(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement img = driver.findElement(By.tagName("img"));
        String height = img.getAttribute("naturalHeight");
        Assert.assertEquals(height,"223");
        driver.close();
    }
}
