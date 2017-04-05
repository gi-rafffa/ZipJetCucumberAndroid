package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class AddressesListView extends AbstractView {
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav menu\"]")
	private MobileElement buttonMenu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav add\"]")
	private MobileElement buttonAddAddress;
	
	
	public AddressesListView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public MenuView OpenMenu() throws Throwable{
		buttonMenu.click();
		return new MenuView(driver);
	}
	
	public MapView ClickAddAddress() throws Throwable{
		buttonAddAddress.click();
		return new MapView(driver);
	}
	
}
