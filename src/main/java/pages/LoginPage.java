package pages;

import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
    private WebElement country;
	
	@AndroidFindBy(uiAutomator="new UiScrollable(new UiSelector().scrollIntoView(text(\"Turkiye\")")
    private WebElement scrollCountry;
	
	@AndroidFindBy(xpath="//android.widget.TextView[@resource-id=\"android:id/text1\' and @text=\"Turkey\']")
    private WebElement selectCountry;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement username;
	 
    @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
    private WebElement gender;
	 
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement entry;
	
	
	
	public LoginPage(AppiumDriver driver) {
		super(driver);
		
	}
	
	public void runLogin() {
		
		elementControl.click(country);
		elementControl.click(scrollCountry);
		elementControl.click(selectCountry);
		elementControl.sendKeys(username, "Gunay");
		elementControl.click(gender);
		elementControl.click(entry);
		
		
		
		
		
}
	    
	

	
	
}
