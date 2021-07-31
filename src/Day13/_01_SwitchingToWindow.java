package Day13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class _01_SwitchingToWindow {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        //Get the original window handle (parent window handle) so we can switch back easily
        String originalWindowHandle = driver.getWindowHandle();         // bu single window u kontrol eder

        WebElement link = driver.findElement(By.xpath("(//a[@target='_blank'])[2]"));   // bunu yapinca yeni link aciliyor.
        //ama hala line 16 daki sitede kaliyor, yeni ye gecmiyor.
        link.click();

        //Get all the window handles using for-each loop switch to another window
        Set<String> windowHandles = driver.getWindowHandles();      // Bu ise yeni acilan link te gezinmeyi saglar. line 21 de girisini yaptik.
                                                                    // bu multiple window u kontrol eder

        for (String handle : windowHandles){
            driver.switchTo().window(handle);               // bu sekilde orjinal window dan yeni acilan window a geciyor
        }


        WebElement ourImpact = driver.findElement(By.xpath("//a[text()='Our Impact']"));
        ourImpact.click();



        //Bu orjinal sayfadaki logo. ama window yeni window a switch yaptigi icin bulamayacak ve hata verecek(no such element exception)
        // bu yuzden orijinal window a geri donmemiz lazim
//        WebElement seleniumLogo = driver.findElement(By.xpath("//img[@class='logo logo-small']"));
//        seleniumLogo.click();

        driver.switchTo().window(originalWindowHandle);         // bu sekilde orijinal sayfa ya geri donuyoruz.

        link.click();

        driver.quit();


        /*
        sonuc olarak; getWindowHandles ve getWindowHandle her ikisini de ayni sayfada kullanmak lazim. cunku
        orjinal sayfaya switch etmek istedgimizde getWindowHandle'i ilk olarak yazdigimiz icin
        orjinal sayfaya gecis yapabiliriz
         */





    }
}
