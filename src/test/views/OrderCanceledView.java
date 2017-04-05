package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class OrderCanceledView extends AbstractView {

	@iOSXCUITFindBy(accessibility = "Your order is canceled!")
	private MobileElement textConfirmation;
	
	@iOSXCUITFindBy(xpath = "//*[@name=\"OK\"]")
	private MobileElement buttonOK;
	
	public OrderCanceledView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public OrderStatusView ClickOk() throws Throwable{
		buttonOK.click();
	return new OrderStatusView(this.driver);
	}

}
