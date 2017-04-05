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


public class MakeCustomOrderStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;

	
	@And("^Pick non-default PU timeslot$")
	public void andPuckNonDefaultPU() throws Throwable {
		application = Application.getInstance();
		application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.OpenPUSelector();
	    application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.PickRandomPUDODateTime();
	}
	
	@And("^Pick non-default DO timeslot$")
	public void andPuckNonDefaultDO() throws Throwable {
		application = Application.getInstance();
		application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.OpenDOSelector();
		application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.PickRandomPUDODateTime();
	}

	
	
	@And("^Confirm all non-default order parametrs$")
	public void andConfirmNondefaultOrder() throws Throwable {
		application = Application.getInstance();
		application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.Continue();

	}
	
	@And("^Pick non-default SC$")
	public void andPuckNonDefaultSC() throws Throwable {
		application = Application.getInstance();
		application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.SelectMiddleSC();
	}

	
	

}
