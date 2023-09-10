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
    @FindBy(xpath ="//a[@id='referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension']")
    public WebElement patientRegistarion;
    @FindBy(xpath="//*[@id='fr89-field']")
    public WebElement nameReg;
    @FindBy(xpath="//*[@id='fr2310-field']")
    public WebElement familyNameReg;
    @FindBy(xpath="//*[@id='next-button']")
    public WebElement nextReg;
    @FindBy(xpath="//*[@value='F']")
    public WebElement female;
    @FindBy(xpath="//*[@id='birthdateDay-field']")
    public WebElement birthDay;
    @FindBy(xpath="//*[@id='birthdateMonth-field']")
    public WebElement birthMonth;
    @FindBy(xpath="//*[@id='birthdateYear-field']")
    public WebElement birthYear;
    @FindBy(xpath="//*[@id='address1']")
    public WebElement address;

    @FindBy(xpath="//*[@id='cityVillage']")
    public WebElement city;
    @FindBy(xpath="//*[@name='country']")
    public WebElement country;
    @FindBy(xpath="//*[@name='phoneNumber']")
    public WebElement phone;
    @FindBy(xpath="//*[@id='relationship_type']")
    public WebElement relationship;
    @FindBy(xpath="//*[@placeholder='Person Name']")
    public WebElement personName;
    @FindBy(xpath="//*[@id='submit']")
    public WebElement confirm;












}
