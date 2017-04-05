package test.framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.remote.AutomationName;
import test.views.AddressDetailsView;
import test.views.AddressesListView;
import test.views.ContactDetailsView;
import test.views.EditOrderView;
import test.views.LocationView;
import test.views.MapView;
import test.views.MenuView;
import test.views.NewOrderView;
import test.views.NonServedAreaView;
import test.views.OrderCanceledView;
import test.views.OrderConfirmedView;
import test.views.OrderHistoryView;
import test.views.OrderStatusView;
import test.views.OrderSummaryView;
import test.views.PayPalView;
import test.views.PaymentView;
import test.views.PaymentsListView;
import test.views.PricelistView;
import test.views.StartView;
import test.views.VoucherAppliedView;
import test.views.VoucherView;
import test.views.WelcomeView;
import test.views.RAFPopUpView;

public class Application {
	public static AndroidDriver driver;
	//public StartView startView;
	public WelcomeView welcomeView;
	public LocationView locationView;
	public MapView mapView;
	public NewOrderView newOrderView;
	public OrderSummaryView orderSummaryView;
	public AddressDetailsView addressDetailsView;
	public OrderConfirmedView orderConfirmedView;
	public PaymentView paymentView;
	public ContactDetailsView contactDetailsView;
	public PayPalView payPalView;
	public OrderStatusView orderStatusView;
	public RAFPopUpView RAFPopUpView;
	public EditOrderView editOrderView;
	public OrderCanceledView orderCanceledView;
	public NonServedAreaView nonServedAreaView;
	public OrderHistoryView orderHistoryView;
	public MenuView menuView;
	public AddressesListView addressesListView;
	public PaymentsListView paymentsListView;
	public VoucherView voucherView;
	public VoucherAppliedView voucherAppliedView;
	public PricelistView pricelistView;

	
	private static Application myInstance;
	
	private Application(){
		   
	}
	
	public static Application getInstance() throws Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		if (myInstance == null){
			
			myInstance = new Application();
		  //  String cmdLineStart = "/Users/Anna/Library/Android/sdk/emulator/emulator -avd Nexus_5X_API_25";     
		    //Runtime.getRuntime().exec(cmdLineStart);
			
		    // Thread.sleep(25000);
		     
		     caps.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
			 caps.setCapability("platformName", "Android");
			 //caps.setCapability("platformVersion", "7.1.1"); 
			 //caps.setCapability("deviceName", "Nexus_5X_API_25"); 
			
			 //caps.setCapability("deviceName", "Android"); 
			 caps.setCapability("fullReset", "false"); 
			 caps.setCapability("noSign", "true"); 
			 caps.setCapability("deviceName", "0123456789ABCDEF");
			 caps.setCapability("appPackage", "com.zipjet.android.qa");
			 caps.setCapability("appActivity", "com.intwash.android.ui.activities.SplashActivity");
			 caps.setCapability("app", "/Users/Anna/Documents/UsefullStaffForAppium/app-qa-debug.apk");
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 Thread.sleep(30000);
	        return myInstance;
			
		}
		else
			return myInstance;
	}
	
	public void Refresh () {
		   System.out.println((this.driver).getPageSource());
	}

	public void setInstanceNull() {
		myInstance=null;
		
	}
	
	

}
