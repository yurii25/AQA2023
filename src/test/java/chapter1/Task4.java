package chapter1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;


public class Task4 {


    @Test
    public void first() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        By locator1 = By.xpath("//button[@ng-click='manager()']");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        driver.findElement(locator1).click();

        By locator2 = By.xpath("//button[@ng-click='showCust()']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
        driver.findElement(locator2).click();

        By locator3 = By.xpath("//button[@ng-click='deleteCust(cust)']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator3));

        driver.findElements(locator3).forEach(WebElement::click);

        driver.quit();
    }
}
