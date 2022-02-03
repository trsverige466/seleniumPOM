package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
    //amazona git
    // arama kutusuna nutella yazip aratam
    // arama sonuclarinin nutella icerdigini test edem

    //POM de farkli class lara farkli sekilde ulasilmasi benimsenmistir
    //Driver clasi ici static tontem kullaniyoruz
    //page class lari icin ise obje uzerinden kullanilmasi tercih edilir
    @Test
    public void test01(){
        //amazona git
        Driver.getDriver().get("https://www.amazon.com");
        // arama kutusuna nutella yazip aratam

        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("Nutella"+ Keys.ENTER);

        // arama sonuclarinin nutella icerdigini test edem

    }
}
