package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class _03_SwitchingMultipleWindows {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        String originalWindowHandle = driver.getWindowHandle();

        List<WebElement> links = driver.findElements(By.xpath("//a[@target='_blank']"));

        List <String> orderedWindowHandles = new ArrayList<>();
        orderedWindowHandles.add(originalWindowHandle);

        for (WebElement link : links){
            link.click();           // clicking on linkS.each link...

            Set<String>allWindowHandles = driver.getWindowHandles();

            for (String handle : allWindowHandles){
                if (!orderedWindowHandles.contains(handle))
                    orderedWindowHandles.add(handle);       //Bu kismi ogren

            }
        }

        driver.switchTo().window(orderedWindowHandles.get(1));

    }
}
