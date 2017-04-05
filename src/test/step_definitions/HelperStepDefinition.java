package test.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.locator.*;
import test.framework.Application;
import test.framework.Constants;
import test.views.AddressDetailsView;
import test.views.ContactDetailsView;
import test.views.LocationView;
import test.views.MapView;
import test.views.NewOrderView;
import test.views.OrderConfirmedView;
import test.views.OrderSummaryView;
import test.views.PayPalView;
import test.views.PaymentView;
import test.views.StartView;
import test.views.WelcomeView;
import cucumber.api.java.en.Then;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import test.framework.Constants;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelperStepDefinition {
	
	@SuppressWarnings("rawtypes")
	//public IOSDriver driver;
	public  Application application;
	
	
	
/*  @Given(value = "^ZipJet, Simulator and Appium are running successfully, notifications are allowed$")
  public void given() throws Throwable {
	   application = new Application();
	   application.startView = new StartView(application.driver);
	   application.startView.AllowNotification();
  }

  @When(value = "^I got started and use (.*) default address (.*)$")
  public void when(String city, String address) throws Throwable {
	   application.welcomeView = new WelcomeView(application.driver);
	   application.welcomeView.GetStarted();
	   application.locationView = new LocationView(application.driver);
	   application.locationView.AllowLocation();
	   application.mapView = new MapView(application.driver);
	   application.mapView.ClickAddressSearch().DeleteAddress().InputAddress(address); 
	   System.out.println((application.driver).getPageSource());
	   application.mapView = new MapView(application.driver);
	   application.mapView.SelectAddressFromList();
	   Thread.sleep(3000);
	   System.out.println((application.driver).getPageSource());
	   Thread.sleep(3000);
	   application.mapView.ConfirmAddress();
  }
  

*/
  @Then(value = "^Nothing happens$")
  public void then() throws Throwable {
	 Thread.sleep(300000);

  }
  /*
  @And(value = "^Pick default timeslots and service-class$")
  public void andPickDefaultTSAndSC() throws Throwable {
	 System.out.println((application.driver).getPageSource());
	 application.newOrderView = new NewOrderView(application.driver);
	 Thread.sleep(3000);
	 application.newOrderView.Continue();

  }
  
  @And(value = "^Fill correct default (.*) (.*) (.*) (.*) and save$")
  public void andFillCorrectDefaultContactDataAndSave(String firstname, String lastname, String phone, String email) throws Throwable {
	   application.driver.hideKeyboard();
	  application.contactDetailsView = new ContactDetailsView(application.driver);
	  application.contactDetailsView.InputFirstName(firstname).
	  								 InputLastName(lastname).
	  								 InputEmailAddress(email).
	  								 InputPhoneNumber(phone);
	  								
	  application.driver.getKeyboard().sendKeys("\n");
	  
	  //System.out.println((application.driver).getPageSource());
	  //application.contactDetailsView = new ContactDetailsView(application.driver);
	 // application.contactDetailsView.SaveContactDetails();
	  //Thread.sleep(5000);
	 // application.driver.getKeyboard().sendKeys(Keys.RETURN);
	  //application.driver.findElement(By.name("SAVE ADDRESS DETAILS")).click();
	  //application.contactDetailsView.SaveContactDetails();
	  
  }
  
  @And("^Save address details$")
  public void andSaveAddressDetails() throws Throwable {
	  application.addressDetailsView = new AddressDetailsView(application.driver);
      application.addressDetailsView.SaveAddressDetails();
    //  throw new PendingException();
      //for what that pedning exceptio - to define?
  }

  @And("^Use Sandbox PayPal$")
  public void use_Sandbox_PayPal() throws Throwable {
		Thread.sleep(5000);
		System.out.println("WEB VIEW");
		  System.out.println((application.driver).getPageSource());
		  System.out.println((application.driver.getContext()));
		  application.payPalView = new PayPalView(application.driver);
			Thread.sleep(3000);
			application.payPalView.ProceedWithSandbox();
			Thread.sleep(3000);
			application.paymentView = new PaymentView(application.driver);
			Thread.sleep(3000);
			System.out.println("SAVEPAYMENTDETAILS");
			System.out.println((application.driver).getPageSource());
			application.paymentView.SavePaymentDetails();

  }

  
  @And("^Fill correct default CC Visa (.*) and save$")
  public void fillVisaAndSave(String creditcard) throws Throwable {
	  application.paymentView = new PaymentView(application.driver);
	  application.paymentView.InputCreditCard(creditcard);
	  System.out.println((application.driver).getPageSource());
	  
	  
	// application.paymentView.FocusOnCardHolderField();
	 // application.driver.hideKeyboard();
	  application.paymentView = new PaymentView(application.driver);
	  application.paymentView.SavePaymentDetails();
	 //application.driver.getKeyboard().sendKeys(Keys.ENTER);
	 //application.driver.getKeyboard().sendKeys("\n");
	// application.paymentView.SavePaymentDetails();
     // throw new PendingException();
  }
 
  @And("^Select PayPal as a Payment method$")
  public void selectPayPalAsPaymentMethod() throws Throwable {
	  application.paymentView = new PaymentView(application.driver);
		 Thread.sleep(5000);
		  System.out.println("PAYMENT PAGE CODE!!!!!");
		  System.out.println((application.driver).getPageSource());
		 // application.paymentView.FocusOnCardHolderField();

	  application.paymentView.AddPayPal();
		Thread.sleep(5000);
	  System.out.println((application.driver).getPageSource());
	  System.out.println((application.driver.getContext()));
  }

  @And("^Confirm Order$")
  public void confirm_Order() throws Throwable {
	  application.orderSummaryView = new OrderSummaryView(application.driver);
	  application.orderSummaryView.AcceptTermasAndConditions().ConfirmOrder();
      //throw new PendingException();
  }
  
  
  @And(value = "^Accept default address details$")
  public void acceptyAddressDetails() throws Throwable {
	//  application.addressDetailsView = new AddressDetailsView(application.driver);
	 // application.addressDetailsView.InputFlatBuilding("randomflat").SaveAddressDetails();
  }
  
/*  @And(value = "^Fill correct default payment data$")
  public void andFillCorrectDefaultPaymentData() throws Throwable {
	  application.paymentView = new PaymentView(application.driver);
	  application.paymentView.InputCreditCard(Constants.CC_VISA).SavePaymentDetails();	 
	  application.driver.getKeyboard().sendKeys("\n");
  }*/
  

  /*
  @And(value = "^Confirm order$")
  public void confirmOrder() throws Throwable {
	  application.orderSummaryView = new OrderSummaryView(application.driver);
	  application.orderSummaryView.AcceptTermasAndConditions().ConfirmOrder();
  }

*/


}
