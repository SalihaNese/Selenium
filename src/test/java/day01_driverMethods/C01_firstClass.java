package day01_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_firstClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.com");

        /*
        1 - Selenium sitesinden bilgisayarın işletim sistemine uygun dosyaları indir.
            Masaüstünde oluşturacağımız bir klasöre indirdiğimiz zip dosyalarını aç/çıkar
        2 - Selenium sitesinde browsers sekmesinde bilgisayarınıza uygun driver'ı indir
            (biz chrome seçtik), zip dosyalarını masaüstüne çıkar
        3 - Selenium sitesinden indirilen chrome sürümü ile pc'deki chrome browser sürümünün aynı
            olduğundan emin olun, aynı değilse update edin.
        4 - yeni bir proje oluşturun, proje oluşturma aşamasında build system olarak maven'i seçin
        5 - src altında resources klasörü oluşturun, bu klasörün içine indirip masaüstüne açtığımız
            selenium klasörü ve chromedriver dosyalarını taşıyın.
        6 - File/project structure menüsünden modules ve dependency seçip + tuşuna basıp
            projeye eklediğimiz selenium klasörü içerisindeki tüm jar dosyalarını seçip apply ve
            ok tuşuna basın.
        7 - src/main/java altında bir class oluşturun
        8 - class'da main metod oluşturup yukarıdaki kodları yazin.

        .NOT : 9. satırdaki 2. parametre windows ve mac icin farklıdır
        .
        .

         */

    }
}
