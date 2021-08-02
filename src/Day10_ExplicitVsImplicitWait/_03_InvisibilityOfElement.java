package Day10_ExplicitVsImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _03_InvisibilityOfElement {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebDriverWait wait = new WebDriverWait(driver,10);

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));
        startButton.click();

        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("loading"))));   // loading invisable olana kadar bekle
                                                                        // implicit wait cannot check for invisiblity
        WebElement finishText = driver.findElement(By.id("finish"));
        String result = finishText.getText();
        System.out.println("result = " + result);

        driver.quit();
    }
}
