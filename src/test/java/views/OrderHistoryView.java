package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderHistoryView extends AbstractView {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close dark\"]")
	private MobileElement buttonCloseHistory;
	 
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'newOrderFloatingActionButton')]")
	private MobileElement buttonNewOrder;
	
	
	public OrderHistoryView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public NewOrderView  StartNewOrder() throws Throwable{
		buttonNewOrder.click();
		return new NewOrderView(driver);
		
	}
	
	public void CloseOrderHistory(){
	
	}

}
