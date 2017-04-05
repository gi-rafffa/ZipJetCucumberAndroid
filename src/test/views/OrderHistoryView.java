package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderHistoryView extends AbstractView {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close dark\"]")
	private MobileElement buttonCloseHistory;
	 
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CirclePlus\"]")
	private MobileElement buttonNewOrder;
	
	
	public OrderHistoryView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public void  StartNewOrder(){
		buttonNewOrder.click();
		
	}
	
	public void CloseOrderHistory(){
	
	}

}
