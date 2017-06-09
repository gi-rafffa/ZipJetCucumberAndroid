package test.java.features.step_definitions;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import test.java.framework.Application;
import test.java.framework.Constants;
import test.java.views.AddressDetailsView;
import test.java.views.ContactDetailsView;
import test.java.views.MenuView;
import test.java.views.NewOrderView;
import test.java.views.OrderConfirmedView;
import test.java.views.OrderStatusView;
import test.java.views.OrderSummaryView;
import test.java.views.PayPalAgreementView;
import test.java.views.PayPalView;
import test.java.views.PaymentView;
import test.java.views.PaymentsListView;

public class MakePositiveOrderStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
	
	public MakePositiveOrderStepDefinition() throws Throwable{
		application = Application.getInstance();
	}
	
  @Given(value = "^ZipJet, Simulator and Appium are running successfully, notifications are allowed$")
  public void given() throws Throwable {
	   application = Application.getInstance();
  }

//to uncomment later - it's needed
  /*
  @When(value = "^I got started and use (.*) default address (.*)$")
  public void IGotStarted(String city, String address) throws Throwable {
		Application application = Application.getInstance();

		 Thread.sleep(20000);
	   application.welcomeView = new WelcomeView(application.driver);
	   application.welcomeView.Begin();
	   application.locationView = new LocationView(application.driver);
	   application.locationView.AllowLocation();
	   application.mapView = application.locationView.PickBerlin();
	   Thread.sleep(2000);
	   application.mapView.FocusOnAddressBar().DeleteAddress();
	   Thread.sleep(2000);
	   application.mapView.InputAddress(address); 
	   application.mapView.ConfirmAddress();
  }
  */
 

  @Then(value = "^Order is placed$")
  public void thenOrderIsPlaced() throws Throwable {
	  application = Application.getInstance();
	     application.orderConfirmedView = new OrderConfirmedView(application.driver);
		 application.orderConfirmedView.ClickOk();
		 application.driver.quit();
		 application.setInstanceNull();
		 
  }
  
  @Then(value = "^Order is placed and we continue test$")
  public void thenOrderIsPlacedTestContinue() throws Throwable {
	  application = Application.getInstance();
	  application.orderStatusView = new OrderStatusView(application.driver);
	  Assert.assertNotNull(application.orderStatusView.buttonOrderHistory, "There is no history((");
	  
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
	  application.orderStatusView = new OrderStatusView(application.driver);
	  if(application.orderStatusView.checkOrderListExistance())
	  {
		  application.driver.quit();
		  application.setInstanceNull();
	  }

  }
  
  @And(value = "^Close final splash$")
  public void andCloseFinalSplash() throws Throwable {
	  application.orderConfirmedView = new OrderConfirmedView(application.driver);
	  application.orderConfirmedView.ClickOk();
  }



  
  @And(value = "^Pick default timeslots and service-class$")
  public void andPickDefaultTSAndSC() throws Throwable {
	  application = Application.getInstance();


	 application.newOrderView = new NewOrderView(application.driver);

	 application.newOrderView.Continue();
  }
  
  @And(value = "^Open Edit order and reschedule it to the next day$")
  public void andEditOrderRescheduleNextDay() throws Throwable {
		application.editOrderView = application.orderStatusView.ClickReschedule();
		application.editOrderView.OpenDOList().PickDONextDay();
		application.orderStatusView = application.editOrderView.ClickConfirm();	
  }
  
  

  
  @And(value = "^Fill correct default (.*) (.*) (.*) (.*) and save$")
  public void andFillCorrectExampleContactDataAndSave(String firstname, String lastname, String phone, String email) throws Throwable {
	//  WebDriverWait wait = new WebDriverWait(application.driver, 20);
	  application.contactDetailsView = new ContactDetailsView(application.driver);
	  application.contactDetailsView.InputFirstName(firstname).
	  								 InputLastName(lastname).
	  								 InputEmailAddress(email).
	  								 InputPhoneNumber(phone);
	  
	   application.driver.pressKeyCode(4);
	   application.contactDetailsView.SaveContactDetails();
	   

	  								
  }
  
  @And("^Save address details$")
  public void andSaveAddressDetails() throws Throwable {
	  application.addressDetailsView = new AddressDetailsView(application.driver);
      application.addressDetailsView.SaveAddressDetails();
  }


  
  @And("^Use Test PayPal$")
  public void useTestPayPal() throws Throwable {
		Thread.sleep(5000);
		  System.out.println((application.driver.getContext()));
		  application.payPalView = new PayPalView(application.driver);
			Thread.sleep(3000);
			application.payPalView.InputTestEmail().InputTestPassword().LoginTestPayPal();
			Thread.sleep(4000);
			application.payPalAgreementView=new PayPalAgreementView(application.driver);
			Thread.sleep(4000);
			application.payPalAgreementView.Agree();
			Thread.sleep(3000);
			application.paymentView = new PaymentView(application.driver);
			Thread.sleep(3000);
			application.paymentView.SavePaymentDetailsCreditCard();

  }

  
  @And("^Open Order Status$")
  public void OpenOrderStatus() throws Throwable {
	  Thread.sleep(2000);
	  application.paymentsListView.OpenMenu();
	  Thread.sleep(2000);
	  application.menuView = new MenuView(application.driver);
	  application.orderStatusView = application.menuView.OpenOrderStatuss();
	  Thread.sleep(2000);
  }

  
  
  
  
  
  @And("^Fill correct CC Visa (.*) (.*) (.*) and save$")
  public void andFillCCAndSave(String creditcardnumber, String creditcarddate, String creditcardCVC) throws Throwable {
	  application.paymentView = new PaymentView(application.driver);
	  application.paymentView.InputCreditCardData(creditcardnumber, creditcarddate, creditcardCVC);
	  application.paymentView = new PaymentView(application.driver);
	  application.paymentView.SavePaymentDetailsCreditCard();
  }
 
  @And("^Select PayPal as a Payment method$")
  public void selectPayPalAsPaymentMethod() throws Throwable {
	  application.paymentView = new PaymentView(application.driver);
		 Thread.sleep(5000);
	  application.paymentView.AddPayPal();
		Thread.sleep(5000);
	  System.out.println((application.driver).getPageSource());
	  System.out.println((application.driver.getContext()));
  }
  
  @And("^Select PayPal as a Payment method for RC$")
  public void selectPayPalAsPaymentMethodAsRC() throws Throwable {
	  application.paymentsListView = new PaymentsListView(application.driver);
	  application.paymentView = application.paymentsListView.AddNewPM();
		// Thread.sleep(5000);
	  application.paymentView.AddPayPal();
		//Thread.sleep(5000);

  }

  @And("^Confirm Order$")
  public void confirm_Order() throws Throwable {
	  application = Application.getInstance();
	  application.orderSummaryView = new OrderSummaryView(application.driver);
	  Thread.sleep(5000);
	  application.orderSummaryView.AcceptTermasAndConditions();
	  Thread.sleep(2000);
	  application.orderSummaryView.ConfirmOrder();
  }
  
  
  @And(value = "^Fill correct default payment data$")
  public void andFillCorrectDefaultPaymentData() throws Throwable {
	  /*application.paymentView = new PaymentView(application.driver);
	  application.paymentView.InputCreditCard(Constants.CC_VISA).SavePaymentDetailsCreditCard();	 
	  application.driver.getKeyboard().sendKeys("\n");*/
  }

public void andFillConstantCCAndSave(String city) throws Throwable {
	application.paymentView = new PaymentView(application.driver);
	if (city.equals("Berlin")) application.paymentView.InputCreditCardData(Constants.CC_VISA_NUMBER,Constants.CC_VISA_DATE, Constants.CC_VISA_CVC);
	if (city.equals("London")) application.paymentView.InputCreditCardData(Constants.CC_MASTERCARD_NUMBER,Constants.CC_MASTERCARD_DATE, Constants.CC_MASTERCARD_CVC);
	if (city.equals("Paris")) application.paymentView.InputCreditCardData(Constants.CC_AMERICANEXPRESS_NUMBER,Constants.CC_AMERICANEXPRESS_DATE, Constants.CC_AMERICANEXPRESS_CVC);
	application.paymentView.SavePaymentDetailsCreditCard();
}
  

  
 



}
