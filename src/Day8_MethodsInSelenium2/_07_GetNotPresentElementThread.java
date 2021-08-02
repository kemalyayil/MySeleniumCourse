package Day8_MethodsInSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _07_GetNotPresentElementThread {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        String textStr = "";

        while (textStr.equals("")){
            try{
                textStr = driver.findElement(By.id("finish")).getText();
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        }

        System.out.println(textStr);


    }
}
