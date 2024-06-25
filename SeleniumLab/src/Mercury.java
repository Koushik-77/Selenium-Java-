import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercury {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.mercurytravels.co.in/");
        driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]")).click();
        driver.findElement(By.xpath("/html/body/nav[2]/div/div[2]/ul/li[1]/ul/li[2]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("acc_first_name")).sendKeys("saketh");
        driver.findElement(By.id("acc_last_name")).sendKeys("pulluru");

        driver.findElement(By.id("acc_user_email")).sendKeys("pullurusaketh@gmail.com");
        driver.findElement(By.id("acc_user_password")).sendKeys("saketh@2006");
        driver.findElement(By.id("acc_user_passconf")).sendKeys("saketh@2006");
        driver.findElement(By.id("acc_mobile_no")).sendKeys("7337250206");
        driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/form/button")).click();
        driver.quit();
    }
}
