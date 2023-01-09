package chapter2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
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


        driver.get("https://demoqa.com/login");

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



        By locator3 = By.xpath("//button[@id='gotoStore']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator3));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(locator3).click();

        By locator4 = By.xpath("//a[text()='Git Pocket Guide']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator4));
        driver.findElement(locator4).click();


        By locator5 = By.xpath("//button[text()='Add To Your Collection']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(locator5).click();


        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


        driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();



        driver.switchTo().defaultContent();

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        By locator6 = By.xpath("//a[contains(@href,'/books?book=9781491904244')]");  //  //a[text()='You Don't Know JS']

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator6));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(locator6).click();

        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");

        driver.findElement(locator5).click();


        driver.findElement(By.xpath("//span[text()='Profile']")).click();


        driver.switchTo().defaultContent();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");


        By locator7 = By.xpath("//div[@class='do']/button[text()='Delete All Books']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator7));

        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        driver.findElement(locator7).click();

//        driver.switchTo().alert().accept();
//        driver.switchTo().defaultContent();


//        By locator8 = By.xpath("//button[@id='closeSmallModal-ok']");
//        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator8));
//        driver.findElement(locator8).click();
//
//        driver.switchTo().defaultContent();

//        driver.quit();
    }
}
