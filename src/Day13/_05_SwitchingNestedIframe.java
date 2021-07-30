package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _05_SwitchingNestedIframe {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://chercher.tech/practice/frames");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        WebElement iFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
        driver.switchTo().frame(iFrame);

        WebElement input = driver.findElement(By.xpath("//input[@type='text']"));
        input.sendKeys("Hello");

        driver.switchTo().frame("frame3");          // bu sekilde iframe i switch yapabiliriz. eger iframe has the unique id.

        WebElement checkbox = driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent();                 // we will be in the main frame with that.
        WebElement uiPathButton = driver.findElement(By.xpath("//a[text()='UiPath']"));
        uiPathButton.click();

    }
}
