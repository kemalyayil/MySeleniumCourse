package Day9_Alerts_SelectMethod.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _01_techlistic_com {
    public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
        driver.manage().window().maximize();


        WebElement firstName = driver.findElement(By.cssSelector("input[name='firstname']"));
        firstName.sendKeys("Kemal");

        WebElement lastName = driver.findElement(By.cssSelector("input[name='lastname']"));
        lastName.sendKeys("Yayil");

        WebElement genderMale = driver.findElement(By.id("sex-0"));
        genderMale.click();

        WebElement yearsOfExperience = driver.findElement(By.id("exp-6"));
        yearsOfExperience.click();

        WebElement datePicker = driver.findElement(By.id("datepicker"));
        datePicker.sendKeys("01.01.2010");

        WebElement profession1 = driver.findElement(By.id("profession-0"));
        WebElement profession2 = driver.findElement(By.id("profession-1"));
        profession1.click();
        profession2.click();

        WebElement automationTools = driver.findElement(By.id("tool-2"));
        automationTools.click();

        Select continent = new Select(driver.findElement(By.id("continents")));
        continent.selectByVisibleText("Europe");

        Select seleniumCommands = new Select(driver.findElement(By.id("selenium_commands")));
        seleniumCommands.selectByIndex(3);

        //upload pictures ve download kismlarini bilmiyorum//


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();

        //driver.quit();


    }
}
