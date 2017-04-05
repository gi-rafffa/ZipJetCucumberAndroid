package test.step_definitions;

import static org.testng.AssertJUnit.assertNotNull;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.locator.*;
import test.framework.Application;
import test.framework.Constants;
import test.views.AddressDetailsView;
import test.views.ContactDetailsView;
import test.views.EditOrderView;
import test.views.LocationView;
import test.views.MapView;
import test.views.NewOrderView;
import test.views.NonServedAreaView;
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
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.FluentWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;


public class MakeNegativeOrderStepDefinition {
	
	@SuppressWarnings("rawtypes")
	//public IOSDriver driver;
	public  Application application;
	
	@When("^I got started and use (.*) non-served address (.*)$")
	public void whenIStartAnaUseNonservedAddress(String city, String address) throws Throwable {
		   application = Application.getInstance();
		   application.welcomeView = new WelcomeView(application.driver);
		   application.welcomeView.GetStarted();
		   application.locationView = new LocationView(application.driver);
		   application.locationView.AllowLocation();
		   application.mapView = new MapView(application.driver);
		   application.mapView.ClickAddressSearch().DeleteAddress().InputAddress(address); 
		   application.mapView = new MapView(application.driver);
		   application.mapView.SelectAddressFromList();
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

	@Then("^Map is displayed$")
	public void thenMapIsDisplayed() throws Throwable {
		System.out.println((application.driver).getPageSource());
		application.mapView = new MapView(application.driver);
		assertNotNull(application.mapView.getButtonConfirmAddress());
	   application.setInstanceNull();
	   application.driver.quit();
	}
	
	@And("^Fill already existed (.*) (.*) (.*) (.*) and save$")
	public void andFillAlreadyExistedUserData(String firstname, String lastname, String email, String phone) throws Throwable {
		application = Application.getInstance();      
		application.driver.hideKeyboard();
			  application.contactDetailsView = new ContactDetailsView(application.driver);
			  application.contactDetailsView.InputFirstName(firstname).
			  								 InputLastName(lastname).
			  								 InputEmailAddress(email).
			  								 InputPhoneNumber(phone);
			  								
			  application.driver.getKeyboard().sendKeys("\n");
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
		application.contactDetailsView = new ContactDetailsView(application.driver);

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(application.driver)
												.withTimeout(45, TimeUnit.SECONDS)//Sets how long to wait for the evaluated condition to be true.
												.pollingEvery(2, TimeUnit.SECONDS)//Sets how often the condition should be evaluated.
//Configures this instance to ignore specific types of exceptions while waiting for a condition.
												.ignoring(NoSuchElementException.class).ignoring(NoSuchFieldException.class)
												.withMessage("Time expired");

		application.contactDetailsView.LoginClick();
	}

	@Then("^I redirected to the start screen$")
	public void i_redirected_to_the_start_screen() throws Throwable {
		application = Application.getInstance();
		application.welcomeView = new WelcomeView (application.driver);
		application.welcomeView.isLoaded(By.xpath("//XCUIElementTypeButton[@name=\"LOGIN\"]"));
		assertNotNull(application.welcomeView.getButtonGetStarted());
		application.driver.quit();

	}




}
