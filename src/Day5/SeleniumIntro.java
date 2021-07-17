package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntro {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techno.study/");      // bu kisim olmazsa yeni bos bi browser aciyor

        driver.manage().window().maximize();        // bu actigin sayfayi maximize yapiyor.
        //driver.manage().window().fullscreen();        // bu actigin sayfayi full screen yapiyor.


        WebElement element = driver.findElement(By.cssSelector("div[class= 'tatsu-inline-text-inner tatsu-align-center']>h1"));
        String text = element.getText();
        System.out.println(text);               //System.out.println( element.getText());     // bunu yaptiktan sonra site de olan text asagida yazdirildi
        //driver.quit();                          // it will quit the browser




    }
}
