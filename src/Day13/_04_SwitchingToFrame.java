package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _04_SwitchingToFrame {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");

        // inspect te olan iframe tag i ile alakali calisacagiz. checkbox inside an iframe(we need to switch like in windows to reach it.
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(iFrame);

        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Hello");
    }
}
