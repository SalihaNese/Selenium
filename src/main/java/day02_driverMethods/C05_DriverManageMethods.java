package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_DriverManageMethods {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        /*
        waits konusu daha genis anlatilacak
        Implicitly wait driver'in aradigi elementleri bulabilmesi icin
        kendisine verdigimiz arastirma suresidir.
        o sure icerisinde aradıgı elementi bulamazsa hata verir

         */

        driver.manage().window().fullscreen();

        System.out.println("fullscreen position"+driver.manage().window().getPosition());
        System.out.println("fullscreen size"+driver.manage().window().getSize());

        Thread.sleep(2000);

        driver.manage().window().maximize();

        System.out.println("minimize position"+driver.manage().window().getPosition());
        System.out.println(driver.manage().window().getPosition());


    }
}
