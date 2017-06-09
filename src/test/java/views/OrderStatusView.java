package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderStatusView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close dark\"]")
	private MobileElement buttonClose;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Pick Up View\"]")
	private MobileElement textStatus;
	
	//rescheduleLinearLayout
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@resource-id, 'rescheduleLinearLayout')]")
	private MobileElement buttonReschedule;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Add to calendar\"]")
	private MobileElement buttonAddToCalendar;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'orderHistoryMenuItem')]")
	public MobileElement buttonOrderHistory;

	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@index, '0')]")
	private MobileElement buttonMenu;
	
	public OrderStatusView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public MenuView OpenMenu() throws Throwable{
		buttonMenu.click();
		return new MenuView(driver);
	}
	

	public OrderHistoryView OpenOrderHistory() throws Throwable{
		buttonOrderHistory.click();
		return new OrderHistoryView(driver);
	}
	
	
	public EditOrderView ClickReschedule() throws Throwable{
		buttonReschedule.click();
		return new EditOrderView(this.driver);
	}



	public boolean checkOrderListExistance() {
		return IsElementPresent(buttonOrderHistory);
	}

	
	
	

}
