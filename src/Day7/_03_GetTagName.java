package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_GetTagName {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://techno.study");

        WebElement element = driver.findElement(By.cssSelector("#tatsu-header-placeholder"));
        String tagName = element.getTagName();                  // bu sekilde tag name' i buluyoruz.
        System.out.println("Tag Name of Element = " + tagName);

        driver.quit();
    }
}
