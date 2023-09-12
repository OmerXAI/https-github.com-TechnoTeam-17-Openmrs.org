import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static javafx.scene.input.KeyCode.W;

public class US_06_HastaListesindeArama extends BaseDriver {

   @Test
    public void Test(){

       login();

       WebElement findPatient=driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"));
       findPatient.click();

       WebElement patientID=driver.findElement(By.xpath("//input[@class='form-control']"));
       patientID.sendKeys("10010W");

       WebElement clickPatient=driver.findElement(By.xpath("//tbody[@role='alert']"));
       clickPatient.click();


       WebElement allergia=driver.findElement(By.id("allergyui-editAllergies"));
       allergia.click();

       //button[@id='allergyui-addNewAllergy']
    }
}
