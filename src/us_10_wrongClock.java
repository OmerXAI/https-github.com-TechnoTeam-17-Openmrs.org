import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class us_10_wrongClock extends BaseDriver {
    @Test
    public void test(){

        mrs_elements elemans=new mrs_elements();

        elemans.app.click();
        MyFunc.Bekle(3);
        elemans.app2.click();
        MyFunc.Bekle(3);
        elemans.app3.sendKeys("Nergis hnm dan gelecek bilgiler");


    }
}
