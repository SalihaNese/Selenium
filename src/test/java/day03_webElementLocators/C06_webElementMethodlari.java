package day03_webElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C06_webElementMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com");
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));

        aramaKutusu.sendKeys("Nutella");
        aramaKutusu.clear();// webelement uzerşndeki yazıyı siler yani nutellayı siler java yazar

        aramaKutusu.sendKeys("Java");

        System.out.println(aramaKutusu.getSize()); // (633, 38)
        System.out.println(aramaKutusu.getTagName()); // input
        System.out.println(aramaKutusu.getAttribute("name"));// field-keywords
        aramaKutusu.getRect().getX();

        System.out.println(aramaKutusu.isDisplayed());// true
        // arama kutusu gorunuyor mu der

        System.out.println(aramaKutusu.isEnabled());// true
        // arama kutusunu kullanabiliyor muyum demek

        aramaKutusu.isSelected(); // radyo butonu ve checkt box 'da kullanılır


        driver.close();

    }
}
