import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Popup {

    public static void main(String[] args) throws InterruptedException {
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("profile.default_content_setting_values.notifications", 2);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", prefs);
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.manage().window().maximize();
            driver.get("https://www.axisbank.com/");
            Thread.sleep(5000);
            WebElement popupClose = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]"));
            popupClose.click();
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}
