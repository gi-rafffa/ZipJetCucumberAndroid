package test.java.features.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.framework.Application;

public class PriceEstimatorForReturningCustomerStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
	
	
	@When("^I open Price Estimator$")
	public void IOpenPriceEstimator() throws Throwable {
		application = Application.getInstance();
		application.menuView = application.orderStatusView.OpenMenu();
		application.priceEstimatorView = application.menuView.OpenPriceList();
	}
	
	@And(value = "^Search for a Shirt$")
	public void SearchForAShirt () throws Throwable {
		application = Application.getInstance();
		application.priceEstimatorView.ClickSearch().InputShirt();

	}	
	
	@And(value = "^Search for a Foo$")
	public void SearchForAFoo () throws Throwable {
		application = Application.getInstance();
		application.priceEstimatorView.ClickSearch().InputFoo();

	}



	@Then(value = "^I see Shirt in the search results$")
	public void ShirtInTheSearchResult() throws Throwable {
		application = Application.getInstance();
		application.priceEstimatorView.CheckPositiveResults();
		 application.driver.quit();
		 application.setInstanceNull();
	}
	
	@Then(value = "^I see no items in the search results$")
	public void NoItemsInTheSearchResult() throws Throwable {
		application = Application.getInstance();
		application.priceEstimatorView.CheckNegativeResults();
		 application.driver.quit();
		 application.setInstanceNull();
	}
}
