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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBySet;


public class PaymentsListView extends AbstractView {
	public PaymentsListView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	//all to redefine
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"1234567812345678\"]")
	private MobileElement textfieldCreditCardNumber;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Payment\"]")
	private  MobileElement titleAddPayment;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField")
	private  MobileElement textfieldCardHolder;
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav back\"]")
	private  MobileElement buttonBack;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PriceTagEuroIcon\"]")
	private  MobileElement buttonPriceList;
	
	@iOSXCUITFindBy(xpath = "//*[@name=\"SAVE PAYMENT DETAILS\"]")
	private  MobileElement buttonSavePaymentDetailsPayPal;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeToolbar/XCUIElementTypeButton")
	private  MobileElement buttonSavePaymentDetailsCreditCard;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add a PayPal Account\"]")
	private  MobileElement buttonAddPayPal;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav menu\"]")
	private MobileElement buttonMenu;
	
	public void openMenu(){
		buttonMenu.click();
	}
	
	public void Back(){
		buttonBack.click();
	}
	
	public void AddPayPal(){
		buttonAddPayPal.click();
	}
	
	public void SavePaymentDetailsPayPal(){
		buttonSavePaymentDetailsPayPal.click();
	}
	
	public void SavePaymentDetailsCreditCard(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonSavePaymentDetailsCreditCard));
		buttonSavePaymentDetailsCreditCard.click();
	}
	
	
	
	public void OpenPriceList(){
		buttonPriceList.click();
	}
	
	public PaymentsListView InputCreditCard(String creditcard){
		textfieldCreditCardNumber.sendKeys(creditcard);
		return this;
	}
	
	public PaymentsListView FocusOnCardHolderField(){
		textfieldCardHolder.click();
		return this;
	}


	
	public PaymentsListView DeleteCreditCardNumber(){
		textfieldCreditCardNumber.click();
		textfieldCreditCardNumber.clear();
		return this;
	}

	public void isPaymentViewDispalyed() {
		Assert.assertNotNull(titleAddPayment);
		Assert.assertTrue(titleAddPayment.isDisplayed(),"No title");
		
	}

	public MenuView OpenMenu() throws Throwable {
		buttonMenu.click();
		return new MenuView(driver);
	}

	}
	
	


