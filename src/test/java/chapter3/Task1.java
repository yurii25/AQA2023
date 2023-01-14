package chapter3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task1 {

    @Test
    public void fourth() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://shop.demoqa.com/");

        System.out.println(driver.getTitle());

        System.out.println(driver.getTitle().length());

        System.out.println(driver.getCurrentUrl().equals("https://shop.demoqa.com/"));

        driver.getPageSource();

        System.out.println("Page source length: " + driver.getPageSource().length());

        driver.quit();

    }
}
