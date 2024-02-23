package tests;


import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
//import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.LoginPage;






public class LoginTest extends BaseTest {
	
	 
	 @BeforeMethod
	  public void beforeMethod(Method m) {
		 loginpage = new LoginPage(appiumdriver);
		  System.out.println("\n"+ "***** starting test:" + m.getName() + "*****" + "\n");
		  
	  }
	@Parameters({"userName"})
	@Test
	public void verifyLogin(String userName) throws Exception {
		
		loginpage = new LoginPage(appiumdriver);
		System.out.println("Loginappiumdriver"+appiumdriver); 
		System.out.println("LoginconfigProperty"+configProperty);
		System.out.println("Login test started");
		loginpage.runLogin(userName);
		Thread.sleep(3000);
		
		/*String actuall = productpage.getTitleofPAge();
		System.out.println(actuall);
		Assert.assertEquals("Products",actuall );*/
	    
		}
	

}
