package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class StartView extends AbstractView {
	
	public StartView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}


/*

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"BEGIN\"]")
	private MobileElement buttonBegin;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ALLOW\"]")
	private MobileElement buttonAllow;*/
	
	
	
	
	
/*	public void AllowNotification(){
		buttonAllow.click();
	}
	
	public void Begin(){
		buttonBegin.click();
	}*/

	
	}
	
	


