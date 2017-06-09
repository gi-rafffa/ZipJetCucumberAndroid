package test.java.views;

import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;

public class NewOrderView extends AbstractView {
	
	//public NewOrderView(IOSDriver driver) throws Throwable {
		
	//}

	public NewOrderView(AndroidDriver driver) throws Throwable {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
//
	
	@AndroidFindBy(xpath = "//android.widget.View[contains(@resource-id, 'thumbOverlapView')]")
	private MobileElement buttonTick;
	
	@AndroidFindBy(xpath = "//android.widget.SeekBar[contains(@resource-id, 'seekBar')]")
	private MobileElement seekBar;
	
	@AndroidFindBy(xpath = "//android.widget.FrameLayout[contains(@resource-id, 'priceListMenuItem')]")
	private MobileElement buttonPricelist;
	
	@AndroidFindBy(xpath = "//android.widget.ImageButton[0]")
	private MobileElement buttonMenu;
	
	//is really needed?? 	//for returning customer

	@iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Home - Mollstraße 3\"]")
	private MobileElement buttonNewAddress;
	//for returning customer
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeOther[@name=\"Payment View\"]")
	private MobileElement buttonPaymentList;
	//for returning customer
	@iOSXCUITFindBy(xpath = "//XCUIElementTypeStaticText[contains(@name,'Home')]")
	private MobileElement buttonAddressList;
	
	//com.zipjet.android.qa:id/orderAreaTextView android.widget.TextView - field with city
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'notesEditText')]")
	private MobileElement textFieldComment;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'enterVoucherTextView')]")
	private  MobileElement buttonEnterVoucher;

	@AndroidFindBy(xpath = "//android.widget.Button[contains(@resource-id, 'continueButton')]")
	private  MobileElement buttonContinue;
	
	//@iOSXCUITFindBy(accessibility = "PickUpTime")
	//private  MobileElement listPickUp;
	
	//@iOSXCUITFindBy(accessibility = "DropOffTime")
	//private  MobileElement listDropOff;
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@path=\"/0/0/1/0/0/0/0/3/1/\"]/XCUIElementTypeCell[@visible=\"true\"][1]")
	//private  MobileElement tablePickUpDate;
	
	//@iOSXCUITFindBy(xpath = "//XCUIElementTypeTable[@path=\"/0/0/1/0/0/0/0/3/2\"]")
	//private  MobileElement tablePickUpTime;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'pickUpTimingTextView')]")
	private  MobileElement buttonPickUp;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'dropOffTimingTextView')]")
	private  MobileElement buttonDropOff;

	@AndroidFindBy(xpath = "//android.widget.TextView[contains(@resource-id, 'doneTextView')]")
	private  MobileElement buttonDone;
	
	public NewOrderView SelectRandomSC() throws Throwable{


		TouchAction action = new TouchAction(driver);
		Thread.sleep(2000);

		 // get start co-ordinate of seekbar
        int start=seekBar.getLocation().getX();
        //Get width of seekbar
        int end=seekBar.getSize().getWidth();
        //get location of seekbar vertically
        int y=seekBar.getLocation().getY();
        
       // int left =seekBar.getLocation().
        System.out.println("Start " + start);
        System.out.println("End " + end);

        action.press(start,y).moveTo(end,y).release().perform();
       // action.press(end,y).moveTo(start,y).release().perform();
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
	
	public void Continue(){
		wait.until(ExpectedConditions.elementToBeClickable(buttonContinue));
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
    	int index=0;
		List<MobileElement> PUDate = driver.findElementsByXPath("//android.widget.LinearLayout[contains(@resource-id, 'orderStatusTimeSlotView')]");
		int size = PUDate.size();
		System.out.println(size);
		Random r = new Random();
		do{
			index = r.nextInt(size);
		}
		while (index == 0);
		System.out.println("Totally table cells" + index + 1);
		System.out.println("I pick cell " + index);

		return PUDate.get(index);
    }

	public NewOrderView PickRandomPUDODateTime() throws Throwable {
		Thread.sleep(2000);
		this.selectRandomCell().click();
		Thread.sleep(3000);
		buttonDone.click();
		Thread.sleep(3000);
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