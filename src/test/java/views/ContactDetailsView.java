package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class ContactDetailsView extends AbstractView {
	public ContactDetailsView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'firstNameEditText')]")
	private MobileElement textfieldFirstName;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'lastNameEditText')]")
	private MobileElement textfieldLastName;
	
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'recoverAccountButton')]")
	private MobileElement buttonLogin;//userrecoverAccountButton

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'saveContactDetailsButton')]")
	private  MobileElement buttonSaveContactDetails;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'emailEditText')]")
	private  MobileElement textfieldEmailAddress;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'phoneNumberEditText')]")
	private  MobileElement textfieldPhone;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, 'priceListMenuItem')]")
	private MobileElement buttonPriceList;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[0]")
	private  MobileElement buttonBack;
	
	//to rework
	@iOSXCUITFindBy(id = "CountryCode")
	private  MobileElement textfieldCountryCode;

	@AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@resource-id, 'keepMePostedCheckBox')]")
	private  MobileElement checkboxKeepMePosted;
	
	public void PriceList(){
		buttonPriceList.click();
	}
	
	public void Back(){
		buttonBack.click();
	}
	
	public ContactDetailsView checkKeepMePosted(){
		checkboxKeepMePosted.click();
		return this;
	}
	
	public void SaveContactDetails(){
		buttonSaveContactDetails.click();
	
	}
	
	public ContactDetailsView InputCountryCode(String countrycode){
		textfieldCountryCode.sendKeys(countrycode);
		return this;
	}

	public ContactDetailsView InputEmailAddress(String emailaddress){
		textfieldEmailAddress.sendKeys(emailaddress);
		return this;
	}
	
	public ContactDetailsView InputPhoneNumber(String phonenumber){
		textfieldPhone.sendKeys(phonenumber);
		return this;
	}
	
	public ContactDetailsView InputFirstName(String firstname){
		textfieldFirstName.sendKeys(firstname);
		return this;
	}
	
	public ContactDetailsView InputLastName(String lastname){
		textfieldLastName.sendKeys(lastname);
		return this;
	}
	
	public ContactDetailsView DeleteLastName(String lastname){
		textfieldLastName.click();
		textfieldLastName.clear();
		return this;
	}
	
	public ContactDetailsView DeleteFirstName(String lastname){
		textfieldFirstName.click();
		textfieldFirstName.clear();
		return this;
	}

	public MobileElement getButtonLogin() {
		return buttonLogin;
	}

	public LoginView LoginClick() throws Throwable {
		buttonLogin.click();
		return new LoginView(this.driver);
	}
	
	}
	
	


