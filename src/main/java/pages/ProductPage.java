package pages;


import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends BasePage {
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
    private WebElement tile;
	
	@AndroidFindBy(id="(//android.widget.TextView[@resource-id=\"com.androidsample.generalstore:id/productAddCart\"])[1]")
    private WebElement addCard;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/counterText")
    private WebElement counterText;
	
	@AndroidFindBy(id="(com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement shoppingCard;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_back")
    private WebElement backButton;
	

	public ProductPage(AppiumDriver driver) {
		super(driver);
		
	}
	
	public void addCard() {
		
		elementControl.click(addCard);
		
			
	}
	
	public void backLogin() {
		
		elementControl.click(backButton);
			
	}
	
public void clickShoppingCard(){
		
		elementControl.click(shoppingCard);
			
	}
	

}
