package Day12_Click_RightClick_DragAndDrop_HoverOver.HomeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HomeWork_HoverOver2 {
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


        // PART 2
        WebElement beauty = driver.findElement(By.cssSelector("a[data-reactid='614']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(beauty).perform();

        WebElement lipstick = driver.findElement(By.cssSelector("a[data-reactid='623']"));
        lipstick.click();


        WebElement bobbyBrown = driver.findElement(By.cssSelector("div > div> picture > :nth-child(1)"));
        Actions actionC = new Actions(driver);
        actionC.moveToElement(bobbyBrown).perform();

        WebElement wishList = driver.findElement(By.xpath("//*[text()='wishlist']"));
        wishList.click();

        WebElement login = driver.findElement(By.cssSelector("div[class='welcome-header']"));

        if (login.getText().equals("Login or Signup")){
            System.out.println("Success!");
        }else {
            System.out.println("Failure!");
        }


        driver.quit();

    }
}
