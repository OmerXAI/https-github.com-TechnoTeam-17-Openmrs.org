import Utility.BaseDriver;
import Utility.BaseDriverforLogins;
import Utility.MyFunc;
import Utility.mrs_elements;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class US_02_login extends BaseDriverforLogins {

    @Test(dataProvider = "UserData")


    public void login(String username, String password){
        driver.get("https://openmrs.org");
        MyFunc.Bekle(1);
        mrs_elements elemans=new mrs_elements();
        elemans.demobuton.click();
        MyFunc.Bekle(1);

        elemans.expo2.click();
        MyFunc.Bekle(1);

        elemans.expo2a.click();
        MyFunc.Bekle(1);

        elemans.name.sendKeys(username);
        MyFunc.Bekle(1);

        elemans.pass.sendKeys(password);
        MyFunc.Bekle(1);

        elemans.loc.click();
        MyFunc.Bekle(2);

        elemans.loginbut.click();
        //    Actions aksiyonlar = new Actions(driver);// web sayfası aksiyonlara açıldı.
        //    Action aksiyon = aksiyonlar.moveToElement(loginBtn).click().build();
        //    aksiyon.perform();

        //   wait.until(ExpectedConditions.urlToBe("https://demo.openmrs.org/openmrs/referenceapplication/home.page"));
        MyFunc.Bekle(10);
    }
        @DataProvider // bu metoda dataprovider görevi verildi.
        public Object[][] UserData(){ // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
            SoftAssert softAssert=new SoftAssert();

            Object[][] data={
                    {"ihsan","122334"},
                    {"sokol", "rustem5"},
                    {"zeynep","zeynep111"},
                    {"serkan","serkan500"},
                    {"neslihan","hakan700"},
                    {"aygul","nergis300"},
                    {"Admin","Admin123"},

            };

            return data;




    }

    }

