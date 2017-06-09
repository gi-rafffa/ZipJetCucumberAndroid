package test.java.features.step_definitions;
import cucumber.api.java.en.And;
import test.java.framework.Application;
import test.java.views.NewOrderView;


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
	
	@And("^Pick default SC$")
	public void andPickDefaultSC() throws Throwable {
		System.out.println("Here doing nothing");
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
		application.newOrderView.SelectRandomSC();
		application.newOrderView = new NewOrderView(application.driver);

	}

	
	

}
