package test.views;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Function;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public abstract class AbstractView {
	   @SuppressWarnings("rawtypes")
	   protected static AndroidDriver driver;
	   WebDriverWait wait;	 

	    public AbstractView(AndroidDriver driver) throws Throwable {
	    this.driver = driver;
	    wait = new WebDriverWait(driver, 10);
	    }

	    
	    public static boolean IsElementPresent(MobileElement element)
        {
            try
            {
                return element.isDisplayed();
            }
            catch (NoSuchElementException e)
            {
            	e.printStackTrace();
                return false;
            }
        }
	    
	    public MobileElement findElementWithTimeout(By by, int timeOutInSeconds) {
	        return (MobileElement)(new WebDriverWait(driver, timeOutInSeconds)).until(ExpectedConditions.presenceOfElementLocated(by));
	    }

	    protected void takeScreenShot(){
	        driver.getScreenshotAs(OutputType.BASE64);
	    }
	    
	  
	    public void isLoadedAndClickableAndClick(final By xpath) throws Error {
	    	FluentWait<AndroidDriver> wait = new FluentWait<AndroidDriver>(driver)
					.withTimeout(45, TimeUnit.SECONDS)//Sets how long to wait for the evaluated condition to be true.
					.pollingEvery(2, TimeUnit.SECONDS)//Sets how often the condition should be evaluated.
					//Configures this instance to ignore specific types of exceptions while waiting for a condition.
					.ignoring(NoSuchElementException.class).ignoring(NoSuchFieldException.class)
					.withMessage("Time expired");
	    	MobileElement foo = (MobileElement) wait.until(new Function<AndroidDriver, MobileElement>() 
	    	{
	    		public MobileElement apply(AndroidDriver driver) 
	    		{
	    			return (MobileElement) driver.findElement(xpath);
	    		}
	    	});
	    	foo.click();
	    	
	    }

public void isLoaded(final By xpath) throws Error {
	FluentWait<AndroidDriver> wait = new FluentWait<AndroidDriver>(driver)
			.withTimeout(45, TimeUnit.SECONDS)//Sets how long to wait for the evaluated condition to be true.
			.pollingEvery(2, TimeUnit.SECONDS)//Sets how often the condition should be evaluated.
			//Configures this instance to ignore specific types of exceptions while waiting for a condition.
			.ignoring(NoSuchElementException.class).ignoring(NoSuchFieldException.class)
			.withMessage("Time expired");
	MobileElement foo = (MobileElement) wait.until(new Function<AndroidDriver, MobileElement>() 
	{
		public MobileElement apply(AndroidDriver driver) 
		{
			return (MobileElement) driver.findElement(xpath);
		}
	});
	
	

	
}}


