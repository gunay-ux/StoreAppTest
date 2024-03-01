package pages;


import java.util.List;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends BasePage {
	
	

	@AndroidFindBy(id="com.androidsample.generalstore:id/toolbar_title")
    private WebElement title;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productName")
    private List<WebElement> cardName;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/productAddCart")
    private WebElement addTocard;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/counterText")
    private WebElement basketCard;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
    private WebElement shoppingCard;
	
	@AndroidFindBy(id="com.androidsample.generalstore:id/appbar_btn_back")
    private WebElement backButton;
	

	public ProductPage(AppiumDriver driver) {
		super(driver);
		
		
	}
	

	public String getTitleofPAge() {
		
		String productName= elementControl.getAttribute(title,"text");
		
		return productName;
	}
	
	public boolean isEnabledElement() {
		
		return elementControl.is_Displayed(title);
		
			
	}
	
	public void addCard() throws Exception {
	  
		System.out.println("addcard method");	
		for(int i = 0; i< cardName.size(); i++) {
			String cardname = cardName.get(i).getText();
			System.out.println("1.satır"+cardname);
			if(cardname.contains("Air Jordan 4 Retro")) {
				elementControl.click(addTocard);
				System.out.println(cardname);
				break;
			}
		}
	}
	

	
	public void backLogin() {
		elementControl.click(backButton);
			
	}
	public void clickShoppingCard(){
		elementControl.click(shoppingCard);
			
	}
	public String  basketCountControl(){
		
		String card = elementControl.getAttribute(basketCard, "text");
		return card;
	}
	public void shoppingCardclick() {
		elementControl.cardPage(shoppingCard);
		
	}
	

}
