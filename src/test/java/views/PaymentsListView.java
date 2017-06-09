package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


public class PaymentsListView extends AbstractView {
	public PaymentsListView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	

	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@resource-id, 'addPaymentMethodButton')]")
	private  MobileElement buttonAddPM;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[contains(@index, '0')]")
	private MobileElement buttonMenu;
	


	public PaymentView AddNewPM() throws Throwable {
		buttonAddPM.click();
		return new PaymentView(driver);
	}



	public MenuView OpenMenu() throws Throwable {
		buttonMenu.click();
		return new MenuView(driver);
		
	}

	}
	
	


