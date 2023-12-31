package Utility;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BaseDriverParameter {

    public WebDriver driver;
    public static WebDriverWait wait;

    @BeforeClass
    @Parameters("browserTipi")
    public void baslangicIslemleri(String browserTipi){
        Logger logger= Logger.getLogger(""); // output yapılan logları al.
        logger.setLevel(Level.SEVERE); // sadece ERROR ları göster

        switch (browserTipi.toLowerCase())
        {
            case "firefox" :
                driver = new FirefoxDriver();
                break;

            case "safari" :
                driver = new SafariDriver();
                break;

            case "edge" :
                driver = new EdgeDriver();
                break;

            default:
                driver = new ChromeDriver(); // jenkins deyken : sen head olmadan yani hafızada çalış
        }

        //driver.manage().window().maximize(); // Ekranı max yapıyor.
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20)); // 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  // 20 sn mühlet: elementi bulma mühleti
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));

       // loginTesti();
    }

    public void loginTesti(){
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
        MyFunc.Bekle(2);

        elemans.loginbut.click();
    }

    @AfterClass
    public void bitisIslemleri(){ // tearDown
        MyFunc.Bekle(5);
        driver.quit();
    }

}
