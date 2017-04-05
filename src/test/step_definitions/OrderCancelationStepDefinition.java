package test.step_definitions;

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

public class OrderCancelationStepDefinition {
	
	@SuppressWarnings("rawtypes")
	//public IOSDriver driver;

	
	@And("^Close RAF Pop Up$")
	public void closeRAFPopUp() throws Throwable {
		Application application = Application.getInstance();
		
		//Thread.sleep(7000);
		//System.out.println((application.driver).getPageSource());
		application.RAFPopUpView = new RAFPopUpView(application.driver);
		application.RAFPopUpView.CloseRAFPopUp();
		application.orderStatusView = new OrderStatusView(application.driver);
	}
	
	@And("^Open Edit order and cancel it$")
	public void openEditOrder() throws Throwable {
		Thread.sleep(3000);
		
		Application application = Application.getInstance();
		
		application.editOrderView = application.orderStatusView.ClickReschedule();
		application.editOrderView = application.editOrderView.CancelOrder();
		System.out.println((application.driver).getPageSource());
		application.editOrderView = new EditOrderView(application.driver);
		Thread.sleep(3000);
		application.orderCanceledView = application.editOrderView.ConfrimCancelationOrder();
		Thread.sleep(3000);
		application.orderStatusView = application.orderCanceledView.ClickOk();	
		
	}

	


}
