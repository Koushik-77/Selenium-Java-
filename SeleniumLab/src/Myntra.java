import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;

public class Myntra {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc=new Scanner(System.in);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.myntra.com/");
        driver.findElement(By.className("desktop-userTitle")).click();
        driver.findElement(By.className("desktop-linkButton")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[3]/div[2]/div/div/div[1]/div/div/div[2]/div[2]/div[1]/input")).sendKeys("7337123456");
        Thread.sleep(2000);
        driver.findElement(By.className("submitBottomOption")).click();
        Thread.sleep(30000);
        driver.findElement(By.className("submitBottomOption")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("otp0")).sendKeys("0");
        driver.findElement(By.name("otp1")).sendKeys("1");
        driver.findElement(By.name("otp2")).sendKeys("2");
        driver.findElement(By.name("otp3")).sendKeys("3");
    }
}
