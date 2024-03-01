package tests;



import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class LoginTest extends BaseTest {
	
	 
	
	@Parameters({"userName"})
	@Test(priority=1)
	public void verifyLogin(String userName) throws Exception {
		
		loginpage.runLogin(userName);
		String actPageName = productpage.getTitleofPAge();
		System.out.println(actPageName);
		Assert.assertEquals("Products",actPageName );
	    
		}
	
	@Test(priority=2)
	public void invalidUserName () throws Exception {
		
		String actAlert = loginpage.invalidUsernameLogin();
		System.out.println("Toastmassage:"+ actAlert);
		Assert.assertEquals("Please enter your name",actAlert );
	    
	    
		}
	
	
	

}
