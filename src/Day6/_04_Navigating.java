package Day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _04_Navigating {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // get medthod is navigating the web site and waiting till the desired site load fully.
        driver.get("https://www.seleniumeasy.com/test/");

        driver.get("https://www.google.com/");

        // bu method sayfanin hepsini yuklemesini beklemiyor
        //driver.navigate().to("https://www.google.com/");

        driver.navigate().back();       // bu da previous page e geri donuyor

        driver.navigate().forward();    //  bu da usttekinin tersi

        driver.navigate().refresh();    // bu da sayfayi yeniler

    }
}
