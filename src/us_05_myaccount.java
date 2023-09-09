import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class us_05_myaccount extends BaseDriver {
    @Test
    public void test1(){

        Actions aksiyonlar = new Actions(driver);// web sayfası aksiyonlara açıldı.

        WebElement myacc= driver.findElement(By.xpath("//*[@class='icon-user small']"));
        Action aksiyon = aksiyonlar.moveToElement(myacc).click().build();
        aksiyon.perform();

        WebElement myacc2= driver.findElement(By.xpath("//*[@href='/openmrs/adminui/myaccount/myAccount.page']"));
        Action aksiyon2 = aksiyonlar.click(myacc2).click().build();
        aksiyon2.perform();
        //*[@class='icon-lock']
        //*[@class='icon-cog']
      //  WebElement chng= driver.findElement(By.xpath("//*[@class='button app big']"));

    //    List<WebElement> butts = driver.findElements(By.xpath("//*[@class='button app big']"));
    //    System.out.println("butts = " + butts);
        MyFunc.Bekle(2);
        List<WebElement> captions = driver.findElements
                (By.xpath("//*[@class='task']/text()"));

        MyFunc.Bekle(2);
        for (WebElement e : captions) {
           System.out.println("e.getText() = " + e.);}
       // Assert.assertTrue(e.getText().contains(" Change Password "), "aranan kelime bulunamadı");
       Assert.assertFalse(captions., "My Languages  gözüktü ");

            //  chng.click();
      //  Action aksiyon3 = aksiyonlar.click(chng).click().build();
        //aksiyon2.perform();
      //  Assert.assertFalse(chng.isEnabled(), "Change Password gözüktü ");
      //  WebElement mylang= driver.findElement(By.xpath("//*[@class='icon-cog']"));
      //  Assert.assertFalse(mylang.isDisplayed(), "My Languages  gözüktü ");


    }

}
