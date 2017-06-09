package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class AddressDetailsView extends AbstractView {
	public AddressDetailsView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	//string with address - couldn't be edited
	@iOSXCUITFindBy(accessibility = "Address TextField")
	private MobileElement textfieldAddress;
	
	@iOSXCUITFindBy(id = "ShieldCheckmark")
	private  MobileElement iconShied;
	
	@iOSXCUITFindBy(id = "WE NEVER SHARE YOUR PRIVATE INFORMATION WITH THIRD PARTIES")
	private  MobileElement textfieldSafety;
	
	@iOSXCUITFindBy(accessibility = "Address Details")
	private  MobileElement textfieldTitle;
	
	@iOSXCUITFindBy(accessibility = "nav back")
	private  MobileElement buttonBack;
	
	@iOSXCUITFindBy(id = "CountryCode")
	private  MobileElement textfieldCountryCode;
	
	@iOSXCUITFindBy(id = "PhoneNumber")
	private  MobileElement textfieldPhone;
	
	
	@iOSXCUITFindBy(accessibility = "PriceTagEuroIcon")
	private  MobileElement buttonPriceList;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'saveAddressButton')]")
	private  MobileElement buttonSaveAddressDetails;
	
	public void PriceList(){
		buttonPriceList.click();
	}
	
	public void Back(){
		buttonBack.click();
	}
	
	public void SaveAddressDetails() throws InterruptedException{
		Thread.sleep(2000);
		//System.out.println((driver).getPageSource());
		buttonSaveAddressDetails.click();
		Thread.sleep(2000);
		//driver.getKeyboard().sendKeys("\n");
	}
	
	/*public AddressDetailsView InputFlatBuilding(String flatbuilding){
		textfieldFlatBuilding.sendKeys(flatbuilding);
		return this;
	}*/


	/*
	public AddressDetailsView DeleteFlatBuilding(){
		textfieldFlatBuilding.click();
		textfieldFlatBuilding.clear();
		return this;
	}
	*/
	
	}
	
	


