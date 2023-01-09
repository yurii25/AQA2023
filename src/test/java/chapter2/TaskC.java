package chapter2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TaskC {


    @Test
    public void third() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://webdriveruniversity.com/To-Do-List/index.html");

        By locator1 = By.xpath("//input[@placeholder='Add new todo']");
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(locator1));
        driver.findElement(locator1).sendKeys("MAKE HOMEWORK");

        WebElement textbox = driver.findElement(By.cssSelector("input[placeholder='Add new todo']"));
        textbox.sendKeys(Keys.ENTER);

        driver.findElement(locator1).sendKeys("Practice Automation");
        textbox.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//li[normalize-space()='Practice magic']")).click();



        WebElement element = driver.findElement(By.xpath("//li[normalize-space()='Buy new robes']"));
        Actions action = new Actions(driver);
        action.moveToElement(element).perform();

        WebElement element1 = driver.findElement
                (By.xpath("//li[normalize-space()='Buy new robes']/span/i[@class='fa fa-trash']"));

        action.moveToElement(element).click(element1).build().perform();

        driver.quit();

    }
}
