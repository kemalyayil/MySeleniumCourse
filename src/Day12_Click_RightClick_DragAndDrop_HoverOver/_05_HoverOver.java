package Day12_Click_RightClick_DragAndDrop_HoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _05_HoverOver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        // bu method mouse gezdiginde aktiflesen menulerin gorunmesi icin kullanilir.

        WebElement homeAndLiving = driver.findElement(By.xpath("//a[@data-index=3]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(homeAndLiving).perform();

        WebElement plantAndPlanters = driver.findElement(By.xpath("//a[contains(text(),'Plants')]"));
        plantAndPlanters.click();

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.myntra.com/artificial-flowers-and-plants-planters";

        if (currentUrl.equals(expectedUrl)){
            System.out.println("Success");
        }else {
            System.out.println("Fail!!!");
        }


    }
}
