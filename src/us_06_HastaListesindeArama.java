import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class us_06_HastaListesindeArama extends BaseDriver {

    @Test
    public void Test(){


        WebElement findPatient=driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"));
        findPatient.click();
        MyFunc.Bekle(2);
        WebElement patientID=driver.findElement(By.xpath("//input[@class='form-control']"));
        patientID.sendKeys("100TLU");

        WebElement clickPatient=driver.findElement(By.xpath("//tbody[@role='alert']"));
        MyFunc.Bekle(2);
        clickPatient.click();

        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 500);");

        WebElement allergia=driver.findElement(By.xpath("//i[@id='allergyui-editAllergies']"));
        allergia.click();

        WebElement addAllergia=driver.findElement(By.xpath("//button[@id='allergyui-addNewAllergy']"));
        addAllergia.click();

        // WebElement drug=driver.findElement(By.xpath("//label[@class='button small ng-untouched ng-valid ng-not-empty ng-dirty active ng-valid-parse confirm']"));
        // drug.click();
        // WebElement aspirin=driver.findElement(By.xpath("//input[@id='allergen-71617']"));
        //aspirin.click();

        WebElement home=driver.findElement(By.xpath("//i[@class='icon-home small']"));
        home.click();


        WebElement findPatient1=driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension"));
        findPatient1.click();

        WebElement wrongPatient=driver.findElement(By.xpath("//input[@id='patient-search']"));
        wrongPatient.sendKeys("Aygul Abilova");


        MyFunc.Bekle(4);
        driver.quit();









    }
}

