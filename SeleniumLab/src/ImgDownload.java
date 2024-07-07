import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class ImgDownload {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");
        WebElement searchBar=driver.findElement(By.name("q"));
        searchBar.sendKeys("CMR Institute of Technology Hyderabad");
        searchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[4]/div/div[4]/div/div[1]/div/div/div[1]/div/div/div/div[1]/div[1]/div/div[2]/a/div")).click();
        Actions action = new Actions(driver);
        Robot robot=new Robot();
        WebElement img=driver.findElement(By.xpath("/html/body/div[4]/div/div[15]/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/div[1]/div[2]/h3/a/div/div/div/g-img/img"));
        Thread.sleep(2000);
        action.contextClick(img).build().perform();
        Thread.sleep(1000);
        for (int i=0;i<7;i++){
            robot.keyPress(KeyEvent.VK_DOWN);
            Thread.sleep(500);
        }
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(500);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
}
