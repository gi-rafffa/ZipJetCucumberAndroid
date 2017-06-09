package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PayPalView extends AbstractView {

	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@index, '1')]")
	private MobileElement textfieldEmail;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@index, '2')]")
	private MobileElement textfieldPassword;
	
	@AndroidFindBy(xpath = "//android.widget.LinearLayout[contains(@index, '3')]")
	private MobileElement buttonLogin;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '0')]")
	private MobileElement buttonAgree;
	
	
	
	
	
	public PayPalView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public PayPalView InputTestEmail(){
		textfieldEmail.sendKeys("test@zipjet.com");
		return this;
	}
	
	public PayPalView InputTestPassword(){
		textfieldPassword.sendKeys("2017ZipjetQA?");
		return this;

	}

	public PayPalView LoginTestPayPal(){
		buttonLogin.click();
		return this;

	}

	public void Agree() {
	
		// TODO Auto-generated method stub
		buttonAgree.click();
		
	}
	

}
