package Day9_Alerts_SelectMethod.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _02_tutorialpoint_com {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");

            driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.cssSelector("input[name=firstname]"));
        firstName.sendKeys("Kemal");

        WebElement lastName = driver.findElement(By.cssSelector("input[name=lastname]"));
        lastName.sendKeys("Yayil");

        WebElement genderMale = driver.findElement(By.cssSelector("input[value=Male]"));
        genderMale.click();

        WebElement yearsOfExperience = driver.findElement(By.cssSelector("input[value='5']"));
        yearsOfExperience.click();

        /// date kismini yapmak lazim- bilemedim

        WebElement profession1 = driver.findElement(By.cssSelector("input[value='Manual Tester']"));
        profession1.click();

        WebElement profession2 = driver.findElement(By.cssSelector("input[value='Automation Tester']"));
        profession2.click();

        WebElement flavorsOfWebDriver= driver.findElement(By.cssSelector("input[value='Selenium Webdriver']"));
        flavorsOfWebDriver.click();

        Select continent = new Select(driver.findElement(By.cssSelector("select[style]")));
        continent.selectByVisibleText("Africa");

        Select seleniumCommands = new Select(driver.findElement(By.cssSelector("select[name='selenium_commands']")));
        seleniumCommands.selectByIndex(2);

        WebElement submitButton = driver.findElement(By.cssSelector("button[name=submit]"));
        submitButton.click();

        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.quit();









    }
}
