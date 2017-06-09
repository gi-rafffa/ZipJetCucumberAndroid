package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class WelcomeView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[contains(@resource-id, 'loginButton')]")
	private MobileElement buttonLogin;
	

	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'startNowButton')]")
	private MobileElement buttonBegin;
	
	public WelcomeView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public void Login(){
		buttonLogin.click();
	}
	
	public void Begin(){
		buttonBegin.click();
	}
	
}
