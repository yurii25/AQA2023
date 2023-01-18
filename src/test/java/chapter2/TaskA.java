package chapter2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TaskA {

    @Test
    public void first() {
        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-fullscreen");
        WebDriver driver = new ChromeDriver(options);

        // Open “https://demoqa.com/login”

        driver.get("https://demoqa.com/login");

        // Login

        By locator1 = By.xpath("//input[@id='userName']");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        driver.findElement(locator1).sendKeys("testY");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Qwerty1@");

        driver.switchTo().defaultContent();

        By locator2 = By.xpath("//button[@id='login']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator2));

        //Scroll down till the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(locator2).click();

        // Go to Book Store

        By locator3 = By.xpath("//button[@id='gotoStore']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator3));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(locator3).click();

        // Choose Git Pocket Guide

        By locator4 = By.xpath("//a[text()='Git Pocket Guide']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator4));
        driver.findElement(locator4).click();

        // Click “Add to your Collection”

        By locator5 = By.xpath("//button[text()='Add To Your Collection']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(locator5).click();

        // Handle alert similar as from last lesson (Tap Ok)


        new WebDriverWait(driver, Duration.ofSeconds(10, 0))
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();


        // Click Back To Store

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();


        // Click "You Don’t Know JS”

        By locator6 = By.xpath("//a[contains(@href,'/books?book=9781491904244')]");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator6));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(locator6).click();

        // “Add to your Collection”

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(locator5).click();

        // Handle Alert


        new WebDriverWait(driver, Duration.ofSeconds(10, 0))
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();


        // Go to “Profile”

        By locator7 = By.xpath("//span[text()='Profile']");

        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator7));

        driver.findElement(locator7).click();

        // Click “Delete All Books"


        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


        WebDriverWait webDriverWait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()='Delete All Books']")));

        WebElement element = driver.findElement(By.xpath("//div[@class='do']/button[text()='Delete All Books']"));
        js.executeScript("arguments[0].click();", element);

        // Tap OK on the modal screen

        By locator9 = By.xpath("//button[@id='closeSmallModal-ok']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator9));
        driver.findElement(locator9).click();

        // Handle Alert
        new WebDriverWait(driver, Duration.ofSeconds(10, 0))
                .ignoring(NoAlertPresentException.class)
                .until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();

        driver.quit();
    }

}


