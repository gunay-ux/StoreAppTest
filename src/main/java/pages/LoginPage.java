package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends BasePage {
	
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
    private WebElement country;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
    private WebElement username;
	 
    @AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
    private WebElement gender;
	 
	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
    private WebElement entry;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		
	}

	
	
}
