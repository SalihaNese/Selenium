package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_driverMethods {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        // driver objesi olusturunca selenium webdriver
        // bilgisayarımızdaki chrome browser'dan bos sayfa actirir
        // eger firefax veya safari gibi baska bir brwser kullanmak istersek
        // Selenium sitesinden o browser'in WebDriver'ini indirip projemize eklememiz gerekir

        driver.get("https:/amazon.com");

        // eger kodlarimizi belirli bir sure bekletmek icin
        Thread.sleep(5000);// yazilan mili saniye kadar kodlari bekletir

        driver.close();

        System.out.println("sayfa url'i" +driver.getCurrentUrl());

        System.out.println("Sayfa'nin title'i"+driver.getTitle());



    }
}
