package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class RAFPopUpView extends AbstractView {

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'closeButton')]")
	private MobileElement buttonClosePopUp;
	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'customButton')]")
	private MobileElement buttonStartNow;
	
	
	public RAFPopUpView(AndroidDriver driver) throws Throwable {
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
