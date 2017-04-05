/*package test.gestures;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.*;
import io.appium.java_client.pagefactory.locator.*;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OrderFlowStepDefinition {
	
	@SuppressWarnings("rawtypes")
	 public IOSDriver driver;
	
	
	
  @Given(value = "^ZipJet, Simulator and Appium are running successfully$")
  public void given() throws Throwable {
	  DesiredCapabilities caps = new DesiredCapabilities();
		 caps.setCapability("automationName", "XCUITest");
		 caps.setCapability("platformName", "iOS");
		 caps.setCapability("platformVersion", "10.2"); 
		 caps.setCapability("deviceName", "iPhone 6"); 
		 caps.setCapability("app", "/Users/Anna/Documents/UsefullStaffForAppium/ZipJet_Dev.app");
		 caps.setCapability("fullReset", "true"); 
		 driver = new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

  }

  @When(value = "^I allow ZipJet send me notifications and locate$")
  public void when() throws Throwable {
	     driver.findElement(By.name("Allow")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.name("GET STARTED")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("Allow")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("CONFIRM ADDRESS")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("CONTINUE")).click();
		 Thread.sleep(5000);
  }

  @Then(value = "^Order is placed$")
  public void then() throws Throwable {
	  
	 driver.quit();
  }

  @And(value = "^I fill correct address and payment data, accept Terms and Conditions and place an order$")
  public void and() throws Throwable {
	     driver.findElement(By.name("First Name")).sendKeys("Qwweffrrrty");
		 Thread.sleep(4000);
		 driver.findElement(By.name("Last Name")).sendKeys("SffGGrG");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Email Address")).sendKeys("ghhfffrghg@jjj.ru");
		 Thread.sleep(2000);
		 driver.findElement(By.name("Phone Number")).sendKeys("888866588777");
		 Thread.sleep(2000);
		 driver.getKeyboard().sendKeys(Keys.RETURN);
		 Thread.sleep(3000);
		 driver.findElement(By.name("SAVE ADDRESS DETAILS")).click();
		 Thread.sleep(2000); 
		 driver.findElement(By.name("CVC, MM/YY, 1234567812345678")).sendKeys("411111111111111108/18737");
		 Thread.sleep(5000); 
		driver.findElement(By.name("CONFIRM PAYMENT METHOD")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.name("Accept Terms")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.name("Confirm Order")).click();
		 Thread.sleep(3000);
	 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileUtils.copyFile(scrFile, new File("/Users/Anna/Downloads/g2.jpg"));
  }


}*/
