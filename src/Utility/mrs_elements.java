package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mrs_elements {
    public mrs_elements() {
        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath="//a[@class='zak-button']")
    public WebElement demobuton;
    @FindBy(xpath="//*[text()='Explore OpenMRS 2']")
    public WebElement expo2;
    @FindBy(xpath="//*[text()='Enter the OpenMRS 2 Demo']")
    public WebElement expo2a;
    @FindBy(id="username")
    public WebElement name;
    @FindBy(id="password")
    public WebElement pass;
    @FindBy(id="Inpatient Ward")
    public WebElement loc;
    @FindBy(id="loginButton")
    public WebElement loginbut;
    @FindBy(xpath="//*[@id='appointmentschedulingui-homeAppLink-appointmentschedulingui-homeAppLink-extension']")
    public WebElement app;
    @FindBy(xpath="//*[@id='appointmentschedulingui-manageAppointments-app']/i")
    public WebElement app2;
    @FindBy(xpath="//*[@id='patient-search']")
    public WebElement app3;




}
