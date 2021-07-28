package Day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class _01_ActionsClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/buttons");

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        WebElement clickButton = driver.findElement(By.xpath("//button[text()='Click Me']"));
        Actions action = new Actions(driver);
        action.click(clickButton).perform();

        WebElement clickMessage = driver.findElement(By.id("dynamicClickMessage"));
        System.out.println(clickMessage.getText());

    }
}
