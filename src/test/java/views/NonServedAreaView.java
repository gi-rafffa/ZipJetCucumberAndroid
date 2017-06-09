package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class NonServedAreaView extends AbstractView {
	public NonServedAreaView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'keepMePostedEmailAddressEditText')]")
	private MobileElement textFieldEmail;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'keepMePostedButton')]")
	private  MobileElement buttonKeepMePosted;
	
	
	public NonServedAreaView KeepMePosted() throws Throwable{
		
		buttonKeepMePosted.click();
		return this;
	}

	


	public NonServedAreaView InputEmail(String email) throws InterruptedException{
		textFieldEmail.sendKeys(email);
        return this; 
	}

	public MobileElement getButtonKeepMePosted() {
		return buttonKeepMePosted;
	}
	}
	