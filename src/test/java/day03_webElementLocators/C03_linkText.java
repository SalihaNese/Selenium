package day03_webElementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C03_linkText {

    public static void main(String[] args) throws InterruptedException {
        // once ayarlamaları yapıyoruz.Burası string oldugu icin hassasdir
        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.get("https://www.amazon.com");

       // List<WebElement> customerServiceList=driver.findElements(By.linkText("Customer Service"));
        // Bir tane buldugu icin findElements yapmadık

        WebElement customerServiceElementi=driver.findElement(By.linkText("Customer Service"));

       // System.out.println(customerServiceElementi);

        customerServiceElementi.click();

        Thread.sleep(3000);

        driver.close();
    }
}
