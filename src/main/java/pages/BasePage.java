package pages;

import implementation.ElementControl;
import io.appium.java_client.AppiumDriver;




public class BasePage {
	
	AppiumDriver driver;
	public ElementControl elementControl;
	
	public  BasePage(AppiumDriver driver) {
		this.driver = driver;
		elementControl = new ElementControl(driver);
		
			
		
	}

}
