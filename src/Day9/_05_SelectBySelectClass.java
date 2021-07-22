package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _05_SelectBySelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

        Select select = new Select(driver.findElement(By.cssSelector("select[name=state]")));
        select.selectByVisibleText("Alaska");       // that will select that element for us
//        select.selectByValue();
//        select.selectByIndex(6);

        driver.quit();


    }
}
