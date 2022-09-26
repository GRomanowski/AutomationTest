import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomeWorkBasic {


    @Test
    public void isNameisDisplayed() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement h1Name = driver.findElement(By.xpath("/html/body/h1"));
        Assert.assertTrue(h1Name.getText().equals("Witaj na stronie testowej"));
        driver.close();
    }

    @Test
    public void clickOnMe() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        Actions action = new Actions(driver);
        action.click(driver.findElement(By.id("clickOnMe"))).perform();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.close();
    }

    @Test
    public void clickOnFirstLink() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.linkText("Visit W3Schools.com!")).click();
        driver.close();
    }

    @Test
    public void clickOnSecondtLink() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.linkText("IamWeirdLink")).click();
        driver.close();
    }

    @Test
    public void itemFromTable() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        System.out.println(driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(2) > td:nth-child(1)")).getText());
        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText());
        driver.close();
    }

    @Test
    public void select() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement selectCar = driver.findElement(By.cssSelector("select"));
        Select cars = new Select(selectCar);
        cars.selectByIndex(3);
        driver.close();
    }
}
