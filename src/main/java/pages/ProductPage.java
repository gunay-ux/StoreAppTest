package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends BasePage {
	
    
	@AndroidFindBy(id="(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")
    private WebElement addCard;
	
	@AndroidFindBy(id="(com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement shoppingCard;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_back")
    private WebElement backButton;
	

	public ProductPage(WebDriver driver) {
		super(driver);
		
	}
	

}
