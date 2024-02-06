package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import implementation.ElementControl;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	WebDriver driver ;
	ElementControl elementControl;
	
	public void BasePAge(WebDriver driver) {
		this.driver = driver;
		elementControl = new ElementControl();
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
		
		
	}

}
