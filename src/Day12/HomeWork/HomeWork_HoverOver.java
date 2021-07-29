package Day12.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork_HoverOver {
    /*
    Navigate to https://www.myntra.com/
            Hover-over on 'KIDS'
            Click on 'Nike'
            Verify the URL
------------------------------------------
            And hover over on BEAUTY
            Click on Lipstick
            Hover over on first element
            Click on 'WISHLIST' button
            Verify you see 'Login or SignUp' page

     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");

        // PART 1
        WebElement kids = driver.findElement(By.cssSelector("a[data-reactid='325']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(kids).perform();

        WebElement nike = driver.findElement(By.cssSelector("a[data-reactid='467']"));
        nike.click();

        String currentUrl = driver.getCurrentUrl();
        String expectedUrl = "https://www.myntra.com/kids?f=Brand%3ANike";

        if (currentUrl.equals(expectedUrl)){
            System.out.println("Success");
        }else {
            System.out.println("Fail!!!");
        }
    }
}
