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

public class TaskB {


    @Test
    public void second() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.saucedemo.com/");

        By locator1 = By.xpath("//input[@id='user-name']");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        driver.findElement(locator1).sendKeys("standard_user");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");

        driver.findElement(By.xpath("//input[@id='login-button']")).click();


        By locator2 = By.xpath("//button[text()='Add to cart']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator2));

        for(int i=0; i<4; i++){
            driver.findElement(locator2).click();
        }

        driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();

        By locator3 = By.xpath("//button[@id='checkout']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator3));
        driver.findElement(locator3).click();


        By locator4 = By.xpath("//input[@placeholder='First Name']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator4));
        driver.findElement(locator4).sendKeys("Yura");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Test");
        driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']")).sendKeys("90001");

        driver.findElement(By.xpath("//input[@id='continue']")).click();


        By locator5 = By.xpath("//button[@id='finish']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator5));
        driver.findElement(locator5).click();

        By locator6 = By.xpath("//button[@id='back-to-products']");
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator6));
        driver.findElement(locator6).click();

        driver.quit();

    }
}
