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

        login();

        Actions aksiyonlar = new Actions(driver);
        WebElement myacc= driver.findElement(By.xpath("//*[@class='icon-user small']"));
        Action aksiyon = aksiyonlar.moveToElement(myacc).click().build();
        aksiyon.perform();

        MyFunc.Bekle(3);
        WebElement myacc2= driver.findElement(By.xpath("//*[@href='/openmrs/adminui/myaccount/myAccount.page']"));
        Action aksiyon2 = aksiyonlar.click(myacc2).click().build();
        aksiyon2.perform();

        MyFunc.Bekle(2);
        List<WebElement> captions = driver.findElements
                (By.xpath("//*[@class='task']/text()"));

        MyFunc.Bekle(2);
        for (WebElement e : captions) {
           System.out.println("e.getText() = " + e.getText());}



    }

}
