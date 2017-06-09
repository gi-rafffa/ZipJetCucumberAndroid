package test.java.framework;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import test.java.views.AdditionalMapView;
import test.java.views.AddressDetailsView;
import test.java.views.AddressesListView;
import test.java.views.ContactDetailsView;
import test.java.views.EditOrderView;
import test.java.views.LocationView;
import test.java.views.LoginView;
import test.java.views.MapView;
import test.java.views.MenuView;
import test.java.views.NewOrderView;
import test.java.views.NonServedAreaView;
import test.java.views.OrderCanceledView;
import test.java.views.OrderConfirmedView;
import test.java.views.OrderHistoryView;
import test.java.views.OrderStatusView;
import test.java.views.OrderSummaryView;
import test.java.views.PayPalAgreementView;
import test.java.views.PayPalView;
import test.java.views.PaymentView;
import test.java.views.PaymentsListView;
import test.java.views.PriceEstimatorView;
import test.java.views.RAFPopUpView;
import test.java.views.VoucherAppliedView;
import test.java.views.VoucherView;
import test.java.views.WelcomeView;

public class Application {
	public static AndroidDriver driver;
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
	public PriceEstimatorView priceEstimatorView;
	public LoginView loginView;
	public PayPalAgreementView payPalAgreementView;
	public AdditionalMapView additionalMapView;

	
	private static Application myInstance;
	
	private Application(){
		   
	}
	
	public static Application getInstance() throws Throwable
	{
		DesiredCapabilities caps = new DesiredCapabilities();
		if (myInstance == null){
			
			myInstance = new Application();
		    String cmdLineStart = "/Users/Anna/Library/Android/sdk/emulator/emulator -avd Nexus_5X_API_25";     
		    Runtime.getRuntime().exec(cmdLineStart);
			
		     Thread.sleep(15000);
		     
		     caps.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
			 caps.setCapability("platformName", "Android");
			 caps.setCapability("platformVersion", "7.1.1"); 
			 caps.setCapability("deviceName", "Nexus_5X_API_25"); 
			
			 caps.setCapability("deviceName", "Android"); 
			 caps.setCapability("fullReset", "false"); 
			 caps.setCapability("noSign", "true"); 
			 caps.setCapability("avdLaunchTimeout", "40000");
			 caps.setCapability("appWaitActivity", "com.intwash.android.ui.activities.SplashActivity");
			 //caps.setCapability("deviceName", "0123456789ABCDEF");
			 caps.setCapability("appPackage", "com.zipjet.android.qa");
			// caps.setCapability("appPackage", "com.zipjet.android");
			 caps.setCapability("appActivity", "com.intwash.android.ui.activities.SplashActivity");
			 caps.setCapability("app", "/Users/Anna/Documents/UsefullStaffForAppium/app-qa-debug.apk");
			 //caps.setCapability("app", "/Users/Anna/Documents/UsefullStaffForAppium/app-live-release.apk");
			 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			 //Thread.sleep(20000);
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
