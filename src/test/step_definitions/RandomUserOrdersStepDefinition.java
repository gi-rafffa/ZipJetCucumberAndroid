package test.step_definitions;

import static org.testng.AssertJUnit.assertNotNull;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.locator.*;
import io.codearte.jfairy.Fairy;
import io.codearte.jfairy.producer.person.Person;
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
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.AssertJUnit;


public class RandomUserOrdersStepDefinition {
	
	@SuppressWarnings("rawtypes")
	//public IOSDriver driver;     application = Application.getInstance();
	public  Application application;

	@And("^Fill correct random user data and save$")
	public void andFillCorrectRandomUserData() throws Throwable {
		  application = Application.getInstance();
		Fairy fairy = Fairy.create();
		Person person = fairy.person();
		  application.driver.hideKeyboard();
		  application.contactDetailsView = new ContactDetailsView(application.driver);
		  application.contactDetailsView.InputFirstName(person.getFirstName()).
		  								 InputLastName(person.getLastName()).
		  								 InputEmailAddress(person.getEmail()).
		  								 InputPhoneNumber(person.getTelephoneNumber());						
		  application.driver.getKeyboard().sendKeys("\n");
	}
	
	@When("^I got started and use (.*) default address$")
	public void whenIGotStartedAndUseDefauldAddress(String city) throws Throwable {
			MakePositiveOrderStepDefinition positiveorder = new MakePositiveOrderStepDefinition();
			if (city.equals("Berlin")) positiveorder.when(city, Constants.SERVED_BERLIN);
			if (city.equals("London")) positiveorder.when(city, Constants.SERVED_LONDON);
			if (city.equals("Paris")) positiveorder.when(city, Constants.SERVED_PARIS);
		   
	}

	@And("^Fill correct Credit Card for (.*) and save$")
	public void andFillCorrectCCForCity(String city) throws Throwable {
		MakePositiveOrderStepDefinition positiveorder = new MakePositiveOrderStepDefinition();
		if (city.equals("Berlin")) positiveorder.andFillCCAndSave(Constants.CC_VISA);
		if (city.equals("London")) positiveorder.andFillCCAndSave(Constants.CC_MASTERCARD);
		if (city.equals("Paris")) positiveorder.andFillCCAndSave(Constants.CC_AMERICANEXPRESS);
		
	}

	
	
	

}
