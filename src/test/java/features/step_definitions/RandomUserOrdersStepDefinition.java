package test.java.features.step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
import test.java.framework.Application;
import test.java.framework.Constants;
import test.java.views.ContactDetailsView;
import test.java.views.LocationView;
import test.java.views.WelcomeView;


public class RandomUserOrdersStepDefinition {
	
	@SuppressWarnings("rawtypes")

	public  Application application;

	@And("^Fill correct random user data and save$")
	public void andFillCorrectRandomUserData() throws Throwable {
		  application = Application.getInstance();
		Fairy fairy = Fairy.create();
		Person person = fairy.person();
		  application.contactDetailsView = new ContactDetailsView(application.driver);
		  application.contactDetailsView.InputFirstName("TEST"+person.getFirstName()).
		  								 InputLastName(person.getLastName()).
		  								 InputEmailAddress(person.getEmail()).
		  								 InputPhoneNumber(person.getTelephoneNumber().replace("-", ""));	
		  application.driver.pressKeyCode(4);
		   application.contactDetailsView.SaveContactDetails();


	}
	
/*	@When("^I got started and use (.*) default address$")
	public void whenIGotStartedAndUseDefauldAddress(String city) throws Throwable {
		Application application = Application.getInstance();	
		MakePositiveOrderStepDefinition positiveorder = new MakePositiveOrderStepDefinition();
			if (city.equals("Berlin")) positiveorder.IGotStarted(city, Constants.SERVED_BERLIN);
			if (city.equals("London")) positiveorder.IGotStarted(city, Constants.SERVED_LONDON);
			if (city.equals("Paris")) positiveorder.IGotStarted(city, Constants.SERVED_PARIS);
		   
	}
	*/
	  @When(value = "^Empty condition$")
	  public void emptycondition() throws Throwable {
		  //application = Application.getInstance();
		  System.out.println("empty condition");
		 Thread.sleep(3000);
	  }
	  
	@When("^I got started and use Berlin default address$")
	public void whenberlin() throws Throwable {
		application = Application.getInstance();	
		//MakePositiveOrderStepDefinition positiveorder = new MakePositiveOrderStepDefinition();
	System.out.println("the second when");
	 Thread.sleep(10000);
	  

	   application.welcomeView = new WelcomeView(application.driver);
	   application.welcomeView.Begin();
	   application.locationView = new LocationView(application.driver);
	   application.locationView.AllowLocation();
	   application.mapView = application.locationView.PickBerlin();
	   Thread.sleep(2000);
	   application.mapView.FocusOnAddressBar().DeleteAddress();
	   Thread.sleep(2000);
	   application.mapView.InputAddress(Constants.SERVED_BERLIN); 
	   application.mapView.ConfirmAddress();
	
	
		//positiveorder.IGotStarted("Berlin", Constants.SERVED_BERLIN);
			
		   
	}

	@And("^Fill correct Credit Card for (.*) and save$")
	public void andFillCorrectCCForCity(String city) throws Throwable {
		MakePositiveOrderStepDefinition positiveorder = new MakePositiveOrderStepDefinition();
		positiveorder.andFillConstantCCAndSave(city);
	}

	
	
	

}
