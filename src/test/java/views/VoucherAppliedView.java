package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class VoucherAppliedView extends AbstractView {

	public VoucherAppliedView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	private  MobileElement buttonOk;

	public NewOrderView clickOk() throws Throwable {
		buttonOk.click();
		return new NewOrderView(driver);
	}
	

}
