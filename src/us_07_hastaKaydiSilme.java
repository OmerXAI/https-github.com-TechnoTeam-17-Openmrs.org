import Utility.BaseDriver;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class us_07_hastaKaydiSilme extends BaseDriver {


    @Test
    public void HastaSilme(){
        mrs_elements elemans= new mrs_elements();

        WebElement FindPatientRecord=
                driver.findElement(By.xpath("//*[@id=\"coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension\"]"));

        FindPatientRecord.click();
        MyFunc.Bekle(2);

        WebElement searchBox= driver.findElement(By.id("patient-search"));
        searchBox.sendKeys("100M08");
        MyFunc.Bekle(3);


        WebElement PatientName= driver.findElement(By.xpath("//*[@id=\"patient-search-results-table\"]/tbody"));
        PatientName.click();
        MyFunc.Bekle(2);

        WebElement DeletePatient= driver.findElement(By.xpath("//*[@id=\"org.openmrs.module.coreapps.deletePatient\"]/div/div[2]"));
        DeletePatient.click();
        MyFunc.Bekle(2);

        WebElement Reason=driver.findElement(By.id("delete-reason"));
        Reason.sendKeys("YES");
        MyFunc.Bekle(2);

        WebElement CONFIRM=driver.findElement(By.xpath("//*[@id=\"delete-patient-creation-dialog\"]/div[2]/button[1]"));
        CONFIRM.click();

        MyFunc.Bekle(4);
        driver.quit();

    }




}
