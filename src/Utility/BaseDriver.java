package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriver {

    public static WebDriver driver; // SingletonDriver method
    public static WebDriverWait wait;

    @BeforeClass
    public void baslangicIslemleri(){
        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        login(); //her testin baslangicinda login yapilmadigi icin simdilik yoruma alindi

    }
public void logout(){
    WebElement logouta = driver.findElement(By.xpath("//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']"));
    logouta.click();

}
    public void login(){
        driver.get("https://openmrs.org");
        MyFunc.Bekle(1);
        mrs_elements elemans=new mrs_elements();
        elemans.demobuton.click();
        MyFunc.Bekle(1);

        elemans.expo2.click();
        MyFunc.Bekle(1);

        elemans.expo2a.click();
        MyFunc.Bekle(1);

        elemans.name.sendKeys("admin");
        MyFunc.Bekle(1);

        elemans.pass.sendKeys("Admin123");
        MyFunc.Bekle(1);

        elemans.loc.click();
      //  MyFunc.Bekle(2);

        elemans.loginbut.click();
    //    Actions aksiyonlar = new Actions(driver);// web sayfası aksiyonlara açıldı.
    //    Action aksiyon = aksiyonlar.moveToElement(loginBtn).click().build();
    //    aksiyon.perform();

     //   wait.until(ExpectedConditions.urlToBe("https://demo.openmrs.org/openmrs/referenceapplication/home.page"));
       // MyFunc.Bekle(2);
=======
       

    }

   @AfterClass
    public void bitisIslemleri(){ // tearDown

        MyFunc.Bekle(2);
        //driver.quit();
    }

}
