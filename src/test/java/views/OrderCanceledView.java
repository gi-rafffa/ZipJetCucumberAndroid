package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OrderCanceledView extends AbstractView {
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'okImageView')]")
	private MobileElement buttonOK;
	
	public OrderCanceledView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public OrderStatusView ClickOk() throws Throwable{
		buttonOK.click();
	return new OrderStatusView(this.driver);
	}

}
