package Day7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_GetTitleAndPageSource {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        String pageTitle = driver.getTitle();
        System.out.println("pageTitle = " + pageTitle);

        String pageSource = driver.getPageSource();         // sitenin tum kodlarini verir
        System.out.println("pageSource = " + pageSource);

        driver.quit();

    }
}
