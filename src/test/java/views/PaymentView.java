package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;


public class PaymentView extends AbstractView {
	public PaymentView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'creditCardNumberEditText')]")
	private MobileElement textfieldCreditCardNumber;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'creditCardExpiryEditText')]")
	private MobileElement textfieldCreditCardDate;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'creditCardCVCEditText')]")
	private MobileElement textfieldCreditCardCVC;
	
	//for returning customer
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Add Payment\"]")
	private  MobileElement titleAddPayment;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'creditCardHolderEditText')]")
	private  MobileElement textfieldCardHolder;
	
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, 'priceListMenuItem')]")
	private MobileElement buttonPriceList;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[0]")
	private  MobileElement buttonBack;

	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'savePaymentDetailsButton')]")
	private  MobileElement buttonSavePaymentDetailsCreditCard;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'payPalButton')]")
	private  MobileElement buttonAddPayPal;
	
	public void PriceList(){
		buttonPriceList.click();
	}
	
	public void Back(){
		buttonBack.click();
	}
	
	public void AddPayPal(){
		buttonAddPayPal.click();
	}
	

	
	public void SavePaymentDetailsCreditCard(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonSavePaymentDetailsCreditCard));
		buttonSavePaymentDetailsCreditCard.click();
	}
	
	
	
	public void OpenPriceList(){
		buttonPriceList.click();
	}
	
	public PaymentView InputCreditCardNumber(String creditcardnumber){
		textfieldCreditCardNumber.sendKeys(creditcardnumber);
		return this;
	}
	
	public PaymentView InputCreditCardDate(String creditcarddate){
		textfieldCreditCardDate.sendKeys(creditcarddate);
		return this;
	}
	
	public PaymentView InputCreditCardCVC(String creditcardcvc){
		textfieldCreditCardCVC.sendKeys(creditcardcvc);
		return this;
	}
	
	public PaymentView InputCreditCardData(String creditcardnumber, String creditcarddate, String creditcardcvc){
		InputCreditCardNumber(creditcardnumber);
		InputCreditCardDate(creditcarddate);
		InputCreditCardCVC(creditcardcvc);
		driver.pressKeyCode(4);
		return this;
	}
	
	public PaymentView FocusOnCardHolderField(){
		textfieldCardHolder.click();
		return this;
	}


	
	public PaymentView DeleteCreditCardNumber(){
		textfieldCreditCardNumber.click();
		textfieldCreditCardNumber.clear();
		return this;
	}



	}
	
	


