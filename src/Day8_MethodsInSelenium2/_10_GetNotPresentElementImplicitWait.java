package Day8_MethodsInSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _10_GetNotPresentElementImplicitWait {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Library/Selenium/chromedriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        // if the element appears after 3 seconds, the 2 seconds will NOT be wasted
        // because the script will continue right after the element is found!

        // if the element is never found, it will not wait forever, it will wait just for 5 seconds!

        // that will wait (for exa;5 seconds) and look for the element before showing "no such element" exception.
        // selenium interview lerde mutlaka sorulur bu konu.

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        WebElement text = driver.findElement(By.id("finish"));
        String textStr = text.getText();
        System.out.println(textStr);

        driver.quit();

    }

}
