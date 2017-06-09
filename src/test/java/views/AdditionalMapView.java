package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AdditionalMapView extends AbstractView {

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'addressLabelTextView')]")
	private MobileElement buttonAddressTypes;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'officeLocationTextView')]")
	private MobileElement buttonOfficeAddress;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'clearTextButton')]")
	private MobileElement controlDeleteAddress;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'addressAutocompleteTextView')]")
	private MobileElement textfieldAddressBase;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'editAddressDetailsEditText')]")
	private MobileElement textfieldAddressDetails;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'confirmAddressButton')]")
	private MobileElement buttonConfirmAddress;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'menu_save_address')]")
	private MobileElement buttonConfirmAdditionalAddress;
	

	
	public AdditionalMapView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	

	

	
	public AdditionalMapView ConfirmAddress() throws Throwable{
		wait.until(ExpectedConditions.elementToBeClickable(buttonConfirmAddress));
		buttonConfirmAddress.click();
		return this;
	}
	public AdditionalMapView DeleteAddress(){
		controlDeleteAddress.click();
		return this;
	}
	
	public AdditionalMapView FocusOnAddressBar(){
		textfieldAddressBase.click();
		return this;
	}
	

	
	public AdditionalMapView InputAddress(String address) throws InterruptedException{
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
		return this;
	}

	public MobileElement getButtonConfirmAddress() {
		return buttonConfirmAddress;
	}



	public void ConfirmAdditionalAddress() {
		buttonConfirmAdditionalAddress.click();
		
	}

	



	public AdditionalMapView ClickAddressSelector() throws Throwable {
		buttonAddressTypes.click();
		return new AdditionalMapView(driver);
	}
	
	public AdditionalMapView PickOfficeAddress() throws Throwable {
		buttonAddressTypes.click();
		return new AdditionalMapView(driver);
	}
}
