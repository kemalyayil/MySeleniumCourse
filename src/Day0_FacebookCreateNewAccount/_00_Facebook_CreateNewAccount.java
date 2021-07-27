package Day0_FacebookCreateNewAccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _00_Facebook_CreateNewAccount {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement english = driver.findElement(By.cssSelector("a[class='_sv4']"));
        english.click();

        WebElement createAccount = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        createAccount.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Kemal");

        WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
        gender.click();

        driver.quit();



    }
}
