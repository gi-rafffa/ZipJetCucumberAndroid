package test.java.views;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PriceEstimatorView extends AbstractView {
	
	@AndroidFindBy(xpath = "//android.widget.ImageView[contains(@resource-id, 'search_button')]")
	private MobileElement buttonSearch;
	
	@AndroidFindBy(xpath = "//android.widget.EditText[contains(@resource-id, 'search_src_text')]")
	private MobileElement textfieldSearch;
	
	
	public PriceEstimatorView(AndroidDriver driver) throws Throwable {
		super(driver);		
		PageFactory.initElements(new AppiumFieldDecorator(driver, 20, TimeUnit.SECONDS), this);
	}
	
	public PriceEstimatorView ClickSearch() throws Throwable{
		buttonSearch.click();
		return new PriceEstimatorView(driver);
	}
	
	public PriceEstimatorView InputShirt() throws Throwable{
		textfieldSearch.sendKeys("suit");
		return new PriceEstimatorView(driver);
	}
	
	public PriceEstimatorView InputFoo() throws Throwable{
		textfieldSearch.sendKeys("Foofoofooo");
		return new PriceEstimatorView(driver);
	}

	public void CheckPositiveResults() {
		List<MobileElement> SearchResult = 	driver.findElementsByXPath("//android.widget.TextView[contains(@text, 'Suit')]");
		Assert.assertEquals(SearchResult.size() != 0, true);
		
	}
	
	public void CheckNegativeResults() {
		List<MobileElement> SearchResult = 	driver.findElementsByXPath("//android.widget.TextView[contains(@text, 'Foofoofooo')]");
		Assert.assertEquals(SearchResult.size() == 0, true);
		List<MobileElement> NoSearchResultsMessage = driver.findElementsByXPath("//android.widget.TextView[contains(@resource-id, 'emptyDataSetTextView')]");
		Assert.assertEquals(NoSearchResultsMessage.size() == 1, true);

	}
	
}
