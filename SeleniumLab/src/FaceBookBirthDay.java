import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookBirthDay {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("saketh");
        driver.findElement(By.name("lastname")).sendKeys("pulluru");
        driver.findElement(By.name("reg_email__")).sendKeys("pullurusaketh@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("pullurusaketh@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("month")).sendKeys("Feb");
        driver.findElement(By.id("year")).sendKeys("2006");
        Thread.sleep(2000);
        driver.findElement(By.name("reg_passwd__")).sendKeys("saketh@2006");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()='Male']")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("websubmit")).click();
    }
}
