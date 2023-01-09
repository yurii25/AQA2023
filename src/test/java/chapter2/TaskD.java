package chapter2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TaskD {


    @Test
    public void fourth() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com/");

        By locator1 = By.xpath("//a [contains(@href,'/deals?ref_=nav_cs_gb')]");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator1));
        driver.findElement(locator1).click();


        By locator2 = By.xpath("//div[@data-deal-id='c49d0841']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator2));
        driver.findElement(locator2).click();

        By locator3 = By.xpath("//div[@class='a-section octopus-dlp-image-shield']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator3));
        driver.findElement(locator3).click();


        By locator4 = By.xpath("//input[@id='add-to-cart-button']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator4));
        driver.findElement(locator4).click();


        By locator5 = By.xpath("//input[@name='proceedToRetailCheckout']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));
        driver.findElement(locator5).click();


        driver.quit();


    }
}
