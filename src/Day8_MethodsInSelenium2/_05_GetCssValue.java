package Day8_MethodsInSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _05_GetCssValue {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_controls");

        WebElement button = driver.findElement(By.cssSelector("#input-example>button"));

        String background = button.getCssValue("background-color");     // enable butonu nun background rengi
        String textAlign = button.getCssValue("text-align");            // enable butonu nun ...


        System.out.println(background);
        System.out.println(textAlign);
        driver.quit();
    }
}
