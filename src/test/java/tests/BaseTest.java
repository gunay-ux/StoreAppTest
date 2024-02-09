package tests;

import java.io.IOException;
import java.util.Properties;


import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import implementation.CommenDriver;
import io.appium.java_client.AppiumDriver;
import pages.LoginPage;
import utils.ConfigUtil;

public class BaseTest {
	
	String currentWorkingDirectory;
	String configFileName;
	Properties configProperty;
	String url;
	String deviceName;
    CommenDriver commondriver;
    LoginPage loginpage;
    AppiumDriver appiumdriver;
 
    

  
 
	@BeforeSuite
	public void preSetup() throws IOException {
		
		currentWorkingDirectory = System.getProperty("user.dir");
		configFileName = currentWorkingDirectory+"/src/config/config.properties";
		System.out.println(configFileName);
		configProperty = ConfigUtil.readProperties(configFileName);	
		
	}
	@BeforeClass
	public void setup() throws Exception{
		
		url = configProperty.getProperty("baseURL");
		deviceName = configProperty.getProperty("appName");
		System.out.println(url);
		System.out.println(deviceName);
		commondriver = new CommenDriver(url, deviceName);
		appiumdriver = commondriver.driver;
		loginpage = new LoginPage(appiumdriver);
		
		
	}
	
	@AfterClass
	public void tearDown() {
		
		//commondriver.CloseApp();
		
		
	}
	
	
	

}
