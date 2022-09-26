import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWorkBasic {

    @Test
    public void basicSiteTest() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");
//// Pobieranie nazwy h1
//        WebElement h1Name = driver.findElement(By.xpath("/html/body/h1"));
//        Assert.assertTrue(h1Name.getText().equals("Witaj na stronie testowej"));
//// Klikanie na przycisk kliknij mnie
//        Actions action = new Actions(driver);
//        action.click(driver.findElement(By.id("clickOnMe"))).perform();
//// Obsługa alertu
//        Alert alert = driver.switchTo().alert();
//        alert.accept();
//// klikanie w link W3Schools
//        driver.findElement(By.linkText("Visit W3Schools.com!")).click();
// klikanie w link IamWeirdLink
//        driver.findElement(By.linkText("IamWeirdLink")).click();
//// Wyciaganie wartosci z tabeli
//        System.out.println(driver.findElement(By.cssSelector("body > table > tbody > tr:nth-child(2) > td:nth-child(1)")).getText());
//        System.out.println(driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td[2]")).getText());
// Wyciąganie wartości z Selectora




//        driver.close();
    }
}
