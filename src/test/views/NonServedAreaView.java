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


public class NonServedAreaView extends AbstractView {
	public NonServedAreaView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Email Address\"]")
	private MobileElement textFieldEmail;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"X\"]")
	private  MobileElement buttonDelete;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"KEEP ME POSTED\"]")
	private  MobileElement buttonKeepMePosted;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close dark\"]")
	private  MobileElement buttonClose;
	
	
	public MapView KeepMePosted() throws Throwable{
		
		//buttonKeepMePosted.click();
		driver.getKeyboard().sendKeys("\n");
		Thread.sleep(3000);
		return new MapView(this.driver);
	}
	
	public void Close(){
		buttonClose.click();
	}
	
	public void DeleteEmail(){
		buttonDelete.click();
	}

	public NonServedAreaView InputEmail(String email) throws InterruptedException{
		textFieldEmail.sendKeys(email);
		Thread.sleep(2000);
		//driver.getKeyboard().sendKeys("\n");
		//Thread.sleep(2000);
        return this; 
	}

	public MobileElement getButtonKeepMePosted() {
		return buttonKeepMePosted;
	}
	}
	