package chapter1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Task1 {


    @Test
    public void first() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

        By locator1 = By.xpath("//button[@ng-click='customer()']");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        driver.findElement(locator1).click();

        By locator2 = By.xpath("//select[@id='userSelect']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
        driver.findElement(locator2).click();

        By locator3 = By.xpath("//option[text() = 'Harry Potter']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator3));
        driver.findElement(locator3).click();

        By locator4 = By.xpath("//button[@type = 'submit']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator4));
        driver.findElement(locator4).click();

        By locator5 = By.xpath("//button[@ng-click='deposit()']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));
        driver.findElement(locator5).click();

        By locator6 = By.xpath("//input");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator6));
        driver.findElement(locator6).sendKeys("1000");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();

        By locator7 = By.xpath("//input");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator7));
        driver.findElement(locator7).sendKeys("900");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        By locator8 = By.xpath("//button[@ng-click='transactions()']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator8));
        driver.findElement(locator8).click();

        By locator9 = By.xpath("//button[@ng-click='reset()']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator9));
        driver.findElement(locator9).click();

        driver.quit();

    }
}
