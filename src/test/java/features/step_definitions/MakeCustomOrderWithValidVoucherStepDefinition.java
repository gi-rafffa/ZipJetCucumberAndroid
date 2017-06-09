package test.java.features.step_definitions;

import cucumber.api.java.en.And;
import test.java.framework.Application;
import test.java.views.NewOrderView;


public class MakeCustomOrderWithValidVoucherStepDefinition {
	
	@SuppressWarnings("rawtypes")
	public  Application application;
		
	@And("^Apply VALID (.*) voucher (.*) with value (.+) valid for (.*) customer$")
	public void andApplyVALIDVoucher(String type, String voucher, float value, String customerType) throws Throwable {
		application = Application.getInstance();
		 application.newOrderView = new NewOrderView(application.driver);
		application.voucherView = application.newOrderView.voucherClick();
		application.newOrderView = application.voucherView.inputVoucher(voucher).confirmVoucher(voucher);

	}
	

}
