package Day14_Scrolling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_ScrollingInsideElement {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://ressio.github.io/lazy-load-xt/demo/horizontal.htm");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement menu= driver.findElement(By.className("wrapper"));

        // Menu yu yana kaydirdi 1000px.
        // Will scroll horizontally inside menu element by 1000 px
        js.executeScript("arguments[0].scrollBy(1000,0);",menu);



    }
}
