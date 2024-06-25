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

        // Add key and value to map to switch off browser notifications
        prefs.put("profile.default_content_setting_values.notifications", 2);

        // Create an instance of ChromeOptions
        ChromeOptions options = new ChromeOptions();

        // Set ExperimentalOption - prefs
        options.setExperimentalOption("prefs", prefs);

        // Set system property for ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver(options);
        try {
            driver.manage().window().maximize();
            driver.get("https://www.axisbank.com/");

            // Wait for the page to load and the popup to appear
            Thread.sleep(5000);

            // Find the popup close button and click it
            WebElement popupClose = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]"));
            popupClose.click();

            // Wait for a while to observe the result
            Thread.sleep(2000);
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Ensure driver is closed properly
            driver.quit();
        }
    }
}
