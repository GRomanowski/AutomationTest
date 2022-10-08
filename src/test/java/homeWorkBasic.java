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

public class homeWorkBasic {


    @Test
    public void isNameisDisplayed() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        WebElement h1Name = driver.findElement(By.xpath("/html/body/h1"));
        Assert.assertEquals("Witaj na stronie testowej", h1Name.getText());
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

    @Test
    public void radioButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("[type=checkbox]")).click();
        driver.close();
    }

    @Test
    public void secoundRadioButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("[value='male']")).click();
        driver.close();
    }

    @Test
    public void userNameField() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("input[type=text]:nth-child(2)")).clear();
        driver.findElement(By.cssSelector("input[type=text]:nth-child(2)")).sendKeys("Adam");
        driver.close();
    }

    @Test
    public void passwordField() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("input[type=password]")).clear();
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Aa");
        driver.close();
    }

    @Test
    public void clickSubmitButton() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("body > form:nth-child(17) > input[type=submit]:nth-child(8)")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().alert();
        alert.accept();
        driver.close();
    }

    @Test
    public void clickMe() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        driver.findElement(By.cssSelector("#newPage")).click();
        driver.close();
    }

    @Test
    public void childTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
        String tekst = driver.findElement(By.cssSelector("#container > ul > li:nth-child(1) > ul > li")).getText();
        System.out.println(tekst);
        driver.close();
    }
}
