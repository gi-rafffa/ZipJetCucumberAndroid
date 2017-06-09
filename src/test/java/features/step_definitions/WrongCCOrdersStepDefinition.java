package test.java.features.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import test.java.framework.Application;
import test.java.framework.Constants;
import test.java.views.OrderSummaryView;


public class WrongCCOrdersStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
/*

	@And("^Fill incorrect Credit Card for (.*) and save$")
	public void andFillCorrectCCForCity(String city) throws Throwable {
		MakePositiveOrderStepDefinition positiveorder = new MakePositiveOrderStepDefinition();
		if (city.equals("Berlin")) positiveorder.andFillCCAndSave(Constants.CC_VISA_NUMBER, Constants.CC_VISA_DATE_WRONG, Constants.CC_VISA_CVC);
		if (city.equals("London")) positiveorder.andFillCCAndSave(Constants.CC_MASTERCARD_NUMBER_WRONG, Constants.CC_MASTERCARD_DATE, Constants.CC_MASTERCARD_CVC);
		if (city.equals("Paris")) positiveorder.andFillCCAndSave(Constants.CC_AMERICANEXPRESS_NUMBER, Constants.CC_AMERICANEXPRESS_DATE, Constants.CC_AMERICANEXPRESS_CVC_WRONG);
	}
	

	  @Then(value = "^I stay on Order Summary screen$")
	  public void thenIRedirectedToThePaymentScreen() throws Throwable {
		  	application = Application.getInstance();
		     application.orderSummaryView = new OrderSummaryView(application.driver);
			 application.orderSummaryView.isSummaryViewDispalyed();
			 application.driver.quit();
			 application.setInstanceNull();
			 
	  }
	
	
	*/

}
