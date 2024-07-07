import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailReg {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.gmail.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div[2]/div/div/div[1]/div/button")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz/div/div[3]/div/div[2]/div/div/div[2]/div/ul/li[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstName")).sendKeys("saketh");
        driver.findElement(By.name("lastName")).sendKeys("pulluru");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("month")).sendKeys("F");
        driver.findElement(By.id("day")).sendKeys("25");
        driver.findElement(By.id("year")).sendKeys("2001");
        driver.findElement(By.id("gender")).sendKeys("M");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[2]/div/div/div/form/span/section/div/div/div[1]/div[1]/div/span/div[3]/div/div[1]/div")).click();
        driver.findElement(By.name("Username")).sendKeys("gamil");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("Passwd")).sendKeys("saketh@1111");
        driver.findElement(By.name("PasswdAgain")).sendKeys("saketh@1111");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/c-wiz/div/div[3]/div/div/div/div/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("phoneNumberId")).sendKeys("7337123456");
        driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div[3]/div/div[1]/div/div/button")).click();
        }
}
