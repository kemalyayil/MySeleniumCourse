package Day13_SwittchingWindows_SwitchingFrames_SwitchingNestedFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _02_CloseDriver {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");


        String originalWindowHandle = driver.getWindowHandle();

        WebElement link = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));
        link.click();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String handle : windowHandles){
            driver.switchTo().window(handle);
        }

        driver.close();         // ikinci actigimiz tab'i kapatti

        driver.switchTo().window(originalWindowHandle);

        link.click();

        // will quit the browser
        driver.quit();


        /*
        OZET OLARAK; close o tab i(current tab or window) , quit whole browser i kapatir.
        bu interview question
         */
    }
}
