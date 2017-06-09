/*package test.gestures;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.locator.*;
import test.framework.Application;
import test.framework.Constants;
import test.views.ContactDetailsView;
import test.views.LocationView;
import test.views.MapView;
import test.views.NewOrderView;
import test.views.StartView;
import test.views.WelcomeView;
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
public class ForExperimentPageObjectStepDefinition {
	
	@SuppressWarnings("rawtypes")
	// public IOSDriver driver;
	public Application application;
	
	
  @Given(value = "^Application is started$")
  public void given() throws Throwable  {
  application = Application.getInstance();
   application.startView = new StartView(application.driver);
   application.startView.AllowNotification();
   application.welcomeView = new WelcomeView(application.driver);
   application.welcomeView.GetStarted();
   application.locationView = new LocationView(application.driver);
   application.locationView.AllowLocation();
   application.mapView = new MapView(application.driver);
   application.mapView.ClickAddressSearch().DeleteAddress().InputAddress(Constants.SERVED_BERLIN); 
   System.out.println((application.driver).getPageSource());
   application.mapView = new MapView(application.driver);
   application.mapView.SelectAddressFromList();
   Thread.sleep(2000);
   application.mapView.ConfirmAddress();
   Thread.sleep(3000);
   application.newOrderView = new NewOrderView(application.driver);
   application.newOrderView.SelectMiddleSC().InputComment("jsjjssj");
   application.driver.hideKeyboard();
   Thread.sleep(3000);
   application.newOrderView.Continue();
   application.contactDetailsView = new ContactDetailsView(application.driver);
   application.driver.hideKeyboard();
   application.contactDetailsView = new ContactDetailsView(application.driver);
   application.contactDetailsView.InputFirstName("aaa");
   application.contactDetailsView.InputLastName("aaa");
   application.contactDetailsView.InputEmailAddress("aaa@kkk.rr");
   application.contactDetailsView.InputPhoneNumber("8888866277272");
  application.driver.hideKeyboard();
   application.contactDetailsView.Back();
   application.newOrderView.Continue();
   application.contactDetailsView = new ContactDetailsView(application.driver);
   application.driver.getKeyboard().sendKeys("\n");
   Thread.sleep(3000);
   System.out.println((application.driver).getPageSource());
   application.contactDetailsView.SaveContactDetails();
   application.newOrderView = new NewOrderView(application.driver);
   application.newOrderView.SelectMiddleSC().Continue();
   application.contactDetailsView.SaveContactDetails();
   
   Thread.sleep(300000);
   
  }
  @Then(value = "^I could check locators$")
  public void then() throws Throwable {
	  
	  Thread.sleep(5000000);
  }



}*/

