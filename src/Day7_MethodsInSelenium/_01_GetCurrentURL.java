package Day7_MethodsInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_GetCurrentURL {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");

        String currentUrl = driver.getCurrentUrl();             //expected and actual
        System.out.println("Current URL is : " + currentUrl);
        driver.quit();




    }
}
