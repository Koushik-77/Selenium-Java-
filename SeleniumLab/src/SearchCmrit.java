import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchCmrit {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.google.com");
        WebElement searchBar=driver.findElement(By.name("q"));
        searchBar.sendKeys("CMR Institute of Technology Hyderabad");
        searchBar.sendKeys(Keys.ENTER);
        driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div > div > div > div.yuRUbf > div > span > a > h3")).click();

    }
}
