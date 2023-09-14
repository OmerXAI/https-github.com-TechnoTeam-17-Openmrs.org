import Utility.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class us_02_login  {
    public static WebDriver driver;


    @Test(dataProvider = "UserData",groups = {"Smoke","Login"})


    public void login(String username, String password){
        driver = new ChromeDriver();
        driver.get("https://openmrs.org");
        driver.manage().window().maximize();
        MyFunc.Bekle(2);
        WebElement demobuton= driver.findElement(By.xpath("//a[@class='zak-button']"));
        demobuton.click();
        MyFunc.Bekle(2);
        JavascriptExecutor js= (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 1500);");
        MyFunc.Bekle(2);

        WebElement expo2= driver.findElement(By.xpath("//span[contains(text(),'Enter the OpenMRS 2 Demo')]"));
        expo2.click();
        MyFunc.Bekle(2);

        WebElement name2= driver.findElement(By.id("username"));
        name2.sendKeys(username);
        MyFunc.Bekle(2);

        WebElement pass2= driver.findElement(By.id("password"));
        pass2.sendKeys(password);
        MyFunc.Bekle(2);

        WebElement location = driver.findElement(By.id("Inpatient Ward"));
        location.click();
        MyFunc.Bekle(2);

        WebElement loginbut= driver.findElement(By.id("loginButton"));
        loginbut.click();
        MyFunc.Bekle(2);

        WebElement errorMessageElement = driver.findElement(By.xpath("//div[@id='error-message']"));
        String errorMessage = errorMessageElement.getText();
        
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(errorMessage.contains("Invalid username/password"), "Login should result in 'Invalid username/password' message for user: " + username);
       
        // Assert all the conditions
        softAssert.assertAll();


    }

    @DataProvider    // DataProvider olarak kullanılcak metodun tipi Object olmak zorunda.
    public Object[][] UserData() {
        Object[][] data = {
                {"ihsan","122334"},
                {"sokol", "rustem5"},
               {"zeynep","zeynep111"},
             {"serkan","serkan500"},
            {"neslihan","hakan700"},
             {"aygul","nergis300"},


        };
        return data;
    }

    @Test
    public void loginTestTrue() {

        WebElement name2= driver.findElement(By.id("username"));
        name2.sendKeys("Admin");
        MyFunc.Bekle(2);

        WebElement pass2= driver.findElement(By.id("password"));
        pass2.sendKeys("Admin123");
        MyFunc.Bekle(2);

        WebElement location = driver.findElement(By.id("Inpatient Ward"));
        location.click();
        MyFunc.Bekle(2);

        WebElement loginbut= driver.findElement(By.id("loginButton"));
        loginbut.click();
        MyFunc.Bekle(2);


        WebElement basariligiris=driver.findElement(By.xpath("//h4[normalize-space()='Logged in as Super User (admin) at Inpatient Ward.']"));
        String basarili=basariligiris.getText();
        Assert.assertTrue(basarili.contains("Logged"));

    }


}