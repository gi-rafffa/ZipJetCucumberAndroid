package test.java.features.step_definitions;

import static org.testng.AssertJUnit.assertNotNull;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.java.framework.Application;
import test.java.views.ContactDetailsView;
import test.java.views.LocationView;
import test.java.views.LoginView;
import test.java.views.NonServedAreaView;
import test.java.views.WelcomeView;


public class MakeNegativeOrderStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
	
	@When("^I got started and use (.*) non-served address (.*)$")
	public void whenIStartAnaUseNonservedAddress(String city, String address) throws Throwable {
		   application = Application.getInstance();
		   Thread.sleep(20000);
		   application.welcomeView = new WelcomeView(application.driver);
		   application.welcomeView.Begin();
		   application.locationView = new LocationView(application.driver);
		   application.locationView.AllowLocation();
		   application.mapView = application.locationView.PickBerlin();
		   System.out.println((application.driver).getPageSource());
		   Thread.sleep(2000);
		   application.mapView.FocusOnAddressBar().DeleteAddress();
		   Thread.sleep(2000);
		   application.mapView.InputAddress(address); 
		   application.mapView.ConfirmAddress();
	}

	@Then("^I see non-served page$")
	public void i_see_non_served_page() throws Throwable {
		  application.nonServedAreaView = new NonServedAreaView(application.driver);
		  assertNotNull( application.nonServedAreaView.getButtonKeepMePosted());
	}

	@When("^I input my email and confirm$")
	public void whenIInputEmailAndConfirm() throws Throwable {
		application.nonServedAreaView.InputEmail("fake@email.com");
		System.out.println((application.driver).getPageSource());
		application.nonServedAreaView = new NonServedAreaView(application.driver);
		application.nonServedAreaView.KeepMePosted();

	}

	@Then("^Non-served screen is displayed$")
	public void thenMapIsDisplayed() throws Throwable {
		application.nonServedAreaView = new NonServedAreaView(application.driver);
		assertNotNull(application.nonServedAreaView.getButtonKeepMePosted());
	   application.setInstanceNull();
	   application.driver.quit();
	}
	
	@And("^Fill already existed (.*) (.*) (.*) (.*) and save$")
	public void andFillAlreadyExistedUserData(String firstname, String lastname, String email, String phone) throws Throwable {
		application = Application.getInstance();      
			  application.contactDetailsView = new ContactDetailsView(application.driver);
			  application.contactDetailsView.InputFirstName(firstname).
			  								 InputLastName(lastname).
			  								 InputEmailAddress(email).
			  								 InputPhoneNumber(phone);
			  								
			  application.driver.pressKeyCode(4);
			  application.contactDetailsView.SaveContactDetails();
			  
	}

	@Then("^I see button Login$")
	public void i_see_button_Login() throws Throwable {
		application = Application.getInstance();
		  application.contactDetailsView = new ContactDetailsView(application.driver);
		  assertNotNull(application.contactDetailsView.getButtonLogin());

	}

	@When("^I press Login$")
	public void i_press_Login() throws Throwable {
		application = Application.getInstance();
		Thread.sleep(2000);
		application.contactDetailsView = new ContactDetailsView(application.driver);
		System.out.println(application.driver.getPageSource());
		application.contactDetailsView.LoginClick();
	}

	@Then("^I redirected to the login screen$")
	public void i_redirected_to_the_start_screen() throws Throwable {
		application = Application.getInstance();
		application.loginView = new LoginView (application.driver);
		application.loginView.isLoginViewDispalyed();
		application.driver.quit();
		application.driver = null;

	}




}
