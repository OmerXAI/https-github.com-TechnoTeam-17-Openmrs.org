import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Collection;
import java.util.List;

public class us_05_myaccount extends BaseDriver {
    @Test
    public void test1() {


        mrs_elements elemans=new mrs_elements();
        Actions aksiyonlar = new Actions(driver);

        Action aksiyon = aksiyonlar.moveToElement(elemans.myacc).click().build();
        aksiyon.perform();

        MyFunc.Bekle(2);

        Action aksiyon2 = aksiyonlar.click(elemans.myacc2).click().build();
        aksiyon2.perform();

        MyFunc.Bekle(2);

        Assert.assertTrue(elemans.cap1.isDisplayed(), " Change Password butonu olusmadi");

        Assert.assertTrue(elemans.cap2.isDisplayed(), "  My Languages  butonu olusmadi");

        MyFunc.Bekle(4);
        driver.quit();
    }
    }


