package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginView extends AbstractView {

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'confirmButton')]")
	private MobileElement buttonConfirm;
	
	public LoginView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public void isLoginViewDispalyed() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertNotNull(buttonConfirm);
		Assert.assertTrue(buttonConfirm.getAttribute("enabled").equals("true"));
	}

}
