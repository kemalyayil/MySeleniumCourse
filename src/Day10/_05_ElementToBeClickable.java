package Day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _05_ElementToBeClickable {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");

        WebDriverWait wait = new WebDriverWait(driver, 10);

        Thread.sleep(4000);

        driver.findElement(By.id("at-cv-lightbox-close")).click();

        WebElement inputForms = driver.findElement(By.cssSelector("#treemenu ul>li:first-child"));
        wait.until(ExpectedConditions.elementToBeClickable(inputForms));
        inputForms.click();

        driver.quit();





//        WebDriverWait wait = new WebDriverWait(driver,10);
//
//        driver.findElement(By.cssSelector("a[class='dropdown-toggle active'")).click();
//        WebElement seleniumWithJava = driver.findElement(By.cssSelector("li[class=expanded active dropdown open]"));
//        wait.until(ExpectedConditions.elementToBeClickable(seleniumWithJava));
//        seleniumWithJava.click();




    }
}
