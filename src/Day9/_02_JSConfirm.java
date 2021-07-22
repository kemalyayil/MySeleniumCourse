package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_JSConfirm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        Thread.sleep(2000);

        WebElement forJsConfirm = driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
        forJsConfirm.click();

        String alertMessage = driver.switchTo().alert().getText();      // alert teki messaji yazdirmak icin
        driver.switchTo().alert().dismiss();        // iki opsiyondan olumsuz olanini secer
        Thread.sleep(2000);

        System.out.println(alertMessage);

        driver.quit();

        // how do you handle the alerts?  ===> I use driver switch to alert bla bla

    }
}
