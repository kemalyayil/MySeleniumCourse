package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _01_XpathSimpleSelector {
    public static void main(String[] args) {
        /*
        <a role="button" class="_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy" href="#" ajaxify="/reg/spotlight/"
        id="u_0_2_1y" data-testid="open-registration-form-button" rel="async">Create New Account</a>
         */

        //a[@data-testid='open-registration-form-button']

        //input[@name='firstname']
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
