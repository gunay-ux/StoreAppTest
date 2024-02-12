package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	@Parameters({"userName"})
	@Test
	public void verifyLogin(String userName) throws Exception {
		
		System.out.println("Log test started");
		loginpage.runLogin(userName);
		
				
		
	
		
	}

}
