package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class MapView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"LocationArrow\"]")
	private MobileElement buttonArrow;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[@text=\"Friedrichstraße 89, 10117 Berlin, Germany\"]")
	private MobileElement textfieldSearchAddressBerlin;
	
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'clearTextButton')]")
	private MobileElement controlDeleteAddress;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'addressAutocompleteTextView')]")
	private MobileElement textfieldAddressBase;
	//
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'addressDetailsEditText')]")
	private MobileElement textfieldAddressDetails;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'confirmAddressButton')]")
	private MobileElement buttonConfirmAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'menu_save_address')]")
	private MobileElement buttonConfirmAdditionalAddress;
	

	
	public MapView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
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
		textfieldAddressBase.click();
		return this;
	}
	
	public void  SaveNewAddress(){
	//	buttonSave.click();
	}
	
	public MapView InputAddress(String address) throws InterruptedException{
		textfieldAddressBase.sendKeys(address);
		   Thread.sleep(2000);
		   textfieldAddressDetails.click();
		   Thread.sleep(2000);
		   textfieldAddressDetails.sendKeys("Additional info");
		   Thread.sleep(2000);
		   //driver.pressKeyCode(66);
		   //Thread.sleep(2000);
		   driver.pressKeyCode(160);
		   Thread.sleep(2000);
		   //driver.hideKeyboard();
		//wait.until(ExpectedConditions.elementToBeClickable(firstAddress));
		return this;
	}

	public MobileElement getButtonConfirmAddress() {
		return buttonConfirmAddress;
	}



	public void ConfirmAdditionalAddress() {
		
		buttonConfirmAdditionalAddress.click();
		
	}
}
