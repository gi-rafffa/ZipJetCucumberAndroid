package test.java.views;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MenuView extends AbstractView {

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Order')]")
	private MobileElement buttonOrder;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@text, 'Pricing')]")
	private MobileElement buttonPriceList;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '3')]")
	private MobileElement buttonPaymentMethods;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '4')]")
	private MobileElement buttonAddresses;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '5')]")
	private MobileElement buttonHelp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '6')]")
	private MobileElement buttonHowItWorks;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@index, '7')]")
	private MobileElement buttonLegal;
	
	
	public MenuView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public AddressesListView OpenAddresses() throws Throwable{
		buttonAddresses.click();
		return new AddressesListView(driver);
	}
	
	public OrderStatusView OpenOrderStatuss() throws Throwable{
		buttonOrder.click();
		return new OrderStatusView(driver);
	}
	
	public PaymentsListView OpenPM() throws Throwable{
		buttonPaymentMethods.click();
		return new PaymentsListView(driver);
	}
	
	public PriceEstimatorView OpenPriceList() throws Throwable{
		buttonPriceList.click();
		return new PriceEstimatorView(driver);
	}



}
