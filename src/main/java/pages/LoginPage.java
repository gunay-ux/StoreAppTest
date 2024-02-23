package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
public class LoginPage extends BasePage {
	
	
    @CacheLookup
	@AndroidFindBy(id="android:id/text1")
    private WebElement country;
	
    @CacheLookup
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"Albania\"));")
    private WebElement selectCountry;
   
    @CacheLookup
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement username;
	
    @CacheLookup
    @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
    private WebElement gender;
    
    @CacheLookup 
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement entry;
    
    @AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
    private WebElement title;
    
    public LoginPage(AppiumDriver driver) {
		super(driver);
		
	    
	   
	}
    
	public void runLogin(String userName) throws Exception {
	
		elementControl.click(country);
		elementControl.click(selectCountry);
		elementControl.sendKeys(username, userName);
		elementControl.click(gender);
		elementControl.productPage(entry);
		
		
		
}


	
	
}
