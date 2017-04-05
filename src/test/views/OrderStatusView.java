package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderStatusView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close dark\"]")
	private MobileElement buttonClose;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Pick Up View\"]")
	private MobileElement textStatus;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Reschedule\"]")
	private MobileElement buttonReschedule;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add to calendar\"]")
	private MobileElement buttonAddToCalendar;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"EyeIcon\"]")
	private MobileElement buttonOrderHistory;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"RAF\"]")
	private MobileElement buttonRAF;
	
	public OrderStatusView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	
	public void OpenRAF(){
		buttonRAF.click();
	}
	
	public void OpenOrderHistory(){
		buttonOrderHistory.click();
	}
	
	
	public EditOrderView ClickReschedule() throws Throwable{
		buttonReschedule.click();
		return new EditOrderView(this.driver);
	}



	public boolean checkOrderListExistance() {
		return IsElementPresent(buttonOrderHistory);
	}

	
	
	

}
