package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;



public class OrderSummaryView extends AbstractView {
	public OrderSummaryView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);

	}
	
	//string with address - couldn't be edited
	
	@AndroidFindBy(xpath = "//android.widget.CheckBox[contains(@resource-id, 'termsAndConditionsCheckBox')]")
	private MobileElement checkboxAcceptTerms;
	

	
	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'confirmOrderButton')]")
	private  MobileElement buttonConfirmOrder;
	


	//think with Alessandro how to get rid of sleep
	public void ConfirmOrder() throws Throwable{
		buttonConfirmOrder.click();
		Thread.sleep(8000);
	}
	
	
	public OrderSummaryView AcceptTermasAndConditions(){
		checkboxAcceptTerms.click();
		return this;
	}
	
	@Test


	public boolean isCheckBoxAcceptVisible() {
		return IsElementPresent(checkboxAcceptTerms);
	}
	

	public void isSummaryViewDispalyed() throws InterruptedException {
		//buttonConfirmOrder.getAttribute("clickable").equals("false");
		Thread.sleep(2000);
		Assert.assertNotNull(buttonConfirmOrder);
		Assert.assertTrue(buttonConfirmOrder.getAttribute("enabled").equals("false"));
		//TODEFINE
	}
	

	
	}
	
	


