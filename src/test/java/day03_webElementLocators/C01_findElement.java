package day03_webElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_findElement {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

        // Bir web sitesinde herhangi bir web elementi kullanabilmek icin
        // o web elementi kodlarimiza tanitmamiz gerekir

        //WebElement amazonAramaKutusu = driver.findElement(By.id("twotabsearchtexbox"));
        WebElement amazonAramaKutusu= driver.findElement(By.name("field-keywords"));
        amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);



        amazonAramaKutusu.sendKeys("Nutella" + Keys.ENTER);

        Thread.sleep(50000);

        driver.close();

        /*

        Selenium'da  8 adet Locator vardır
        bunlardan 6 tanesi HTML uzerindeki tag veya attribute'lere goredir.
        2 tanesi ise daha spesifik olarak, ilk 6 tane locator ile bulamadıgımız
        webElementleri locate etmek için kullanılır

          1- By.id
          id genelde unique verilir
          dolayisiyla bir HTML elementde id varsa once By.id denebilir

          2- className
              class attribute'u genelde ayni islevi yapan webelementleri gruplandirmak icin kullanilir
             bu gruplandirmalar sayesinde css ile gruptaki tum webElementler tek yerden sekillendirilebilir
             class attribute'u kullanilirken eger class value'u space iceriyorsa,
             classname ile yapilan locate'ler hata verebilir

             genellikle classname ile yapilan locate'ler birden fazla webelement dondureceginden
             List<WebElement> seklinde olusturacagimiz bir List'e kaydolur

          3- name
            eger HTML kosunda name attribute varsa kullanilabilir

          4- tagname
            tagname de classname gibi gruplandirmalar icin kullanilir
            dolayısıyla tagname ile genelde bir element degil
              benzer ozelliklerdeki bir listeye ulasilir

          5- LinkText
            sadece Link'ler icin kullanılır
            her link HTML elementinin uzerinde bir link yazisi olur
              bu yazi genelde kullanicinin front-end'de gortdugu yazi ile aynidir
              ncak bazen space gibi farkedemeyecegimiz eklemeler olabilir
              locate ederken linktext kullanilirsa, link yazisinin tamami kullanilmalidir
              (varsa bosluk vb... locate alinirken yazilmalidir"

          6- partialLinkText
              linktext gibi sadece linkler icin kullanilir
              linktext'den farki, tum yaziyi degil parcasini kullanmamizin da yeterli olmasidir.

         */
    }
}
