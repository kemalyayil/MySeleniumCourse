package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _06_PageLoadTimeout {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
        // eger sayfa 4 saniyede yuklenmezse, error verecek. neden bunu kullaniriz? performans olcumu icin.


        // get metodu will navigate the page and wait until the page load fully
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        driver.quit();


    }
}
