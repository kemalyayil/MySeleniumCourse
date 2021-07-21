package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_GetNotPresentElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#input-example>button"));
        startButton.click();



        // no such element exception because element is not present in website yet
        WebElement text = driver.findElement(By.id("finish"));
        String textStr = text.getText();
        System.out.println(textStr);


    }
}
