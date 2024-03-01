package tests;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.CardPage;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest{

	
	 @BeforeMethod
	  public void beforeMethod(Method m) {

		 loginpage = new LoginPage(appiumdriver);
		 productpage = new ProductPage(appiumdriver);
		 cardpage = new CardPage(appiumdriver);
	     System.out.println("\n"+ "***** starting productPage test:" + m.getName() + "*****" + "\n");
		 
	  }
	 
	 
	@Parameters({"userName"})
	@Test
	public void verifyForAddProduct(String userName) throws Exception {
		
		
		System.out.println("Login test started");
		loginpage.runLogin(userName);
		productpage.addCard();
	    String count = productpage.basketCountControl();
	    System.out.print("Count:"+count);
	    Assert.assertEquals(count, "1");
	    productpage.shoppingCardclick();
	   
	}
	    
	
	


}
