package test.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import test.framework.Constants;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class RAFPopUpView extends AbstractView {

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"X\"]")
	private MobileElement buttonClosePopUp;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@name=\"Start Now\"]")
	private MobileElement buttonStartNow;
	
	
	public RAFPopUpView(IOSDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public void CloseRAFPopUp(){
		buttonClosePopUp.click();
	}
	
	public void StartRAFProcess(){
		buttonStartNow.click();
	}


}