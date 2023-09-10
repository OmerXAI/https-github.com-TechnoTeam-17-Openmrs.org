import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class us_04_patientRegistration extends BaseDriver {
    @Test
    public void registrationTest(){

    driver.get("https://demo.openmrs.org/openmrs/login.htm");

    List<WebElement> locations=driver.findElements(By.xpath("//ul[@class='select']//li"));

    int randomSecim= MyFunc.randomGenerator(locations.size());//random bir sayi uretildi

        String locationAdi=locations.get(randomSecim).getText();//randomdaki locationin adi alindi
        System.out.println("Lokasyon = " + locationAdi);//kontrol icin yazildi
        locations.get(randomSecim).click();

        mrs_elements elemans=new mrs_elements();
        elemans.name.sendKeys("Admin");
        MyFunc.Bekle(1);

        elemans.pass.sendKeys("Admin123");
        MyFunc.Bekle(1);

        elemans.loginbut.click();

        elemans.patientRegistarion.click();
        elemans.nameReg.sendKeys("Patient");
        elemans.familyNameReg.sendKeys("Abc");
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





}}
