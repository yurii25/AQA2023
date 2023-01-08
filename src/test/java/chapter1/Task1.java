package chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Task1 {


    @Test
    public void first() {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
        WebElement result1 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-click='customer()']")));

        driver.findElement(By.xpath("//button[@ng-click='customer()']")).click();


        WebElement result2 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='userSelect']")));

        driver.findElement(By.xpath("//select[@id='userSelect']")).click();

        WebElement result3 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//option[text() = 'Harry Potter']")));

        driver.findElement(By.xpath("//option[text() = 'Harry Potter']")).click();

        WebElement result4 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type = 'submit']")));

        driver.findElement(By.xpath("//button[@type = 'submit']")).click();

        WebElement result5 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-click='deposit()']")));

        driver.findElement(By.xpath("//button[@ng-click='deposit()']")).click();

        WebElement result6 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input")));

        driver.findElement(By.xpath("//input")).sendKeys("1000");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//button[@ng-click='withdrawl()']")).click();

        WebElement result7 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//input")));

        driver.findElement(By.xpath("//input")).sendKeys("900");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement result8 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-click='transactions()']")));

        driver.findElement(By.xpath("//button[@ng-click='transactions()']")).click();

        WebElement result9 = new WebDriverWait(driver, Duration.ofSeconds(1))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-click='reset()']")));

        driver.findElement(By.xpath("//button[@ng-click='reset()']")).click();

        driver.quit(); // test

    }
}
