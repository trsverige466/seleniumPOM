package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AmazonPage {
   // bir page classi actigimizda ilk yapmamiz gereken sey
   // paramertresiz bir constructor olusturup
   // bu constructor icinde pageFactory ile driver a ilk deger atamasi yapilir

   public AmazonPage(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(id="twotabsearchtextbox")
    public WebElement amazonAramaKutusu;



}
