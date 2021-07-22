package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _04_SelectByClicking_DropdownList {

        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

            List<WebElement> stateOptions = driver.findElements(By.cssSelector("select[name=state]>option"));
            for (int i = 0; i < stateOptions.size();i++){
                if (stateOptions.get(i).getText().equals("New York")){
                    stateOptions.get(i).click();
                    break;
                }
            }
            // some dropdowns dont have select . therefore bu methodu kullanmamiz lazim. genelde bu yontem cok
            // tercih edilmiyor.

    }
}
