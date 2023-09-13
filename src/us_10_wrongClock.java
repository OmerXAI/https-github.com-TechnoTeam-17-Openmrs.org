import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class us_10_wrongClock extends BaseDriver {
    @Test
    public void test() {

        mrs_elements elemans = new mrs_elements();
        Actions aksiyonlar = new Actions(driver);
      //  login();
        elemans.app.click();
        MyFunc.Bekle(3);

        Action aksiyon = aksiyonlar.moveToElement(elemans.app2).click().build();
        aksiyon.perform();
        MyFunc.Bekle(3);

        elemans.app3.sendKeys("100JEG");
        MyFunc.Bekle(3);

        Action aksiyon3 = aksiyonlar.moveToElement(elemans.patientId).click().build();
        aksiyon3.perform();
        MyFunc.Bekle(5);

        System.out.println("hata = " + elemans.hata.getText());

        Assert.assertTrue(elemans.hata.getText().startsWith(" Your comp"), " HATA mesaji olusmadi");

    }
}
