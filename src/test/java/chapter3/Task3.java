package chapter3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task3 {


    @Test
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://shop.demoqa.com/");

        By locator1 = By.xpath("//a[text()='Dismiss']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator1));
        driver.findElement(locator1).click();

        By locator2 = By.xpath("//a[@href=\"https://shop.demoqa.com/my-account/\"]");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator2));
        driver.findElement(locator2).click();

        driver.navigate().back();

        driver.navigate().forward();

        driver.navigate().to("https://shop.demoqa.com/");

        driver.navigate().refresh();

        driver.close();

    }
}
