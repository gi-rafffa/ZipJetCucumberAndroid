package test.java.features.step_definitions;

import cucumber.api.java.en.And;
import test.java.framework.Application;
import test.java.views.EditOrderView;
import test.java.views.OrderStatusView;
import test.java.views.RAFPopUpView;

public class OrderCancelationStepDefinition {
	
//	@SuppressWarnings("rawtypes")


	
	/*@And("^Close RAF Pop Up$")
	public void closeRAFPopUp() throws Throwable {
		Application application = Application.getInstance();
		application.RAFPopUpView = new RAFPopUpView(application.driver);
		application.RAFPopUpView.CloseRAFPopUp();
		application.orderStatusView = new OrderStatusView(application.driver);
	}*/
	
	//@And("^Open Edit order and cancel it$")
	/*public void openEditOrder() throws Throwable {
		Thread.sleep(3000);
		Application application = Application.getInstance();
		
		application.editOrderView = application.orderStatusView.ClickReschedule();
		application.editOrderView = application.editOrderView.CancelOrder();
		
		application.editOrderView = new EditOrderView(application.driver);
		Thread.sleep(3000);
		application.orderCanceledView = application.editOrderView.ConfrimCancelationOrder();
		Thread.sleep(3000);
		application.orderStatusView = application.orderCanceledView.ClickOk();	
		*/
	}

	



