import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookBirthDay {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("yourname");
        driver.findElement(By.name("lastname")).sendKeys("yourname");
        driver.findElement(By.name("reg_email__")).sendKeys("example@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("example@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("day")).sendKeys("0");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.id("year")).sendKeys("1999");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("example@2006");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
    }
}
