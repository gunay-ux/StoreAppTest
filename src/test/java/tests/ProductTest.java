package tests;



import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import pages.LoginPage;
import pages.ProductPage;




public class ProductTest extends BaseTest{

	
	 @BeforeMethod
	  public void beforeMethod(Method m) {

		 loginpage = new LoginPage(appiumdriver);
		 productpage = new ProductPage(appiumdriver);
	      System.out.println("\n"+ "***** starting productPage test:" + m.getName() + "*****" + "\n");
		  System.out.println("productappiumdriver"+appiumdriver); 
		  System.out.println("productconfigProperty"+configProperty);
	  }
	 
	 
	@Parameters({"userName"})
	@Test
	public void verifyProduct(String userName) throws Exception {
		
		loginpage = new LoginPage(appiumdriver);
		System.out.println("Login test started");
		loginpage.runLogin(userName);
		System.out.println("p test started");
		productpage.addCard();
		System.out.println("p test started");
		Thread.sleep(3000);
	    String count = productpage.basketcountControl();
	    Thread.sleep(3000);
	    System.out.print("Count:"+count);
	    Assert.assertEquals(count, "1");
		
	    
	}
	
	 /* productpage.addCard();
    Thread.sleep(3000);
    String count = productpage.basketcountControl();
	System.out.print("Count:"+count);
	Assert.assertEquals(count, "1");
	
	   
	
	*/

}
