package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class LoginPage extends BasePage {
	
	
    @CacheLookup
	@AndroidFindBy(id="android:id/text1")
    private WebElement country;
	
    @CacheLookup
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector()).scrollIntoView(text(\"China\"));")
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
    
    
    public LoginPage(AppiumDriver driver) {
		super(driver);
		
	    PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	   
	}
    
	public void runLogin(String userName) throws Exception {
		
		elementControl.click(country);
		elementControl.click(selectCountry);
		elementControl.sendKeys(username, userName);
		elementControl.click(gender);
		elementControl.click(entry);
		
}


	
	
}
