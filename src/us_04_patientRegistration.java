import Utility.BaseDriver;
import Utility.BaseDriverParameter;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;
import java.util.List;

public class us_04_patientRegistration extends BaseDriver {


    //us09 ile beraber us_09_merge dosyasinda calisiyor
    public static String registrationTest() {

        WebElement loginLokasyonSecimi = driver.findElement(By.xpath("//span[@id='selected-location']"));
        loginLokasyonSecimi.click();

        MyFunc.Bekle(5);


        List<WebElement> loginLokasyonSecimiList = driver.findElements(By.xpath(" //div[@id='session-location'] //ul //child::li"));
        for (WebElement element : loginLokasyonSecimiList) {
            System.out.print(element.getText()); // WebElement'in içeriğini yazdırır
        }

        int randomSecim = MyFunc.randomGenerator(loginLokasyonSecimiList.size());
        System.out.println("randomSecim = " + randomSecim);//random bir sayi uretildi
        String locationAdi = loginLokasyonSecimiList.get(randomSecim).getText();//randomdaki locationin adi alindi

        System.out.println("Lokasyon = " + locationAdi);//kontrol icin yazildi
        loginLokasyonSecimiList.get(randomSecim).click();

        mrs_elements elemans = new mrs_elements();

        elemans.patientRegistarion.click();
        String patientName="Patient";
        elemans.nameReg.sendKeys(patientName);
        String patientLastName="Abc";
        elemans.familyNameReg.sendKeys(patientLastName);
        MyFunc.Bekle(1);
        elemans.nextReg.click();
        elemans.female.click();
        elemans.nextReg.click();
        elemans.birthDay.sendKeys("01");
        elemans.birthMonth.click();
        elemans.birthMonth.click();
        elemans.january.click();
        MyFunc.Bekle(1);
        elemans.birthYear.sendKeys("1980");
        MyFunc.Bekle(1);
        elemans.nextReg.click();
        elemans.address.sendKeys("Kadikoy");
        elemans.city.sendKeys("Istanbul");
        MyFunc.Bekle(1);
        elemans.country.sendKeys("Turkey");
        elemans.nextReg.click();
        elemans.phone.sendKeys("05449876543");
        MyFunc.Bekle(1);
        elemans.nextReg.click();
        elemans.relationship.click();
        elemans.relationship.click();
        MyFunc.Bekle(1);
        elemans.parent.click();
        MyFunc.Bekle(1);
        elemans.personName.sendKeys("Parent A");
        MyFunc.Bekle(1);
        elemans.confirm.click();
        MyFunc.Bekle(1);
        elemans.finalConfirm.click();


        WebElement patientID= driver.findElement(By.cssSelector("div[class='float-sm-right'] span"));

        String patient=patientID.getText();

        String isim1=elemans.registeredName.getText();
        String isim2=elemans.registeredFamilyName.getText();


        Assert.assertTrue(isim1.contains(patientName), " Bulunamadı");
        Assert.assertTrue(isim2.contains(patientLastName), " Bulunamadı");


        return patient;


    }
}
