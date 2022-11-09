package day03_webElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C05_noSuchElementExc {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

       // WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));//arama kutusu locator'ı
        List<WebElement> sonucWebelementListesi= driver.findElements(By.id("twotabsearchtextbox11"));
        System.out.println(sonucWebelementListesi.size());

        //mesela "twotabsearchtextbox11" gibi yazarsak
        //NoSuchElementExceptıon varsa locater da sorun vardır

        /*
        findElement ile locate edilen webelementlerde locater'da sorun olursa
        driver istenen webelementi bulamaz ve NoSuchelementException fırlatır

        Buna karsın findelements method'u ile locate edilen Liste
        locater hatali olsa bile exceptıon vermez
        bos bir List dondurur
         */

        //aramaKutusu.sendKeys("Nutella"); yukarıdaki // WEBElement aramakutu=driver..ile baglantılı

        driver.close();
    }
}
