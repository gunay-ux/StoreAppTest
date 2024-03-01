package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CardPage;
//import pages.CardPage;
//import pages.LoginPage;
//import pages.ProductPage;
import pages.LoginPage;
import pages.ProductPage;

public class CardTest extends BaseTest {
	
	 @BeforeMethod
	  public void beforeMethod(Method m) {
 
		 loginpage = new LoginPage(appiumdriver);
		 productpage = new ProductPage(appiumdriver);
		 cardpage = new CardPage(appiumdriver);
	     System.out.println("\n"+ "***** starting productPage test:" + m.getName() + "*****" + "\n");
		 
	  }
	
	@Parameters({"userName"})
	@Test
	public void verifyCardPageName(String userName) throws Exception {
	    loginpage.runLogin(userName);
	    productpage.addCard();
	    productpage.basketCountControl();
	    productpage.shoppingCardclick();
		String cardName  = cardpage.getCardName();
	    System.out.print("Cardname:"+cardName);
	    Assert.assertEquals(cardName, "Cart");
	    
	
	}
	

}
