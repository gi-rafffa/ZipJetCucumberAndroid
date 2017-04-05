package test.views;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import test.framework.Application;

public class NewOrderView extends AbstractView {
	
	//public NewOrderView(IOSDriver driver) throws Throwable {
		
	//}

	public NewOrderView(IOSDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"PriceTagEuroIcon\"]")
	private MobileElement buttonPricelist;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"nav menu\"]")
	private MobileElement buttonMenu;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Home - Mollstraße 3\"]")
	private MobileElement buttonNewAddress;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payment View\"]")
	private MobileElement buttonPaymentList;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Home')]")
	private MobileElement buttonAddressList;

	@iOSXCUITFindBy(accessibility = "nav back")
	private MobileElement buttonBack;
	
	@iOSXCUITFindBy(accessibility = "Comment View")
	private MobileElement textFieldComment;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value = \"Enter voucher code\"]")
	private  MobileElement buttonEnterVoucher;
	
	@iOSXCUITFindBy(id = "CONTINUE")
	private  MobileElement buttonContinue;
	
	@iOSXCUITFindBy(accessibility = "PickUpTime")
	private  MobileElement listPickUp;
	
	@iOSXCUITFindBy(accessibility = "DropOffTime")
	private  MobileElement listDropOff;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@path=\"/0/0/1/0/0/0/0/3/1/\"]/XCUIElementTypeCell[@visible=\"true\"][1]")
	private  MobileElement tablePickUpDate;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@path=\"/0/0/1/0/0/0/0/3/2\"]")
	private  MobileElement tablePickUpTime;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Pick Up\"]")
	private  MobileElement buttonPickUp;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[@value=\"Drop Off\"]")
	private  MobileElement buttonDropOff;
	
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Done\"]")
	private  MobileElement buttonDone;
	
	public PricelistView clickPricelist() throws Throwable
	{
		buttonPricelist.click();
		return new PricelistView(driver);
	}
	
	
	public NewOrderView SelectMiddleSC() throws Throwable{
		TouchAction action = new TouchAction(driver);
		Thread.sleep(2000);
		action.longPress(190, 136,1).perform();
		Thread.sleep(2000);
		return this;
	}
	
	//ask George for exact coordinates
	public NewOrderView SelectLastSC() throws Throwable{
		TouchAction action = new TouchAction(driver);
		Thread.sleep(2000);
		action.longPress(360, 136,1).perform();
		Thread.sleep(2000);
		return this;
	}
	
	
	
	public  NewOrderView OpenAddressList() throws Throwable{
		buttonAddressList.click();
		return new NewOrderView(driver);
	}
	
	public  NewOrderView PickAnotherAddress() throws Throwable{
		Thread.sleep(2000);
		buttonNewAddress.click();
		Thread.sleep(2000);
		return new NewOrderView(driver);
	}
	
	public void Back(){
		buttonBack.click();
	}
	

	
	public void Continue(){
		getButtonContinue().click();
	}

	public NewOrderView InputComment(String comment){
		textFieldComment.sendKeys(comment);
		return this;
	}


	public MobileElement getButtonContinue() {
		return buttonContinue;
	}


	public void setButtonContinue(MobileElement buttonContinue) {
		this.buttonContinue = buttonContinue;
	}


	public NewOrderView OpenPUSelector() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(buttonPickUp));
		buttonPickUp.click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonDone));
		return this;
	}
	
	public void OpenDOSelector() throws Throwable {
		wait.until(ExpectedConditions.elementToBeClickable(buttonDropOff));
		buttonDropOff.click();
		wait.until(ExpectedConditions.elementToBeClickable(buttonDone));	
	}
	
    public MobileElement selectRandomCell()
    {
    	int index;
		List<MobileElement> PUDate = driver.findElementsByXPath("//XCUIElementTypeCell[@enabled=\"true\"]");
		int size = PUDate.size();
		System.out.println(size);
		Random r = new Random();
		do{
			index = r.nextInt(size);
		}
		while (index == 0);
		System.out.println("Totally table cells" + index + 1);
		return PUDate.get(index);
    }

	public NewOrderView PickRandomPUDODateTime() throws Throwable {
		this.selectRandomCell().click();
		buttonDone.click();
		return new NewOrderView(this.driver);
	}

	public MenuView openMenu() throws Throwable {
		buttonMenu.click();
		return new MenuView(driver);
	}

	public VoucherView voucherClick() throws Throwable {
		buttonEnterVoucher.click();
		return new VoucherView(driver);
	}
	}