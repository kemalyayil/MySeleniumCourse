package Day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_SendKeysTASK {             // bu method dedigimiz yazilari istedigimiz yere yazar
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        Thread.sleep(3000);

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        String message1 = "10";

        WebElement userInput1 = driver.findElement(By.id("sum1"));
        userInput1.sendKeys(message1);
        Thread.sleep(2000);

        String message2 = "20";

        WebElement userInput2 = driver.findElement(By.id("sum2"));
        userInput2.sendKeys(message2);
        Thread.sleep(2000);

        WebElement showMessageButton = driver.findElement(By.cssSelector("button[onclick='return total']"));
        showMessageButton.click();

//        WebElement displayMessage = driver.findElement(By.id("display"));
//        String displayText = displayMessage.getText();

//        if (message.equals(displayText)){
//            System.out.println("Success");
//        } else {
//            System.out.println("Failure");
//        }
//
//        driver.quit();
    }
}
