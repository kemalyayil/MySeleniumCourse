package Day11.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _00_Facebook_CreateNewAccount_KendinCalis {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement english = driver.findElement(By.cssSelector("a[class='_sv4']"));
        english.click();

        WebElement createNewAccount = driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createNewAccount.click();

        WebElement firstName = driver.findElement(By.xpath("//input[@placeholder='First name']"));
        firstName.sendKeys("Kemal");

        WebElement lastName = driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Yayil");

        WebElement mobileNumber = driver.findElement(By.xpath("//input[@name='reg_email__']"));
        mobileNumber.sendKeys("12345678");

        WebElement newPassword = driver.findElement(By.xpath("//input[@data-type='password']"));
        newPassword.sendKeys("12345678");

        Select birthdayMonth = new Select(driver.findElement(By.xpath("//select[@aria-label='Month']")));
        birthdayMonth.selectByVisibleText("Jun");

        Select birthdayDay = new Select(driver.findElement(By.xpath("//select[@aria-label='Day']")));
        birthdayDay.selectByValue("5");

        Select birthdayYear = new Select(driver.findElement(By.xpath("//select[@aria-label='Year']")));
        birthdayYear.selectByValue("1990");

        WebElement male = driver.findElement(By.xpath("//input[@value='2']"));
        male.click();

        WebElement signUpButton = driver.findElement(By.xpath("//button[@name='websubmit']"));
        signUpButton.click();

        driver.quit();




    }
}
