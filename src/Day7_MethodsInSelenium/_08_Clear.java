package Day7_MethodsInSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _08_Clear {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(2000);

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement inputMessage = driver.findElement(By.cssSelector("input[id=user-message]"));
        inputMessage.sendKeys("Hello");

        Thread.sleep(3000);

        inputMessage.clear();               // line 20 de yazdirdigimiz hello yu silmeye yariyor. ve line 27 de hola yazdirdik
        Thread.sleep(3000);

        inputMessage.sendKeys("Hola!");

        driver.quit();


    }
}
