package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_driverGetMethodlari {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver=new ChromeDriver();


        System.out.println(driver.getWindowHandle());
        // bize
        // CDwindow-AF9A47DFCE460062F99F3A684E826567

        driver.getWindowHandles();
        /*
        Eger testimiz sirasinda birden fazla window acilirsa
        acılan
         */

        driver.get("https://www.amazon.com");

        System.out.println(driver.getPageSource());
        // websayfasinin tum kaynak kodlarini

        driver.close();
    }
}
