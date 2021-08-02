package Day11_Xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _001_XpathTextSelector_KendinCalis {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

        WebElement firstName = driver.findElement(By.xpath("//label[text()='First Name']"));
        System.out.println(firstName.getText());



    }
}
