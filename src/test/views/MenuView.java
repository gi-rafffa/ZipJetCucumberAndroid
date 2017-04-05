package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import test.framework.Application;
import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MenuView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Addresses\"]")
	private MobileElement buttonAddresses;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Payment Options\"]")
	private MobileElement buttonPM;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Price Estimator\"]")
	private MobileElement buttonPriceList;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close\"]")
	private MobileElement buttonCloseMenu;
	
	public MenuView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public AddressesListView OpenAddresses() throws Throwable{
		buttonAddresses.click();
		return new AddressesListView(driver);
	}
	
	public PaymentsListView OpenPM() throws Throwable{
		buttonPM.click();
		return new PaymentsListView(driver);
	}
	
	public void OpenPriceList(){
		buttonPriceList.click();
	}

	public void CloseMenu() {
		buttonCloseMenu.click();
	}


}
