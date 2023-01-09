import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class FirstUITest {

    @Test
    public void firstSeleniumTest(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\38098\\IdeaProjects\\AQA2023\\Chromedriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("testfort");
        driver.quit();

    }

    @Test
    public void firstSeleniumTestChromeDriverLogin() {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2F");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test2@yahoo.com");
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
        driver.quit();

    }

    @Test
    public void firstSeleniumTestFirefoxDriverLogin(){

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver = new FirefoxDriver();
        driver.get("https://login.yahoo.com/?.src=ym&pspid=159600001&activity=mail-direct&.lang=en-US&.intl=us&.done=https%3A%2F%2Fmail.yahoo.com%2Fd%2F");
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("test2@yahoo.com");
        driver.findElement(By.xpath("//input[@id='login-signin']")).click();
        driver.quit();

    }

// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

// WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

//        WebElement result1 = new WebDriverWait(driver, Duration.ofSeconds(1))
//                .until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@ng-click='customer()']")));

}
