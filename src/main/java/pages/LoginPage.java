package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
public class LoginPage extends BasePage {
	
	
    @CacheLookup
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
    private WebElement country;
	
    @CacheLookup
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector().scrollIntoView(text(\"Turkey\")")
    private WebElement scrollCountry;
	
    @CacheLookup
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/text1\' and @text=\"Turkey\']")
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

	public void runLogin(String userName) {
		
		System.out.println("run");
		elementControl.sendKeys(username, userName);
		elementControl.click(country);
		elementControl.click(scrollCountry);
		elementControl.click(selectCountry);
		
		elementControl.click(gender);
		elementControl.click(entry);
		
}


	
	
}
