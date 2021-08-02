package Day8_MethodsInSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_IsDisplayed {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/1");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        WebElement invisibleText = driver.findElement(By.id("finish"));

        boolean beforeStart = invisibleText.isDisplayed();      // false
        startButton.click();

        Thread.sleep(6000);
        boolean afterStart = invisibleText.isDisplayed();       //True

        System.out.println("Before start = " + beforeStart);
        System.out.println("After start = " + afterStart);

        driver.quit();

    }
}
