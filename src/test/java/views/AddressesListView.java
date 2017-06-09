package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddressesListView extends AbstractView {
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@index, '0')]")
	private MobileElement buttonMenu;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'addButton')]")
	private MobileElement buttonAddAddress;
	
	
	public AddressesListView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public MenuView OpenMenu() throws Throwable{
		buttonMenu.click();
		return new MenuView(driver);
	}
	
	public AdditionalMapView ClickAddAddress() throws Throwable{
		buttonAddAddress.click();
		return new AdditionalMapView(driver);
	}
	
}
