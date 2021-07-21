package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_SendKeys {             // bu method dedigimiz yazilari istedigimiz yere yazar
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(3000);

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        String message = "Hello World!";

        WebElement userInput = driver.findElement(By.id("user-message"));
        userInput.sendKeys(message);


        WebElement showMessageButton = driver.findElement(By.cssSelector("button[class='btn btn-default']"));
        showMessageButton.click();

        WebElement displayMessage = driver.findElement(By.id("display"));
        String displayText = displayMessage.getText();

        if (message.equals(displayText)){
            System.out.println("Success");
        } else {
            System.out.println("Failure");
        }

        driver.quit();
    }
}
