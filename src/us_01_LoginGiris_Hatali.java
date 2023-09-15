import Utility.MyFunc;
import Utility.mrs_elements;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class us_01_LoginGiris_Hatali  {
    public static WebDriver driver;
    @Test
    public void loginTestfalse() {
        driver = new ChromeDriver();

        driver.get("https://openmrs.org");
        driver.manage().window().maximize();

        MyFunc.Bekle(1);

        mrs_elements elemans=new mrs_elements();
        MyFunc.Bekle(1);
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
        name2.sendKeys("denedim");
        MyFunc.Bekle(2);

        WebElement pass2= driver.findElement(By.id("password"));
        pass2.sendKeys("olamdi");
        MyFunc.Bekle(2);

        WebElement loginbut= driver.findElement(By.id("loginButton"));
        loginbut.click();
        MyFunc.Bekle(2);

        WebElement errorMessageElement = driver.findElement(By.xpath("//span[@id='sessionLocationError']"));
      //  Assert.assertFalse(errorMessageElement.getText().toLowerCase().contains("You must "));
        System.out.println("hata elementi 'Location girilmeli' = " + errorMessageElement.getText() );

        WebElement location = driver.findElement(By.id("Inpatient Ward"));
        location.click();
        MyFunc.Bekle(2);

        WebElement loginbut2= driver.findElement(By.id("loginButton"));
        loginbut2.click();
        MyFunc.Bekle(2);

        WebElement invalidhatasi=driver.findElement(By.xpath("//*[@id='error-message']"));
        System.out.println("hata elementi 'dogru kullanici girilmeli'= " + invalidhatasi.getText());
     //   Assert.assertTrue("dogru kullanici girilmeli",invalidhatasi.isDisplayed());

        MyFunc.Bekle(4);
        driver.quit();


    }

}



