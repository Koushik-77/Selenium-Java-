import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Set;

public class Ajio {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.ajio.com/");

        String ajioWindow = driver.getWindowHandle();
        driver.findElement(By.id("loginAjio")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("fb-login")).click();
        Thread.sleep(2000);
        // Wait for the new tab to open and get all window handles
        Set<String> allWindowHandles = driver.getWindowHandles();
        for (String handle : allWindowHandles) {
            if (!handle.equals(ajioWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[1]/div/input")).sendKeys("example@gmail.com");
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[2]/div/input")).sendKeys("example@2006");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[4]/label[2]/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div/div[2]/div[1]/form/div/div[4]/label[2]/input")).click();
    }
}
