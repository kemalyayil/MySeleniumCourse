package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_JSAlert {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement forJsAlert = driver.findElement(By.cssSelector("button[onclick='jsAlert()']"));
        forJsAlert.click();

        Thread.sleep(2000);

        String alertMessage = driver.switchTo().alert().getText();
        driver.switchTo().alert().accept();              // alert geldiginde "switchTo.alert.accept()" methodunu kullaniyoruz. bunu yazdigimizda ok'ye otomatik basacak
        System.out.println(alertMessage);
        driver.quit();

    }
}
