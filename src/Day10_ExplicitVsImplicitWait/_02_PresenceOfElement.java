package Day10_ExplicitVsImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _02_PresenceOfElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("finish")));   // hello world yazana kadar bekle
        WebElement finishText = driver.findElement(By.id("finish"));
        String result = finishText.getText();
        System.out.println("result = " + result);

        driver.quit();
    }
}
