package test.views;
import static org.testng.AssertJUnit.assertEquals;
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


import static org.testng.Assert.assertEquals;

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


public class OrderSummaryView extends AbstractView {
	public OrderSummaryView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	//string with address - couldn't be edited
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Accept Terms\"]")
	private MobileElement checkboxAcceptTerms;
	
	@iOSXCUITFindBy(accessibility = "Order Summary")
	private  MobileElement textfieldTitle;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav back\"]")
	private  MobileElement buttonBack;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Confirm Order\"]")
	private  MobileElement buttonConfirmOrder;
	
	
	public void Back(){
		buttonBack.click();
	}

	//think with Alessandro how to get rid of sleep
	public void ConfirmOrder() throws Throwable{
		buttonConfirmOrder.click();
		Thread.sleep(8000);
	}
	
	
	public OrderSummaryView AcceptTermasAndConditions(){
		checkboxAcceptTerms.click();
		return this;
	}
	
	@Test
	public void CheckTitleExists(){
		Assert.assertNotNull(textfieldTitle);
	
	}

	public boolean isCheckBoxAcceptVisible() {
		return IsElementPresent(checkboxAcceptTerms);
	}
	


	

	
	}
	
	


