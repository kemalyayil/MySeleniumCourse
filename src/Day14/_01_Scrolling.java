package Day14;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techno.study/");


        JavascriptExecutor js = (JavascriptExecutor) driver;

        // This will scroll down by 2000 pixels
        js.executeScript("window.scrollBy(0,2000)");        // 0 = yana dogru , ikinci olan ise asagi gitmek icin

        Thread.sleep(3000);

        // This will scroll up by 1000 pixels
        js.executeScript("window.scrollBy(0,-1000)");
    }
}
