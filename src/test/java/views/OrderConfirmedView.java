package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderConfirmedView extends AbstractView {

	@iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"Your order is confirmed!\"]")
	private MobileElement textConfirmation;
	//orderConfirmationImageView
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'orderConfirmationImageView')]")
	private MobileElement buttonOK;
	
	public OrderConfirmedView(AndroidDriver driver) throws Throwable {
		super(driver);	
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public void ClickOk(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonOK));
		buttonOK.click();
	}
	
	public OrderConfirmedView IsOrderConfirmed(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonOK));
		return this;
	}

	

}
