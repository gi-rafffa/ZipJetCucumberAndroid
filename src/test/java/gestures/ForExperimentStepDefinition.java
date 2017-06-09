/*package test.gestures;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.locator.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
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
public class ForExperimentStepDefinition {
	
	@SuppressWarnings("rawtypes")
	 public IOSDriver driver;
	
	
	
//  @Given(value = "^Application is started$")
  public void given() throws Throwable  {
		DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("automationName", "XCUITest");
		 caps.setCapability("platformName", "iOS");
		 caps.setCapability("platformVersion", "10.2"); 
		 caps.setCapability("deviceName", "iPhone 6"); 
		 caps.setCapability("app", "/Users/Anna/Documents/UsefullStaffForAppium/ZipJet_Dev.app");
		 driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

  }

 
 // @Then(value = "^I could check locators$")
  public void then() throws Throwable {
	  
	  Thread.sleep(5000000);
  }



}
*/
