package test.views;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.locator.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBySet;


public class ContactDetailsView extends AbstractView {
	public ContactDetailsView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"First Name\"]")
	private MobileElement textfieldFirstName;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Last Name\"]")
	private MobileElement textfieldLastName;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Login\"]")
	private MobileElement buttonLogin;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"SAVE CONTACT DETAILS\"]")
	private  MobileElement buttonSaveContactDetails;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Email Address\"]")
	private  MobileElement textfieldEmailAddress;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Phone Number\"]")
	private  MobileElement textfieldPhone;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PriceTagEuroIcon\"]")
	private  MobileElement buttonPriceList;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav back\"]")
	private  MobileElement buttonBack;
	
	//to rework
	@iOSXCUITFindBy(id = "CountryCode")
	private  MobileElement textfieldCountryCode;
	
	@iOSXCUITFindBy(id = "Newsletter")
	private  MobileElement checkboxKeepMePosted;
	
	public void PriceList(){
		buttonPriceList.click();
	}
	
	public void Back(){
		buttonBack.click();
	}
	
	public ContactDetailsView checkKeepMePosted(){
		checkboxKeepMePosted.click();
		return this;
	}
	
	public void SaveContactDetails(){
		//driver.getKeyboard().sendKeys(Keys.RETURN);
		buttonSaveContactDetails.click();
	
	}
	
	public ContactDetailsView InputCountryCode(String countrycode){
		textfieldCountryCode.sendKeys(countrycode);
		return this;
	}

	public ContactDetailsView InputEmailAddress(String emailaddress){
		textfieldEmailAddress.sendKeys(emailaddress);
		return this;
	}
	
	public ContactDetailsView InputPhoneNumber(String phonenumber){
		textfieldPhone.sendKeys(phonenumber);
		return this;
	}
	
	public ContactDetailsView InputFirstName(String firstname){
		textfieldFirstName.sendKeys(firstname);
		return this;
	}
	
	public ContactDetailsView InputLastName(String lastname){
		textfieldLastName.sendKeys(lastname);
		return this;
	}
	
	public ContactDetailsView DeleteLastName(String lastname){
		textfieldLastName.click();
		textfieldLastName.clear();
		return this;
	}
	
	public ContactDetailsView DeleteFirstName(String lastname){
		textfieldFirstName.click();
		textfieldFirstName.clear();
		return this;
	}

	public MobileElement getButtonLogin() {
		return buttonLogin;
	}

	public WelcomeView LoginClick() throws Throwable {
		buttonLogin.click();
		return new WelcomeView(this.driver);
	}
	
	}
	
	


