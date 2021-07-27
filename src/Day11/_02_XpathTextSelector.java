package Day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_XpathTextSelector {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

        // locating element with their text
        WebElement firstName = driver.findElement(By.xpath("//label[text()='First Name']"));
        System.out.println(firstName.getText());

        WebElement lastName = driver.findElement(By.xpath("//label[text()='Last Name']"));
        System.out.println(lastName.getText());

        // locating element using contains method
        WebElement zipCode = driver.findElement(By.xpath("//input[contains(@name,'zip')]"));

        WebElement zipTitle = driver.findElement(By.xpath("//label[contains(text(),'Zip')]"));


    }
}
