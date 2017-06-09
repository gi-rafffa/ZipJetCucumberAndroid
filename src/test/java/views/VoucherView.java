package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class VoucherView extends AbstractView {

	public VoucherView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	//
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'enterVoucherCodeErrorEditText')]")
	private  MobileElement textfieldEnterVoucher;
		
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'confirm')]")
	private  MobileElement buttonConfirm;

	public VoucherView inputVoucher(String voucher) throws Throwable {
		textfieldEnterVoucher.sendKeys(voucher);
		driver.pressKeyCode(4);
		return new VoucherView(driver);
	}
	
	public NewOrderView confirmVoucher(String voucher) throws Throwable {
		buttonConfirm.click();
		return new NewOrderView(driver);
	}
	

}
