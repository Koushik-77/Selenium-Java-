import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.mercurytravels.co.in/");
        driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]")).click();
        driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("acc_first_name")).sendKeys("yourname");
        driver.findElement(By.id("acc_last_name")).sendKeys("yourname");

        driver.findElement(By.id("acc_user_email")).sendKeys("example@gmail.com");
        driver.findElement(By.id("acc_user_password")).sendKeys("example@2006");
        driver.findElement(By.id("acc_user_passconf")).sendKeys("example@2006");
        driver.findElement(By.id("acc_mobile_no")).sendKeys("00000000000");
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/button")).click();
        driver.quit();
    }
}
