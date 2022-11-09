package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_ilkTest {

    public static void main(String[] args) {

        /*
        gerekli ayarlamalari yapip amazon ana sayfaya gidin
        1- sayfa baslıgı "amazon" kelimesi icermeli
        2- sayfa url2inde "Amazon" kelimesi olmali
         */

        // once ayarları yapalım
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");//driverın yolunu yaptık
        WebDriver driver=new ChromeDriver();

        driver.get("https:/www.amazon.com");

        String expectedTitlrIcerik="amazon";
        String expectedurlIcerik="Amazon";

        String actualUrl=driver.getCurrentUrl();
        String actualTitle=driver.getTitle();

            // url test yapalım
        if (actualUrl.contains(expectedurlIcerik)){
            System.out.println("Url test PASSED");
        }else {
            System.out.println("Url test FAİLED");
            System.out.println("actual Url :" + actualUrl);

        }

        // title test

        if (actualTitle.contains(expectedTitlrIcerik)){
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title testi FAİLED");
            System.out.println("actual Title :" + actualTitle);
        }

        driver.quit();

    }
}
