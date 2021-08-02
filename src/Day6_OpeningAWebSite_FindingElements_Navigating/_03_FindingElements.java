package Day6_OpeningAWebSite_FindingElements_Navigating;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _03_FindingElements {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");

        List<WebElement> liElements = driver.findElements(By.cssSelector("#treemenu li"));          // list yapmamizin nedeni birden fazla element almak istedigimiz icin
        for (WebElement element:liElements){                // list oldugu icin , yazdirmak icin for each loop kullaniyoruz
            System.out.println(element.getText());
        }
        driver.quit();

    }

}
