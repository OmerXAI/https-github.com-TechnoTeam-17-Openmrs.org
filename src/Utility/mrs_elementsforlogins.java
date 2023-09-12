package Utility;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mrs_elementsforlogins {
    public mrs_elementsforlogins() {
        PageFactory.initElements(BaseDriverforLogins.driver, this);
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
    @FindBy(xpath="//*[@name='givenName']")
    public WebElement nameReg;
    @FindBy(xpath="//*[@name='familyName']")
    public WebElement familyNameReg;
    @FindBy(xpath="//*[@id='next-button']")
    public WebElement nextReg;
    @FindBy(xpath="//*[@value='F']")
    public WebElement female;
    @FindBy(xpath="//*[@id='birthdateDay-field']")
    public WebElement birthDay;
    @FindBy(xpath="//*[@id='birthdateMonth-field']")
    public WebElement birthMonth;
    @FindBy(xpath="//option[@value='1']")
    public WebElement january;
    @FindBy(xpath="//*[@id='birthdateYear-field']")
    public WebElement birthYear;
    @FindBy(xpath="//*[@id='address1']")
    public WebElement address;

    @FindBy(xpath="//*[@id='cityVillage']")
    public WebElement city;
    @FindBy(xpath="//*[@id='country']")
    public WebElement country;
    @FindBy(xpath="//*[@name='phoneNumber']")
    public WebElement phone;
    @FindBy(xpath="//*[@id='relationship_type']")
    public WebElement relationship;
    @FindBy(xpath="//*[@data-val='Parent']")
    public WebElement parent;
    @FindBy(xpath="//*[@ng-model='relationship.name']")
    public WebElement personName;
    @FindBy(xpath="//*[@class='confirm right']")
    public WebElement confirm;
    @FindBy(xpath="//*[@value='Confirm']")
    public WebElement finalConfirm;
    @FindBy(xpath="//span[@class='PersonName-givenName']")
    public WebElement registeredName;
    @FindBy(xpath="//*[@class='PersonName-familyName']")
    public WebElement registeredFamilyName;
    @FindBy(xpath=" //*[@id=\"patient-search-results-table\"]/tbody/tr/td[1]")
    public WebElement patientId;
    @FindBy(xpath="//*[@id=\"time-zone-warning\"]/div/div/p/text()")
    public WebElement timeZoneAlarm;

    @FindBy(xpath="//*[@class='icon-user small']")
    public WebElement myacc;

    @FindBy(xpath="//*[@href='/openmrs/adminui/myaccount/myAccount.page']")
    public WebElement myacc2;

    @FindBy(xpath="(//*[@class='button app big'])[1]")
    public WebElement cap1;

    @FindBy(xpath="(//*[@class='button app big'])[2]")
    public WebElement cap2;

    @FindBy(xpath="(//div[@class='text'])/p/text()")
    public WebElement hata;









}
