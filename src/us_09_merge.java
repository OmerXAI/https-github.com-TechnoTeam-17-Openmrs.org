import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
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

        WebElement dataManagementButton = driver.findElement(By.xpath("//a[@id='coreapps-datamanagement-homepageLink-coreapps-datamanagement-homepageLink-extension']"));
        dataManagementButton.click();

        wait.until(ExpectedConditions.urlToBe("https://demo.openmrs.org/openmrs/coreapps/datamanagement/dataManagement.page"));


        // Merge Patient webelementi oluşturuluyor ve tıklanıyor.

        WebElement mergePatientButton = driver.findElement(By.xpath("//a[@id='coreapps-mergePatientsHomepageLink-app']"));
        mergePatientButton.click();


        //  Patient ID'leri Stringlere atanıyor

        String partient1 = "100L25";
        String partient2 = "100M40";


        // 1. ve 2. hastaya değerler sendkey ediliyor. Sonrasın Robot kullanarak Continue butonunun aktif olması amaçlandı
        // Bu sayede buton HTML de görünüyor. Aksi halde görünmüyor bulunamıyor.

        WebElement _1stPatientField = driver.findElement(By.xpath("//*[@id='patient1-text']"));
        _1stPatientField.sendKeys(partient1);

        WebElement _2ndPatientField = driver.findElement(By.xpath("//*[@id='patient2-text']"));
        _2ndPatientField.sendKeys(partient2);

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

        boolean bulundurMu = MyFunc.listContainsString(patientsIDsList, partient1);

        Assert.assertTrue(bulundurMu, "Birleştirilen IDler arasında gönderdiğiniz ID Bulunamadı");


    }


}
