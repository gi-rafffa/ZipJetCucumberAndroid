package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PayPalAgreementView extends AbstractView {


	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '0')]")
	private MobileElement buttonAgree;
	
	
	public PayPalAgreementView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	


	public void Agree() {

		buttonAgree.click();
		
	}
	

}
