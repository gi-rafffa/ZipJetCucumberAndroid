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


public class AddressDetailsView extends AbstractView {
	public AddressDetailsView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	//string with address - couldn't be edited
	@iOSXCUITFindBy(accessibility = "Address TextField")
	private MobileElement textfieldAddress;
	
	@iOSXCUITFindBy(id = "ShieldCheckmark")
	private  MobileElement iconShied;
	
	@iOSXCUITFindBy(id = "WE NEVER SHARE YOUR PRIVATE INFORMATION WITH THIRD PARTIES")
	private  MobileElement textfieldSafety;
	
	@iOSXCUITFindBy(accessibility = "Address Details")
	private  MobileElement textfieldTitle;
	
	@iOSXCUITFindBy(accessibility = "nav back")
	private  MobileElement buttonBack;
	
	@iOSXCUITFindBy(id = "CountryCode")
	private  MobileElement textfieldCountryCode;
	
	@iOSXCUITFindBy(id = "PhoneNumber")
	private  MobileElement textfieldPhone;
	
	
	@iOSXCUITFindBy(accessibility = "PriceTagEuroIcon")
	private  MobileElement buttonPriceList;
	
	@iOSXCUITFindBy(xpath = "//*[@name=\"SAVE ADDRESS DETAILS\"]")
	private  MobileElement buttonSaveAddressDetails;
	
	public void PriceList(){
		buttonPriceList.click();
	}
	
	public void Back(){
		buttonBack.click();
	}
	
	public void SaveAddressDetails() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println((driver).getPageSource());
		buttonSaveAddressDetails.click();
		Thread.sleep(2000);
		//driver.getKeyboard().sendKeys("\n");
	}
	
	/*public AddressDetailsView InputFlatBuilding(String flatbuilding){
		textfieldFlatBuilding.sendKeys(flatbuilding);
		return this;
	}*/


	/*
	public AddressDetailsView DeleteFlatBuilding(){
		textfieldFlatBuilding.click();
		textfieldFlatBuilding.clear();
		return this;
	}
	*/
	
	}
	
	


