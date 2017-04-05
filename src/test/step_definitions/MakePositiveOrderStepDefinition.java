package test.step_definitions;

import static org.testng.AssertJUnit.assertNotNull;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.locator.*;
import test.framework.Application;
import test.framework.Constants;
import test.views.AddressDetailsView;
import test.views.ContactDetailsView;
import test.views.EditOrderView;
import test.views.LocationView;
import test.views.MapView;
import test.views.NewOrderView;
import test.views.OrderCanceledView;
import test.views.OrderConfirmedView;
import test.views.OrderStatusView;
import test.views.OrderSummaryView;
import test.views.PayPalView;
import test.views.PaymentView;
import test.views.RAFPopUpView;
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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;


public class MakePositiveOrderStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
	
	public MakePositiveOrderStepDefinition() throws Throwable{
		application = Application.getInstance();
	}
	
  //no notifications in Android - text was not changed for consistency	
  @Given(value = "^ZipJet, Simulator and Appium are running successfully, notifications are allowed$")
  public void given() throws Throwable {
	   application = Application.getInstance();
  }


  
  @When(value = "^I got started and use (.*) default address (.*)$")
  public void when(String city, String address) throws Throwable {
		 Thread.sleep(20000);
		   System.out.println("starting grabbing data");
		   System.out.println((application.driver).getPageSource());
	   application.welcomeView = new WelcomeView(application.driver);
	  // Thread.sleep(1000000);
	   application.welcomeView.Begin();
	  // application.welcomeView.GetStarted();
	   //application.locationView = new LocationView(application.driver);
	   //application.locationView.AllowLocation();
	   //application.mapView = application.locationView.PickBerlin();
	   //System.out.println((application.driver).getPageSource());
	  // application.mapView.DeleteAddress();//.InputAddress(address); 
	  //application.mapView = new MapView(application.driver);  
	   //application.mapView.SelectAddressFromList();
	  // application.driver.swipe(120, 120, 160, 160, 3);
	   //application.mapView = new MapView(application.driver);
	   //application.mapView.ConfirmAddress();
  }
  
 

  @Then(value = "^Order is placed$")
  public void thenOrderIsPlaced() throws Throwable {
	 /*    application.orderConfirmedView = new OrderConfirmedView(application.driver);
		 application.orderConfirmedView.ClickOk();
		 application.driver.quit();
		 application.setInstanceNull();*/
		 
  }
  
  @Then(value = "^Order is placed and we continue test$")
  public void thenOrderIsPlacedTestContinue() throws Throwable {
	     /*application.RAFPopUpView = new RAFPopUpView(application.driver);
		 application.RAFPopUpView.CloseRAFPopUp();*/
  }
  
  @Then(value = "^Order is canceled and I see New Order Screen$")
  public void thenOrderIsCanceled() throws Throwable {
	 /* Thread.sleep(9000);
	  application.newOrderView = new NewOrderView(application.driver);
	  assertNotNull(application.newOrderView.getButtonContinue());
	  application.driver.quit();
	  application.setInstanceNull();*/
	  
  }
  
  @Then(value = "^Order is rescheduled$")
  public void thenOrderIsRescheduled() throws Throwable {
	 /* application.orderStatusView = new OrderStatusView(application.driver);
	  if(application.orderStatusView.checkOrderListExistance())
	  {
		  //log here passed test
		  application.driver.quit();
		  application.setInstanceNull();
	  }
*/
  }
  
  @And(value = "^Close final splash$")
  public void andCloseFinalSplash() throws Throwable {
	/*  application.orderConfirmedView = new OrderConfirmedView(application.driver);
	  application.orderConfirmedView.ClickOk();*/
  }



  
  @And(value = "^Pick default timeslots and service-class$")
  public void andPickDefaultTSAndSC() throws Throwable {
	/* System.out.println((application.driver).getPageSource());
	 application.newOrderView = new NewOrderView(application.driver);
	 application.newOrderView.Continue();*/
  }
  
  @And(value = "^Open Edit order and reschedule it to the next day$")
  public void andEditOrderRescheduleNextDay() throws Throwable {
		/*application.editOrderView = application.orderStatusView.ClickReschedule();
		application.editOrderView.OpenDOList().PickDONextDay();
		application.orderStatusView = application.editOrderView.ClickConfirm();	*/
  }
  
  

  
  @And(value = "^Fill correct default (.*) (.*) (.*) (.*) and save$")
  public void andFillCorrectExampleContactDataAndSave(String firstname, String lastname, String phone, String email) throws Throwable {
	/*  WebDriverWait wait = new WebDriverWait(application.driver, 20);
	  
	  application.driver.hideKeyboard();
	  application.contactDetailsView = new ContactDetailsView(application.driver);
	  application.contactDetailsView.InputFirstName(firstname).
	  								 InputLastName(lastname).
	  								 InputEmailAddress(email).
	  								 InputPhoneNumber(phone);
	  								
	  application.driver.getKeyboard().sendKeys("\n");*/
  }
  
  @And("^Save address details$")
  public void andSaveAddressDetails() throws Throwable {
	 /* application.addressDetailsView = new AddressDetailsView(application.driver);
      application.addressDetailsView.SaveAddressDetails();*/
  }

  @And("^Use Sandbox PayPal$")
  public void use_Sandbox_PayPal() throws Throwable {
		/*Thread.sleep(5000);
		System.out.println("WEB VIEW");
		  System.out.println((application.driver).getPageSource());
		  System.out.println((application.driver.getContext()));
		  application.payPalView = new PayPalView(application.driver);
			Thread.sleep(3000);
			application.payPalView.ProceedWithSandbox();
			Thread.sleep(3000);
			application.paymentView = new PaymentView(application.driver);
			Thread.sleep(3000);
			application.paymentView.SavePaymentDetailsPayPal();*/

  }

  
  @And("^Fill correct default CC Visa (.*) and save$")
  public void andFillCCAndSave(String creditcard) throws Throwable {
	 /* application.paymentView = new PaymentView(application.driver);
	  application.paymentView.InputCreditCard(creditcard);
	  application.paymentView = new PaymentView(application.driver);
	  application.paymentView.SavePaymentDetailsCreditCard();*/
  }
 
  @And("^Select PayPal as a Payment method$")
  public void selectPayPalAsPaymentMethod() throws Throwable {
	 /* application.paymentView = new PaymentView(application.driver);
		 Thread.sleep(5000);
	  application.paymentView.AddPayPal();
		Thread.sleep(5000);
	  System.out.println((application.driver).getPageSource());
	  System.out.println((application.driver.getContext()));*/
  }

  @And("^Confirm Order$")
  public void confirm_Order() throws Throwable {
	/*  application = Application.getInstance();
	  application.orderSummaryView = new OrderSummaryView(application.driver);
	  Thread.sleep(5000);
	  application.orderSummaryView.AcceptTermasAndConditions();
	  Thread.sleep(2000);
	  application.orderSummaryView.ConfirmOrder();*/
  }
  
  
  @And(value = "^Fill correct default payment data$")
  public void andFillCorrectDefaultPaymentData() throws Throwable {
	  /*application.paymentView = new PaymentView(application.driver);
	  application.paymentView.InputCreditCard(Constants.CC_VISA).SavePaymentDetailsCreditCard();	 
	  application.driver.getKeyboard().sendKeys("\n");*/
  }
  

  
 



}
