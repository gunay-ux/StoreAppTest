package tests;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
	
	
	@Parameters({"userName"})
	@Test
	public void verifyLogin(String userName) {
		
		System.out.println("test started");
		System.out.println(userName);
		loginpage.runLogin(userName);
		
				
		
	
		
	}

}
