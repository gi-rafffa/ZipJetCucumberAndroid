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
import test.views.OrderHistoryView;
import test.views.OrderStatusView;
import test.views.OrderSummaryView;
import test.views.PayPalView;
import test.views.PaymentView;
import test.views.PaymentsListView;
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


public class MakePositiveOrderAsReturningCustomer {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
	
	@And("^Open Order History$")
	public void andPuckNonDefaultDO() throws Throwable {
		application = Application.getInstance();
		application.orderStatusView = new OrderStatusView(application.driver);
		application.orderStatusView.OpenOrderHistory();

	}
	
	@And("^Open New Order screen$")
	public void andOpenNewOrderScreen() throws Throwable {
		application = Application.getInstance();
		application.orderHistoryView = new OrderHistoryView(application.driver);
		application.orderHistoryView.StartNewOrder();
		application.newOrderView = new NewOrderView(application.driver);
		application.newOrderView.findElementWithTimeout(By.xpath("//XCUIElementTypeStaticText[@value=\"Pick Up\"]"),7);
		application.newOrderView.isLoaded(By.xpath("//XCUIElementTypeStaticText[@value=\"Pick Up\"]"));
	}


	
	@And("^Continue placing the order$")
	public void andContinuePlacingTheOrder() throws Throwable {
		application = Application.getInstance();
		application.newOrderView.Continue();
	}

	
	@And("^Add New Address via Menu$")
	public void andAddNewAddressViaMenu() throws Throwable {
		application = Application.getInstance();
		application.menuView = application.newOrderView.openMenu();
		application.addressesListView = application.menuView.OpenAddresses();
		application.mapView = application.addressesListView.ClickAddAddress();
		application.mapView.FocusOnAddressBar().DeleteAddress().InputAddress(Constants.ANOTHER_SERVED_BERLIN).SelectAddressFromList().SaveNewAddress();
		application.menuView = application.addressesListView.OpenMenu();
		application.menuView.CloseMenu();
	}
	
	@And("^Add PayPal via Menu$")
	public void andAddPPViaMenu() throws Throwable {
		application = Application.getInstance();
		application.menuView = application.newOrderView.openMenu();
		application.paymentsListView = application.menuView.OpenPM();
		application.paymentsListView.AddPayPal();
		application.payPalView = new PayPalView(application.driver);
		application.payPalView.ProceedWithSandbox();
		application.paymentsListView = new PaymentsListView(application.driver);
		application.menuView = application.paymentsListView.OpenMenu();
		application.menuView.CloseMenu();
	}
	
	@And("^Pick another Address$")
	public void andPickAnotherAddress() throws Throwable {
		application = Application.getInstance();
		Thread.sleep(3000);
		application.newOrderView.OpenAddressList();
		Thread.sleep(3000);
		application.newOrderView.PickAnotherAddress();
		application.newOrderView.Continue();
	}

	
	@And("^Add New PM via Menu$")
	public void andAddNewPPViaMenu() throws Throwable {
		application = Application.getInstance();
		application.newOrderView.Continue();
	}
	
	@And("^Pick another PM$")
	public void andPickAnotherPM() throws Throwable {
		application = Application.getInstance();
		application.newOrderView.Continue();
	}
	
	@And("^Add New PM via Screen$")
	public void andAddNewPMViaScreen() throws Throwable {
		application = Application.getInstance();
		application.newOrderView.Continue();
	}
	
	@And("^Add New Address via Screen$")
	public void andAddNewAddressViaScreen() throws Throwable {
		application = Application.getInstance();
		application.newOrderView.Continue();
	}

	@And("^Confirm order-agreed$")
	public void andConfirmOrderAlreadyAgreed() throws Throwable {
		application = Application.getInstance();
		application.orderSummaryView = new OrderSummaryView(application.driver);
		application.orderSummaryView.ConfirmOrder();
	}

	

	

}
