package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MapView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LocationArrow\"]")
	private MobileElement buttonArrow;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Friedrichstraße 89, 10117 Berlin, Germany\"]")
	private MobileElement textfieldSearchAddressBerlin;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"CONFIRM ADDRESS\"]")
	private MobileElement buttonConfirmAddress;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'clearTextButton')]")
	private MobileElement controlDeleteAddress;
	
	//first row in the table with search results
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable/XCUIElementTypeCell[1]/XCUIElementTypeStaticText")
	private MobileElement firstAddress;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Save\"]")
	private MobileElement buttonSave;
	
	public MapView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public MapView SelectAddressFromList(){
		firstAddress.click();
		return this;
	}
	
	public MapView LocateMe(){
		buttonArrow.click();
		return this;
	}
	public MapView ClickAddressSearch(){
		textfieldSearchAddressBerlin.click();
		return this;
	}
	
	public MapView ConfirmAddress() throws Throwable{
		wait.until(ExpectedConditions.elementToBeClickable(buttonConfirmAddress));
		buttonConfirmAddress.click();
		return this;
	}
	public MapView DeleteAddress(){
		controlDeleteAddress.click();
		return this;
	}
	
	public MapView FocusOnAddressBar(){
		//textfieldSearchAddress.click();
		return this;
	}
	
	public void  SaveNewAddress(){
		buttonSave.click();
	}
	
	public MapView InputAddress(String address){
		textfieldSearchAddress.setValue(address);
		wait.until(ExpectedConditions.elementToBeClickable(firstAddress));
		return this;
	}

	public MobileElement getButtonConfirmAddress() {
		return buttonConfirmAddress;
	}
}
