import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class CmritResults {
    public static void main(String[] args) throws InterruptedException, AWTException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://results.cmrithyderabad.edu.in/");
        driver.findElement(By.id("R22")).click();
        driver.findElement(By.id("btech")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/a[1]/div/div[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("hallticket")).sendKeys("22R01A05P6");
    }
}
