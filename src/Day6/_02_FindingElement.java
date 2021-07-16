package Day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingElement {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\zeynep\\Google Drive\\Selenium\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.seleniumeasy.com/test/");


        //Finding element by ID
        WebElement closeIcon = driver.findElement(By.id("at-cv-lightbox-close"));     // css selector yazsaydik '#' yazip baslamaliydik. # demek Id demek. shortcut

        // thread yazmadan once sayfa acildiginda pop-up sonradan yuklendigi icin selenium bulamiyordu. asagida 2 sn bekle
        //  dedikten sonra pop-up yuklendi ve popup kapatildi

        Thread.sleep(2000);           // wait for 2 seconds-forcing selenium to wait
        closeIcon.click();                // bu da klik yapmaya yariyor

        WebElement startButton = driver.findElement(By.id("btn_basic_example"));
        String startButtonText = startButton.getText();
        System.out.println(startButtonText);
        startButton.click();


        WebElement menuListHeader = driver.findElement(By.className("panel-heading"));      // burda da by classname i kullandik
        String menuListText = menuListHeader.getText();
        System.out.println(menuListText);


        // element a tag ise linkText ve partialLinkText i kullanabiliriz to locate.
        WebElement inputFormsLink = driver.findElement(By.linkText("Input Forms"));
        String inputFromText = inputFormsLink.getText();
        System.out.println(inputFromText);

        WebElement startPractiseButton = driver.findElement(By.partialLinkText("Start Pra"));    // burada full linki yapistirmak zorunda deigiliz. bi kismi yeterli
                                        // sunun unutmamak lazim. yazdigimiz seyden sadece bi tane olmasi gerekiyor... Keys sensiteve ayrica

        String startText = startPractiseButton.getText();
        System.out.println(startText);

        WebElement randomH3 = driver.findElement(By.tagName("h3"));     // first h3 will be . birden fazla varsa herzaman ilk olani secer
        String randomText = randomH3.getText();
        System.out.println(randomText);

        // which locators you use ? sorusu interview ler de sorulabilir. yukardakiler cevap.
        // eger which one do you prefer to use diye sorulursaa, cevap ID ....

        WebElement startPractiseCss = driver.findElement(By.cssSelector("#btn_basic_example"));
        String startCss = startPractiseCss.getText();
        System.out.println(startCss);

        WebElement randomCss = driver.findElement(By.cssSelector(".head"));     // class name lerde dot operator kullaniyoruz
        String randomCssText = randomCss.getText();
        System.out.println(randomCssText);

        driver.quit();
    }
}
