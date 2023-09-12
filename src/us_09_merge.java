import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class us_09_merge extends BaseDriver {

    @Test
    public void us_09_merge() throws AWTException {


        // Data Management webelementi oluşturuluyor ve tıklanıyor. Sonraki sayfa url si görülüne kadar bekleniyor.


      //  registrationTest();
      //  registrationTest();

        String patient1 = registrationTest();
        driver.get("https://demo.openmrs.org/openmrs/index.htm");
        MyFunc.Bekle(2);
        String patient2 = registrationTest();
        driver.get("https://demo.openmrs.org/openmrs/index.htm");
        MyFunc.Bekle(2);




        WebElement dataManagementButton = driver.findElement(By.xpath("//a[@id='coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension']"));
        dataManagementButton.click();

        wait.until(ExpectedConditions.urlToBe("https://demo.openmrs.org/openmrs/coreapps/datamanagement/dataManagement.page"));


        // Merge Patient webelementi oluşturuluyor ve tıklanıyor.

        WebElement mergePatientButton = driver.findElement(By.xpath("//a[@id='coreapps-mergePatientsHomepageLink-app']"));
        mergePatientButton.click();


        //  Patient ID'leri Stringlere atanıyor

        // 1. ve 2. hastaya değerler sendkey ediliyor. Sonrasın Robot kullanarak Continue butonunun aktif olması amaçlandı
        // Bu sayede buton HTML de görünüyor. Aksi halde görünmüyor bulunamıyor.

        WebElement _1stPatientField = driver.findElement(By.xpath("//*[@id='patient1-text']"));
        _1stPatientField.sendKeys(patient1);

        WebElement _2ndPatientField = driver.findElement(By.xpath("//*[@id='patient2-text']"));
        _2ndPatientField.sendKeys(patient2);

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

        WebElement continueButton = driver.findElement(By.xpath("//input[@id='confirm-button']"));

        wait.until(ExpectedConditions.elementToBeClickable(continueButton));

        continueButton.click();


        // Sonraki sayfanın oluşması bekletiliyor. Ve sonrasında ilk hasta seçiliyor. Sonra geri dönülümez değişiklik yapılacaktır
        // uyarısı bekleniyor bir sonraki adımda.

        wait.until(ExpectedConditions.urlContains("https://demo.openmrs.org/openmrs/coreapps/datamanagement/mergePatients.page"));

        WebElement firstPatientToSelectForMerging = driver.findElement(By.xpath("//div[@id='first-patient']"));
        firstPatientToSelectForMerging.click();


        // Son Onay öncesi Mesaj içerisi kontrol ediliyor. Mesajın içiriğinde sorguladığımız uyarı var mı kontrol ediliyor.

        WebElement messageContent = driver.findElement(By.xpath("(//div[@class='messages-container'])[2]/h1"));
        messageContent.click();
        Assert.assertTrue(messageContent.getText().toLowerCase().contains("cannot be undone"));


        // Son Onay Yapılıyor.

        WebElement confirmButton = driver.findElement(By.xpath("//input[@id='confirm-button']"));
        confirmButton.click();


        // Birleştirilen ID'ler en son yönlendirilen hasta sayfasında List halinde toplanıyor

        List<WebElement> patientsIDsList = driver.findElements(By.cssSelector("div[class='float-sm-right'] span"));

        // İşlemini yaptığımız ID'lerden biri en son hasta sayfasındaki List içinde var mı kontrol ediliyor. Bunun için MyFunc daki
        // listContainsString fonksiyonu kullanılıyor. Bu boolean dönüyor. Bu değer başka bir boolean'a atanıyor. Bu da
        //  testng Assert yöntemi içinde kontrol ediliyor.

        boolean bulunduMu1 = MyFunc.listContainsString(patientsIDsList, patient1);
        boolean bulunduMu2 = MyFunc.listContainsString(patientsIDsList, patient2);


        Assert.assertTrue(bulunduMu1, "Birleştirilen IDler arasında gönderdiğiniz ID Bulunamadı");
        Assert.assertTrue(bulunduMu2, "Birleştirilen IDler arasında gönderdiğiniz ID Bulunamadı");


    }




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

        // List<WebElement> locations = driver.findElements(By.xpath("//ul[@class='select']//li"));

        // int randomSecim = MyFunc.randomGenerator(locations.size());//random bir sayi uretildi

        //  String locationAdi = locations.get(randomSecim).getText();//randomdaki locationin adi alindi
        System.out.println("Lokasyon = " + locationAdi);//kontrol icin yazildi
        loginLokasyonSecimiList.get(randomSecim).click();

        mrs_elements elemans = new mrs_elements();
        //  elemans.name.sendKeys("Admin");
        //  MyFunc.Bekle(1);
        //  elemans.pass.sendKeys("Admin123");
        //  MyFunc.Bekle(1);
        //  elemans.loginbut.click();
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



        WebElement patientID= driver.findElement(By.cssSelector("div[class='float-sm-right'] span"));

        String patient=patientID.getText();
        return patient;


    }


}
