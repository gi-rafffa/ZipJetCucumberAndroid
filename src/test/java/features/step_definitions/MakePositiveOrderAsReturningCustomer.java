package test.java.features.step_definitions;

import cucumber.api.java.en.And;
import test.java.framework.Application;
import test.java.views.AdditionalMapView;
import test.java.views.NewOrderView;
import test.java.views.OrderHistoryView;
import test.java.views.OrderStatusView;
import test.java.views.OrderSummaryView;


public class MakePositiveOrderAsReturningCustomer {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
	
	@And("^Open Order History$")
	public void andPuckNonDefaultDO() throws Throwable {
		application = Application.getInstance();
		//application.orderStatusView = new OrderStatusView(application.driver);
		application.orderStatusView.OpenOrderHistory();

	}
	
	@And("^Open New Order screen$")
	public void andOpenNewOrderScreen() throws Throwable {
		application = Application.getInstance();
		application.orderHistoryView = new OrderHistoryView(application.driver);
		application.orderHistoryView.StartNewOrder();
		application.newOrderView = new NewOrderView(application.driver);
		//wait.until(ExpectedConditions.elementToBeClickable(buttonSavePaymentDetailsCreditCard));

		
	}


	
	@And("^Continue placing the order$")
	public void andContinuePlacingTheOrder() throws Throwable {
		application = Application.getInstance();
		application.newOrderView.Continue();
	}

/*	
	@And("^Add New Address via Menu at the same city (.*)$")
	public void andAddNewAddressViaMenuAtTheSameCity(String city) throws Throwable {
		String address = null;
		application = Application.getInstance();
		if (city.equals("Berlin")) address = Constants.ANOTHER_SERVED_BERLIN;
		else{
			if (city.equals("London")) address = Constants.ANOTHER_SERVED_LONDON;
			else{
				if (city.equals("Paris")) address = Constants.ANOTHER_SERVED_PARIS;
				else{
					address = null;
				}
			}
		}
		
		application.menuView = application.orderStatusView.OpenMenu();
		application.addressesListView = application.menuView.OpenAddresses();
		application.additionalMapView = application.addressesListView.ClickAddAddress();
		application.additionalMapView.FocusOnAddressBar().DeleteAddress();
		Thread.sleep(6000);
		application.mapView.InputAddress(address); 
		application.mapView.ConfirmAdditionalAddress();
		
	
	}*/
	
	
	@And("^Add New Office Address via Menu$")
	public void andAddNewOfficeAddressViaMenu() throws Throwable {
		application = Application.getInstance();
		application.menuView = application.orderStatusView.OpenMenu();
		application.addressesListView = application.menuView.OpenAddresses();
		application.additionalMapView = application.addressesListView.ClickAddAddress(); 
		application.additionalMapView.ClickAddressSelector();
		application.additionalMapView = new AdditionalMapView(application.driver);
		application.additionalMapView.PickOfficeAddress();
		application.additionalMapView = new AdditionalMapView(application.driver);
		application.additionalMapView.ConfirmAdditionalAddress();
	}
	
	@And("^Add new PM via Menu$")
	public void andAddPPViaMenu() throws Throwable {
		application = Application.getInstance();
		application.orderStatusView = new OrderStatusView(application.driver);
		application.menuView = application.orderStatusView.OpenMenu();
		application.paymentsListView = application.menuView.OpenPM();
	}
	
	@And("^Pick another Address for new order$")
	public void andPickAnotherAddress() throws Throwable {
		application = Application.getInstance();
		application.menuView = application.addressesListView.OpenMenu();
		application.orderStatusView = application.menuView.OpenOrderStatuss();
		application.orderHistoryView = application.orderStatusView.OpenOrderHistory();
		application.newOrderView = application.orderHistoryView.StartNewOrder();
		//application.newOrderView.PickAnotherAddress();
		//application.newOrderView.Continue();
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
