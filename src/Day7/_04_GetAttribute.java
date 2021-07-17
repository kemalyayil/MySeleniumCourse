package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_GetAttribute {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https:techno.study");
        WebElement element = driver.findElement(By.cssSelector("#tatsu-header-wrap"));

        String attribute = element.getAttribute("class");
        System.out.println("Class Attribute for WebElement = " + attribute);

        driver.quit();
    }
}
