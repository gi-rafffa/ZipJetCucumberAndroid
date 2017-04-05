package test.views;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
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
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBySet;


public class LocationView extends AbstractView {
	public LocationView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"DENY\"]")
	private MobileElement buttonDeny;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ALLOW\"]")
	private MobileElement buttonAllow;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Berlin\"]")
	private MobileElement buttonBerlin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"London\"]")
	private MobileElement buttonLondon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Paris\"]")
	private MobileElement buttonParis;

	
	
	
	public MapView PickBerlin() throws Throwable{
		System.out.println(driver.getPageSource());
		buttonBerlin.click();
		return new MapView(driver);
	}
	
	public MapView PickLondon() throws Throwable{
		System.out.println(driver.getPageSource());
		buttonLondon.click();
		return new MapView(driver);
	}
	
	public MapView PickParis() throws Throwable{
		System.out.println(driver.getPageSource());
		buttonParis.click();
		return new MapView(driver);
	}
	
	
	
	public void AllowLocation(){
		buttonAllow.click();
	}
	
	public void DenyLocation(){
		buttonDeny.click();
	}

	
	}
	
	


