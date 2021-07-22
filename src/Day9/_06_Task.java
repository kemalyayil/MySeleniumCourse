package Day9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class _06_Task {

    // Navigate facebook.com
    // Click on Create New Account button
    // Fill the form

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.get("https://www.facebook.com/");

        WebElement pressEnglish = driver.findElement(By.cssSelector("a[title='English (US)']"));
        pressEnglish.click();

        WebElement clickCreateNewAccount = driver.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        clickCreateNewAccount.click();

        WebElement firstName = driver.findElement(By.cssSelector("input[Name=firstname]"));
        firstName.sendKeys("Liping");

        WebElement lastName = driver.findElement(By.cssSelector("input[Name=lastname]"));
        lastName.sendKeys("i++");

        WebElement emailOrMobile = driver.findElement(By.cssSelector("input[name=reg_email__]"));
        emailOrMobile.sendKeys("lipimgi++@gmail.com");    // bu kisimdan sonra re-enter your email diye bi sey beliriyor.

        WebElement emailOrMobileConfirm = driver.findElement(By.cssSelector("input[name=reg_email_confirmation__]"));
        emailOrMobileConfirm.sendKeys("lipimgi++@gmail.com");

        WebElement password = driver.findElement(By.cssSelector("input[id=password_step_input]"));
        password.sendKeys("1234567");

        Select month= new Select(driver.findElement(By.id("month")));
        month.selectByVisibleText("Dec");

        Select day= new Select(driver.findElement(By.id("day")));
        day.selectByIndex(2);           // 2nd index(0,1,2)

        Select year= new Select(driver.findElement(By.id("year")));
        year.selectByValue("1980");

        WebElement genderMale = driver.findElement(By.cssSelector("input[value='2']"));
        genderMale.click();

        String signUp = driver.findElement(By.cssSelector("button[name=websubmit]")).getText();
        System.out.println(signUp);

        /*
        https://www.techlistic.com/p/selenium-practice-form.html

        https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm

        https://demoqa.com/automation-practice-form

        http://www.practiceselenium.com/practice-form.html
         */







    }
}