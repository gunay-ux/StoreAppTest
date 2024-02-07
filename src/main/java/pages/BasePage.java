package pages;


import org.openqa.selenium.support.PageFactory;
import implementation.ElementControl;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	
	AppiumDriver driver ;
	ElementControl elementControl;
	
	public  BasePage(AppiumDriver driver) {
		this.driver = driver;
		elementControl = new ElementControl(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this );
		
		
	}

}
