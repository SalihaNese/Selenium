package day04_xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Xpath {
    public static void main(String[] args) {

                //1-C01_TekrarTesti isimli bir class olusturun
                //2- https://www.amazon.com/ adresine gidin
                //3- Browseri tam sayfa yapin
                //4-Sayfayi “refresh” yapin
                // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
                // 6- Gift Cards sekmesine basin
                // 7- Birthday butonuna basin
                //8- Best Seller bolumunden ilk urunu tiklayin
                //9- Gift card details’den 25 $’i  secin
                // 10-Urun ucretinin 25$ oldugunu test edin
                // 11-Sayfayi kapatin


        //1-C01_TekrarTesti isimli bir class olusturun
        //2- https://www.amazon.com/ adresine gidin
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        //3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        //4-Sayfayi “refresh” yapin
        driver.navigate().refresh();
       // 5- Sayfa basliginin “Spend less” ifadesi icerdigini test edin
        String actualTitle= driver.getTitle();
        String arananMetin="Spend less";
        if (actualTitle.contains(arananMetin)){
            System.out.println("Title aranan metni iceriyor,test PASSED");
        }else {
            System.out.println("Title aranan metni icermiyor,test FAİLED");
        }
       // 6- Gift Cards sekmesine basin
        driver.findElement(By.linkText("Gift Card")).click();
       // 7- Birthday butonuna basin
        driver.findElement(By.xpath("//img[@alt=‘Birthday gift cards’]")).click();
        //8- Best Seller bolumunden ilk urunu tiklayin
        driver.findElement(By.xpath("(//img[@alt=‘Amazon.com eGift Card’])[1]")).click();
        //9- Gift card details’den 25 $’i  secin
        driver.findElement(By.xpath("//button[@value=‘25’]")).click();
       // 10-Urun ucretinin 25$ oldugunu test edin
        WebElement ucretelementi=driver.findElement(By.xpath("\"//span[@class='a-color-price a-text-bold']\""));
        String actualucretStr=ucretelementi.getText();
        String expectedUcretStr="25$";

        if (actualucretStr.contains(expectedUcretStr)){
            System.out.println("Gift card test PASSED");
        }else {
            System.out.println("Gift card fiyati farkli,test FAİLED");
        }
       // 11-Sayfayi kapatin
        driver.close();

    }
}
