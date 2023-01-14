package chapter3;

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
    public void test() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(20));

        driver.get("https://demoqa.com/progress-bar");

        By locator1 = By.xpath("//button[@id='startStopButton']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator1));
        driver.findElement(locator1).click();

        By locator2 = By.xpath("//button[@id='resetButton']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator2));
        driver.findElement(locator2).click();

//        WebElement element = driver.findElement(By.xpath("//button[@id='startStopButton']"));
//        webDriverWait.until(ExpectedConditions.elementToBeClickable(element));


        // Працює і без вище закоментованого коду
        // StaleElementReference Exception не з'явилась

        By locator3 = By.xpath("//button[@id='startStopButton']");
        webDriverWait.until(ExpectedConditions.elementToBeClickable(locator3));

        driver.close();

    }
}
