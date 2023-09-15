import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class us_03_Logout extends BaseDriver {
    @Test(groups={"Smoke"})
    public void logoutTest(){
        WebElement logout = driver.findElement(By.xpath("//a[@href='/openmrs/appui/header/logout.action?successUrl=openmrs']"));
        logout.click();
        MyFunc.Bekle(4);

        driver.quit();
    }
}
