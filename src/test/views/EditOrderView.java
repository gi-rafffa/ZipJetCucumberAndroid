package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class EditOrderView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"TrashRed\"]")
	private MobileElement buttonCancelOrder;
	 
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Menu\"]")
	private MobileElement buttonMenu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav dark\"]")
	private MobileElement buttonClose;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
	private MobileElement buttonDone;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONFIRM\"]")
	private MobileElement buttonConfirm;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Cancel order\"]")
	private MobileElement buttonConfirmCancelOrder;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Time Slots Picker View\"]/XCUIElementTypeTable/XCUIElementTypeCell[6]")
	private MobileElement cellLastDayInColumn;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Pick Up\"]")
	private MobileElement controlPickUp;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Drop Off\"]")
	private MobileElement controlDropOff;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"RAF\"]")
	private MobileElement buttonRAF;

/*	
	//first row in the table with search results
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	private MobileElement firstAddress;*/
	
	public EditOrderView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public EditOrderView OpenPUList() throws Throwable{
		controlPickUp.click();
		 System.out.println((this.driver).getPageSource());
		return new EditOrderView(this.driver);
	}
	
	public EditOrderView PickDONextDay() throws Throwable{
		controlDropOff.click();
		Thread.sleep(2000);
		  //System.out.println((this.driver).getPageSource());
		  //Thread.sleep(2000); 
		  cellLastDayInColumn.click(); 
		  Thread.sleep(2000);
		  //System.out.println((this.driver).getPageSource());
		  //Thread.sleep(2000);
		  buttonDone.click();
		  Thread.sleep(4000);
		  System.out.println((this.driver).getPageSource());
		return new EditOrderView(this.driver);
	}
	
	
	
	public EditOrderView OpenDOList() throws Throwable{
		controlDropOff.click();
		  System.out.println((this.driver).getPageSource());
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
		 Thread.sleep(8000);
		return new OrderStatusView(this.driver);
	}
	
	public EditOrderView CancelOrder() throws Throwable{
		buttonCancelOrder.click();
		return this;
	}
	
	public void OpenOrderListh(){


	}
	
	
	

}
