package Day10_ExplicitVsImplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _04_URLtoBe {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/");

        WebElement seleniumTutorials = driver.findElement(By.cssSelector("p:nth-child(5) > a:nth-child(1)"));

        seleniumTutorials.click();

        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.urlToBe("https://www.seleniumeasy.com/selenium-tutorials"));
        //wait.until(ExpectedConditions.urlContains("tutorials"));  // yukardaki ile ayni ....


    }
}
