import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JustDialList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.justdial.com/");
        driver.findElement(By.xpath("/html/body/div/div/section/section[2]/div/div/div[2]/a[8]")).click();
        driver.manage().deleteAllCookies();
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/ul/li[1]/a")).click();
        driver.manage().deleteAllCookies();
    }
}
