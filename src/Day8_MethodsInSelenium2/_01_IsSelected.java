package Day8_MethodsInSelenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_IsSelected {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");

        WebElement isAgeSelected = driver.findElement(By.id("isAgeSelected"));
        boolean beforeClicking = isAgeSelected.isSelected();// will return false

        Thread.sleep(3000);
        isAgeSelected.click();
        Thread.sleep(3000);

        boolean afterClicking = isAgeSelected.isSelected();// will return true

        System.out.println("Checkbox before clicking = " + beforeClicking);
        System.out.println("Checkbox after clicking  = " + afterClicking);
        driver.quit();


    }
}
