package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_JSPrompt {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        Thread.sleep(2000);

        WebElement forJsConfirm = driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
        forJsConfirm.click();

        Thread.sleep(2000);

        driver.switchTo().alert().sendKeys("Hello Techno Study");

        Thread.sleep(2000);

        driver.switchTo().alert().accept();
    }
}
