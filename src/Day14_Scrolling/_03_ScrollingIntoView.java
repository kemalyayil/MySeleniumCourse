package Day14_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_ScrollingIntoView {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.techno.study/");


        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement joinWebinar = driver.findElement(By.xpath("//a[text()='Join for free']"));

        // Bu sekilde sayfada bulunan nesneye nokta atisi ulasiyoruz.
        js.executeScript("arguments[0].scrollIntoView();",joinWebinar);
        joinWebinar.click();


    }
}
