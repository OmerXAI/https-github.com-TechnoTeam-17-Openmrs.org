import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class us_10_wrongClock extends BaseDriver {
    @Test
    public void test(){
        WebElement app=driver.findElement
                (By.xpath("//*[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']"));
            app.click();

        WebElement app2=driver.findElement
                (By.xpath("//*[@id=\"appointmentschedulingui-manageAppointments-app\"]/i"));
        app2.click();
        //*[@id="patient-search"]
        WebElement app3=driver.findElement
                (By.xpath("//*[@id=\"patient-search\"]"));
        app3.sendKeys("Nergis hnm dan gelecek bilgiler");


    }
}
