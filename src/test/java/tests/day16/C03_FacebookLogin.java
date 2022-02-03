package tests.day16;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C03_FacebookLogin {
    //1 - https://www.facebook.com/ adresine gidin
    //2- POM'a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin
    //3- Faker class'ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
    //4- Basarili giris yapilamadigini test edin

    @Test
    public void test01() throws InterruptedException {
        //1 - https://www.facebook.com/ adresine gidin
        Driver.getDriver().get("https://www.facebook.com/");
        //2- POM'a uygun olarak email, sifre kutularini ve giris yap butonunu locate edin

        //3- Faker class'ini kullanarak email ve sifre degerlerini yazdirip, giris butonuna basin
        Faker faker=new Faker();


        //4- Basarili giris yapilamadigini test edin
        Thread.sleep(5000);
        Driver.closeDriver();
    }
}
