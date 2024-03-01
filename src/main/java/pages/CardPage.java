package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CardPage extends BasePage {
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
    private WebElement cardTitle;
	
	
	
	

	public CardPage(AppiumDriver driver) {
		super(driver);
		
	}
	
	public String getCardName() {
		
		String cardname = elementControl.getAttribute(cardTitle,"text");
		System.out.println("getCardName" + cardname);
		return cardname;
		
	}
	
	
	
	
	

}
