package Day6_OpeningAWebSite_FindingElements_Navigating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindingElementsTASK {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");

        List<WebElement> liElements = driver.findElements(By.cssSelector(".dropdown-toggle"));
        for (WebElement element:liElements){
            System.out.println(element.getText());
        }
        driver.quit();

    }

}
