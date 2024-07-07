import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class WordToPdf {
    public static void main(String[] args) throws AWTException, InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://www.ilovepdf.com/word_to_pdf");
        Clipboard route=Toolkit.getDefaultToolkit().getSystemClipboard();
        StringSelection str=new StringSelection("C:\\Users\\Saket\\Downloads\\daa-unit-vii-notes.doc");
        route.setContents(str,null);
        Thread.sleep(2000);
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(2000);
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease((KeyEvent.VK_ENTER));
        Thread.sleep(2000);
        driver.findElement(By.id("processTask")).click();
        driver.findElement(By.id("pickfiles")).click();
        Thread.sleep(5000);
    }
}
