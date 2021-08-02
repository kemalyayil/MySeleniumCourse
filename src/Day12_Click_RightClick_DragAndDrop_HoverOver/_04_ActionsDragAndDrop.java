package Day12_Click_RightClick_DragAndDrop_HoverOver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _04_ActionsDragAndDrop {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");

        // tutup bi yere cekilen text ler de kullanilir bu metot

        Actions action = new Actions(driver);
        WebElement fiveThousandButton = driver.findElement(By.xpath("//li[@id='fourth']//a"));
        WebElement debitAmountTarget = driver.findElement(By.id("amt7"));

        action.dragAndDrop(fiveThousandButton,debitAmountTarget).perform();

        WebElement bankButton = driver.findElement(By.cssSelector("li[id='credit2']>a"));
        WebElement debitAccountTarget = driver.findElement(By.cssSelector("ol[id='bank']>li"));

        action.dragAndDrop(bankButton,debitAccountTarget).perform();







    }
}
