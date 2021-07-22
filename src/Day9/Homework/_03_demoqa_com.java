package Day9.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _03_demoqa_com {
    public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://demoqa.com/automation-practice-form");

            driver.manage().window().maximize();

        WebElement firstName = driver.findElement(By.id("firstName"));
        firstName.sendKeys("Kemal");

        WebElement lastName = driver.findElement(By.id("lastName"));
        lastName.sendKeys("Yayil");

        WebElement email = driver.findElement(By.cssSelector("input[id='userEmail']"));
        email.sendKeys("kashgaf@hakkibulut.com");

        WebElement genderMale = driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
        genderMale.click();

        WebElement mobileNumber= driver.findElement(By.cssSelector("input[id='userNumber']"));
        mobileNumber.sendKeys("12134449986");

        WebElement dobClick = driver.findElement(By.id("dateOfBirthInput"));
        dobClick.click();

        Select dobMonth = new Select(driver.findElement(By.cssSelector("select[class='react-datepicker__month-select']")));
        dobMonth.selectByValue("4");

        Select dobYear = new Select(driver.findElement(By.cssSelector("select[class='react-datepicker__year-select']")));
        dobYear.selectByVisibleText("1990");

        WebElement dobDay = driver.findElement(By.cssSelector("div[class='react-datepicker__day react-datepicker__day--010']"));
        dobDay.click();

//        Select subject = new Select(driver.findElement(By.cssSelector("css-12jo7m5 subjects-auto-complete__multi-value__label")));
//        subject.selectByVisibleText("English");  // bu kismi bilemedim



//        WebElement hobbies = driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
//        hobbies.click();                          // bu kismi bilemedim


        WebElement currentAddress = driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Buenos Aires/Argentina");



//        driver.findElement(By.cssSelector("div[class=' css-1wa3eu0-placeholder']"));
//        List<WebElement>stateOptions = driver.findElements(By.cssSelector("div[class=' css-1wa3eu0-placeholder']"));
//        for (int i = 0; i < stateOptions.size();i++){
//            if (stateOptions.get(i).getText().equals("Haryana")){
//                stateOptions.get(i).click();
//                break;
//            }
//        }


        WebElement submitButton = driver.findElement(By.id("submit"));
        submitButton.click();
    }
}
