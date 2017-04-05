package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class VoucherView extends AbstractView {

	public VoucherView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTextField[@value=\"Enter voucher code\"]")
	private  MobileElement textfieldEnterVoucher;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav close dark\"]")
	private  MobileElement buttonClose;

	public VoucherAppliedView inputVoucher(String voucher) throws Throwable {
		textfieldEnterVoucher.sendKeys(voucher);
		driver.getKeyboard().sendKeys("\n");
		return new VoucherAppliedView(driver);
	}
	

}
