package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditOrderView extends AbstractView {
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'delete_order_option_item')]")
	private MobileElement buttonCancelOrder;
	 
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Menu\"]")
	private MobileElement buttonMenu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav dark\"]")
	private MobileElement buttonClose;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'doneTextView')]")
	private MobileElement buttonDone;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'editOrderContinueButton')]")
	private MobileElement buttonConfirm;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Cancel order')]")
	private MobileElement buttonConfirmCancelOrder;

	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@index, '3')]")
	private MobileElement cellLastDayInColumn;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'pickUpTimingTextView')]")
	private MobileElement controlPickUp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'dropOffTimingTextView')]")
	private MobileElement controlDropOff;
	
	
	
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"RAF\"]")
	private MobileElement buttonRAF;
	
	public EditOrderView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public EditOrderView OpenPUList() throws Throwable{
		controlPickUp.click();
		 System.out.println((this.driver).getPageSource());
		return new EditOrderView(this.driver);
	}
	
	public EditOrderView PickDONextDay() throws Throwable{
		//Thread.sleep(2000);; 
		  cellLastDayInColumn.click(); 
		  //Thread.sleep(2000);
		  buttonDone.click();
		  //Thread.sleep(4000);
		return new EditOrderView(this.driver);
	}
	
	
	
	public EditOrderView OpenDOList() throws Throwable{
		controlDropOff.click();
		return new EditOrderView(this.driver);
	}
	
	public void OpenMenu(){
		buttonMenu.click();
	}
	
	public OrderCanceledView ConfrimCancelationOrder() throws Throwable{
		buttonConfirmCancelOrder.click();
		return new OrderCanceledView(this.driver);
	}
	
	public OrderStatusView ClickConfirm() throws Throwable{
		System.out.println((this.driver).getPageSource());
		buttonConfirm.click();
		 Thread.sleep(7000);
		return new OrderStatusView(this.driver);
	}
	
	public EditOrderView CancelOrder() throws Throwable{
		buttonCancelOrder.click();
		return this;
	}
	
	public void OpenOrderListh(){


	}
	
	
	

}
