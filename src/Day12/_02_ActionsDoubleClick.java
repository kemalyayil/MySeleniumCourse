package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class _02_ActionsDoubleClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);

        WebElement doubleClickButton = driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"));
        Actions action = new Actions(driver);                   // line 14 teki driver
        action.doubleClick(doubleClickButton).perform();        // perform yazmassak calismaz

        WebElement doubleClickMessage = driver.findElement(By.cssSelector("#doubleClickMessage"));
        System.out.println(doubleClickMessage.getText());

        WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));

        driver.quit();

    }
}
