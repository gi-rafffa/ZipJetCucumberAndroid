package appium.ios;
import io.appium.java_client.MobileElement;
//import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.StartsActivity;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import io.appium.java_client.remote.AutomationName;
import org.openqa.selenium.support.PageFactory;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.exec.CommandLine;
import org.apache.commons.exec.DefaultExecuteResultHandler;
import org.apache.commons.exec.DefaultExecutor;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



import java.io.File;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.MobileElement;
import java.net.URL;
import com.android.uiautomator.actions.*;
import com.android.uiautomator.*;
import com.android.uiautomator.tree.*;
import com.android.uiautomator.UiAutomatorHelper;

import com.android.uiautomator.*;

public class OrderFlowTest {
	

	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"BEGIN\"]")
	private MobileElement buttonBegin;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text=\"ALLOW\"]")
	private MobileElement buttonAllow;
	
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text=\"Berlin\"]")
	private MobileElement buttonBerlin;
	
	@SuppressWarnings("rawtypes")
	 public AndroidDriver driver;
	 
	 @SuppressWarnings("rawtypes")
	 @BeforeMethod
	 public void setUp() throws IOException, Throwable  {
	 DesiredCapabilities caps = new DesiredCapabilities();
     
    // for genymotion String cmdLine = "open -a /Applications/Genymotion.app/Contents/MacOS/player.app --args --vm-name b8de4f86-995a-4248-9474-acd3f40ab2ad";
     String cmdLineStart = "/Users/Anna/Library/Android/sdk/emulator/emulator -avd Nexus_5X_API_25";     
       Runtime.getRuntime().exec(cmdLineStart);


     Thread.sleep(25000);
     
     caps.setCapability("automationName", AutomationName.ANDROID_UIAUTOMATOR2);
	 caps.setCapability("platformName", "Android");
	 caps.setCapability("platformVersion", "7.1.1"); 
	 caps.setCapability("deviceName", "Nexus_5X_API_25"); 
	 caps.setCapability("fullReset", "true"); 
	 caps.setCapability("appPackage", "com.zipjet.android.qa");
	 caps.setCapability("appActivity", "com.intwash.android.ui.activities.SplashActivity");
	 caps.setCapability("app", "/Users/Anna/Documents/UsefullStaffForAppium/app-qa-debug-fr.apk");
	 driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


	 }
	 
	 @Test
	 public  void testAndroid() throws InterruptedException, IOException {
		// UiObject element = new UiSelector().resourceId("com.google.android.googlequicksearchbox:id/folder_icon_name").makeUiObject();		
		 Thread.sleep(10000);
		 System.out.println(driver.getPageSource());
		// PageObject pageObject = new PageObject();
	   PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
		//System.out.println(driver.getPageSource());
		driver.findElementByXPath("//android.widget.Button[@text=\"BEGIN\"]").click();

		Thread.sleep(5000);
		 System.out.println(driver.getPageSource());
		 driver.findElementByXPath("//android.widget.Button[@text=\"ALLOW\"]").click();
		 Thread.sleep(5000);
		 System.out.println(driver.getPageSource());
		 driver.findElementByXPath("//android.widget.TextView[@text=\"Berlin\"]").click();
		 Thread.sleep(50000);
		 
		 //System.out.println(driver.getPageSource());
		 //Thread.sleep(300000);
		 
		 

		
	 }
	 
	 @AfterMethod
	 public void tearDown() throws IOException {
	  driver.quit();
	    String cmdLineStop = "/Users/Anna/Library/Android/sdk/platform-tools/adb -s emulator-5554 emu kill";     
	       Runtime.getRuntime().exec(cmdLineStop);
	  
	 }
	 
	

}
