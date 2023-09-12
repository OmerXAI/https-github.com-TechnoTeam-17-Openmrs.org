import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class _01_LoginGiris_Hatali extends BaseDriver {
    @Test
    public void loginTest() {

        driver.get("https://openmrs.org/");

        WebElement demoBtn = driver.findElement(By.xpath("//a[@class='zak-button']"));

        demoBtn.click();


        WebElement ExplorerBtn = driver.findElement(By.xpath("//*[text()='Explore OpenMRS 2']"));

        ExplorerBtn.click();


        WebElement EnterOpen2Btn = driver.findElement(By.xpath("//*[text()='Enter the OpenMRS 2 Demo']"));

        EnterOpen2Btn.click();

            WebElement userName = driver.findElement(By.id("username"));
            userName.sendKeys("admin");

            WebElement password = driver.findElement(By.id("password"));
            password.sendKeys("Admin123");

            WebElement inpatient = driver.findElement(By.id("Inpatient Ward"));
           inpatient.click();

            WebElement loginBtn = driver.findElement(By.id("loginButton"));
            loginBtn.click();


            wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "You must choose a location!"));
            WebElement mesaj=driver.findElement(By.id("submit-control"));

        Assert.assertTrue( mesaj.getText().equals("You must choose a location!"));

            wait.until(ExpectedConditions.textToBe(By.id("submit-control"), "Invalid username/password. Please try again."));
            WebElement mesaj2=driver.findElement(By.id("submit-control"));

        Assert.assertTrue( mesaj.getText().equals("Invalid username/password. Please try again."));
        }


    }
