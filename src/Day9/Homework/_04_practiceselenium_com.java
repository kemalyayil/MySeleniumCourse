package Day9.Homework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_practiceselenium_com {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.practiceselenium.com/practice-form.html");
    }
}
