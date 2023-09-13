import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class _OpenMrs extends BaseDriver {
    _POM dc = new _POM();

    String name = "Admin";
    String pAssword = "Admin123";


    @Test
    void US8() {

        _POM dc = new _POM();
        driver.get("https://openmrs.org/demo/");
        wait.until(ExpectedConditions.elementToBeClickable(dc.demo));
        dc.demo.click();
        dc.username.sendKeys(name);
        dc.Password.sendKeys(pAssword);
        dc.desk.click();
        dc.in.click();
        dc.findPatientRecord.click();

        System.out.println(dc.showingEntries.getText());
        String[] n = dc.showingEntries.getText().trim().split(" ");
        System.out.println(n.length);
        int kayitOlanlar = Integer.parseInt(n[5]);
        System.out.println("kayitOlanlar = " + kayitOlanlar);

        int rows = 0;
        int pageNumberss = dc.pageNumbers.size();
        for (int i = pageNumberss - 1; i >= 0; i--) {
            dc.pageNumbers.get(i).click();
            for (WebElement pageRows : dc.Pagerows) {
                rows++;
            }
        }

    }
    @Test

    public void HastaSilme(){

        driver.get("https://demo.openmrs.org/openmrs/login.htm");

        WebElement Username= driver.findElement(By.id("username"));
        Username.sendKeys("Admin");
        MyFunc.Bekle(2);

        WebElement Password= driver.findElement(By.id("password"));
        Password.sendKeys("Admin123");
        MyFunc.Bekle(2);

        WebElement InpatientWard= driver.findElement(By.xpath("//*[@id=\"Inpatient Ward\"]"));
        InpatientWard.click();
        MyFunc.Bekle(2);

        WebElement LogIn= driver.findElement(By.id("loginButton"));
        LogIn.click();
        MyFunc.Bekle(2);

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

    }


    @Test
    public void Patient_Registration() {
        _POM dc = new _POM();

        driver.get("https://openmrs.org/");
        MyFunc.Bekle(1);
        dc.DemoButton.click();
        wait.until(ExpectedConditions.urlToBe("https://openmrs.org/demo/"));
        dc.OpenMRS.click();
        MyFunc.Bekle(2);
        dc.OpenMrsDemo.click();
        wait.until(ExpectedConditions.urlToBe("https://demo.openmrs.org/openmrs/login.htm"));
        dc.UserName.sendKeys("admin");
        dc.Password.sendKeys("Admin123");

        int randomSec = MyFunc.randomGenerator(dc.Locations.size());
        dc.LocationButton.get(randomSec).click();

        dc.Loginbuton.click();
        dc.Register_Patient.click();
        wait.until(ExpectedConditions.elementToBeClickable(dc.GivenName));
        dc.GivenName.sendKeys("Sokol");
        dc.MiddleName.sendKeys("Sokol");
        dc.FamilyName.sendKeys("Rustemi");
        dc.ConfrimButton.click();

        Select Genderselect = new Select(dc.Gender);
        Genderselect.selectByValue("M");

        dc.RightArrow.click();
        dc.BirthDay.sendKeys("30");

        Select MonthSelect = new Select(dc.BirthdateMonth);
        MonthSelect.selectByValue("4");

        dc.BirthDateYear.sendKeys("1999");
        dc.ConfrimButton.click();
        dc.Adress1.sendKeys("Budapest");
        dc.Adress2.sendKeys("Hungary");
        dc.City.sendKeys("Budapest");
        dc.StateProvince.sendKeys("Budapest");
        dc.Country.sendKeys("Budapest");
        dc.PostalCode.sendKeys("65000");
        dc.ConfrimButton.click();
        dc.PhoneNumber.sendKeys("1234567890");
        dc.ConfrimButton.click();

        Select RelatSelect = new Select(dc.RelationShip);
        RelatSelect.selectByVisibleText("Doctor");

        dc.PersonName.sendKeys("Sokol");
        dc.ConfrimButton.click();
        dc.Confrim.click();
        wait.until(ExpectedConditions.visibilityOf(dc.ConfrimName));
        System.out.println("ConfrimName = " + dc.ConfrimName.getText());
        System.out.println("ConfrimID = " + dc.ConfrimID.getText());

        Assert.assertTrue(dc.ConfrimName.isEnabled());
        Assert.assertTrue(dc.ConfrimID.isEnabled());

    }

}
