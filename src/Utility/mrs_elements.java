package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

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


    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement demo;

    @FindBy(css ="input[id='username']" )
    public WebElement username;


    @FindBy(css = "li[id='Registration Desk']")
    public WebElement desk;

    @FindBy(css ="input[id='loginButton']" )
    public WebElement in;

    @FindBy(css = "a[href='/openmrs/appui/header/logout.action?successUrl=openmrs']")
    public WebElement out;

    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement Demo;

    @FindBy(css ="input[id='username']" )
    public WebElement Username;


    @FindBy(css ="li[id='Registration Desk']" )
    public WebElement Desk;

    @FindBy(css ="input[id='loginButton']" )
    public WebElement IN;

    @FindBy(css ="i[class='icon-search']" )
    public WebElement findElement;

    @FindBy(className = "zak-button")
    public WebElement demoBtn;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement openMRS2;

    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement openMRS2Demo;

    @FindBy(id = "username")
    public WebElement userName;


    @FindBy(id = "Pharmacy")
    public WebElement pharmacyBtn;

    @FindBy(id = "loginButton")
    public WebElement loginBtn;

    @FindBy(id = "error-message")
    public WebElement errorMsg;

    @FindBy(className = "icon-hdd")
    public WebElement dataMBtn;

    @FindBy(className = "icon-group")
    public WebElement mergePBtn;

    @FindBy(id = "patient1-text")
    public WebElement patient1;

    @FindBy(id = "patient2-text")
    public WebElement patient2;

    @FindBy(id = "confirm-button")
    public WebElement confirmBtn;

    @FindBy(css = "div[class='messages-container'] > h1")
    public WebElement warningText;

    @FindBy(id = "first-patient")
    public WebElement firstPatient;

    @FindBy(linkText = "Demo")
    public WebElement DemoButton;

    @FindBy(xpath = "//span[text()='Explore OpenMRS 2']")
    public WebElement OpenMRS;

    @FindBy(xpath = "//span[text()='Enter the OpenMRS 2 Demo']")
    public WebElement OpenMrsDemo;

    @FindBy(id ="username")
    public WebElement UserName;

    @FindBy(id ="password")
    public WebElement Password;

    @FindBy(css ="[class='select'] >li")
    public List<WebElement> Locations;

    @FindBy(css ="[tabindex='0']")
    public List<WebElement>LocationButton;

    @FindBy(id ="loginButton")
    public WebElement Loginbuton;

    @FindBy(css ="[class='icon-user']")
    public WebElement Register_Patient;

    @FindBy(name ="givenName")
    public WebElement GivenName;

    @FindBy(name ="middleName")
    public WebElement MiddleName;

    @FindBy(name ="familyName")
    public WebElement FamilyName;

    @FindBy(css ="[class='confirm right']")
    public WebElement ConfrimButton;

    @FindBy(id ="gender-field")
    public WebElement Gender;

    @FindBy(css ="[class='fas fa-chevron-right']")
    public WebElement RightArrow;

    @FindBy(name ="birthdateDay")
    public WebElement BirthDay;

    @FindBy(name ="birthdateMonth")
    public WebElement BirthdateMonth;

    @FindBy(name ="birthdateYear")
    public WebElement BirthDateYear;

    @FindBy(css ="[name='address1'][id='address1']")
    public WebElement Adress1;
    @FindBy(css = "[name='address2'][id='address2']")
    public WebElement Adress2;
    @FindBy(css =("[id='cityVillage']"))
    public WebElement City;
    @FindBy(css ="[id='stateProvince']")
    public WebElement StateProvince;

    @FindBy(css ="[id='country']")
    public WebElement Country;

    @FindBy(css ="[id='postalCode']")
    public WebElement PostalCode;

    @FindBy(name ="phoneNumber")
    public WebElement PhoneNumber;

    @FindBy(css ="[id='relationship_type']")
    public WebElement RelationShip;

    @FindBy(css ="[placeholder='Person Name']")
    public WebElement PersonName;

    @FindBy(id ="submit")
    public WebElement Confrim;

    @FindBy(css ="[class='PersonName-givenName']")
    public WebElement ConfrimName;
    @FindBy(css ="[class='float-sm-right']")
    public WebElement ConfrimID;

    @FindBy(xpath ="(//*[@class='icon-calendar'])[2]")
    public WebElement AppointmentScheduiling;

    @FindBy(id = "appointmentschedulingui-manageAppointments-app")
    public WebElement ManageServiceTypes;

    @FindBy(css = "[id='patient-search']")
    public WebElement SearchBox;

    @FindBy(css ="[id='time-zone-warning']")
    public WebElement Massege;

    @FindBy(css = "[class='icon-search']")
    public WebElement FindPatRec;

    @FindBy(css = "[class='odd']")
    public WebElement ClickPatient;

    @FindBy(css = "[class='float-left'] > li")
    public List<WebElement> GeneralActions;

    @FindBy(xpath = "//*[text()='No matching records found']")
    public WebElement WrongSearch;

    @FindBy(id = "Pharmacy")
    public WebElement PharmacyButton;

    @FindBy(id = "Inpatient Ward")
    public WebElement inpatientWard;

    @FindBy (linkText = "Find Patient Record")
    public WebElement findPatientRecord;

    @FindBy(css = "div[id='patient-search-results-table_paginate'] >span>a[tabindex]")
    public  List<WebElement> pageNumbers;
    @FindBy(css = "tbody[role='alert']>tr")
    public List<WebElement> Pagerows;

    @FindBy(id = "patient-search-results-table_info")
    public WebElement showingEntries;







}
