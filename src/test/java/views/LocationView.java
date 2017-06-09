package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class LocationView extends AbstractView {
	public LocationView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}

	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"DENY\"]")
	private MobileElement buttonDeny;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ALLOW\"]")
	private MobileElement buttonAllow;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Berlin\"]")
	private MobileElement buttonBerlin;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"London\"]")
	private MobileElement buttonLondon;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Paris\"]")
	private MobileElement buttonParis;

	
	
	
	public MapView PickBerlin() throws Throwable{
		System.out.println(driver.getPageSource());
		buttonBerlin.click();
		return new MapView(driver);
	}
	
	public MapView PickLondon() throws Throwable{
		System.out.println(driver.getPageSource());
		buttonLondon.click();
		return new MapView(driver);
	}
	
	public MapView PickParis() throws Throwable{
		System.out.println(driver.getPageSource());
		buttonParis.click();
		return new MapView(driver);
	}
	
	
	
	public void AllowLocation(){
		buttonAllow.click();
	}
	
	public void DenyLocation(){
		buttonDeny.click();
	}

	
	}
	
	


