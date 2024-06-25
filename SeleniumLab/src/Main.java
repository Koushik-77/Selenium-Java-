import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Saket\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");

        // Logging in
        driver.findElement(By.id("nav-link-accountList")).click();
        driver.findElement(By.id("ap_email")).sendKeys("7337250206");
        driver.findElement(By.id("continue")).click();
        driver.findElement(By.id("ap_password")).sendKeys("saketh@250206");
        driver.findElement(By.id("signInSubmit")).click();

        // Get the number of products and their names
        System.out.println("Enter number of products you want to buy:");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline
        String[] products = new String[n];
        System.out.println("Enter " + n + " products you want to buy:");
        for (int i = 0; i < n; i++) {
            products[i] = sc.nextLine();
        }

        // Search for each product and add to cart
        for (String product : products) {
            // Search for the product
            WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));
            searchBar.clear();
            searchBar.sendKeys(product);
            searchBar.sendKeys(Keys.ENTER);

            Thread.sleep(2000);
            try {
                driver.findElement(By.xpath("//button[text()='Add to cart']")).click();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
            // Wait a bit before continuing to the next product
            Thread.sleep(2000);
        }
        driver.get("https://www.amazon.com/gp/cart/view.html?ref_=nav_cart");
    }
}
