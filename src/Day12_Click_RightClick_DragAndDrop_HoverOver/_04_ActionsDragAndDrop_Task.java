package Day12_Click_RightClick_DragAndDrop_HoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsDragAndDrop_Task {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");


        Actions action = new Actions(driver);
        WebElement sales = driver.findElement(By.id("credit1"));
        WebElement creditSideTarget = driver.findElement(By.id("loan"));
        action.dragAndDrop(sales,creditSideTarget).perform();



        WebElement fiveThousandButton = driver.findElement(By.xpath("//li[@id='fourth']//a"));
        WebElement creditAmountTarget = driver.findElement(By.id("amt8"));
        action.dragAndDrop(fiveThousandButton,creditAmountTarget).perform();















    }
}
