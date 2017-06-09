package test.java.views;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public abstract class AbstractView {
	   @SuppressWarnings("rawtypes")
	   protected static AndroidDriver driver;
	   WebDriverWait wait;	 

	    public AbstractView(AndroidDriver driver2) throws Throwable {
	    this.driver = driver2;
	    wait = new WebDriverWait(driver2, 20);
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


