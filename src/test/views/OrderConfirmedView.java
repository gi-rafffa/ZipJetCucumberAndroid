package test.views;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderConfirmedView extends AbstractView {

	@iOSXCUITFindBy(xpath  = "//XCUIElementTypeStaticText[@name=\"Your order is confirmed!\"]")
	private MobileElement textConfirmation;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"OK\"]")
	private MobileElement buttonOK;
	
	public OrderConfirmedView(IOSDriver driver) throws Throwable {
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
