package tests;


import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import implementation.CommenDriver;
import io.appium.java_client.AppiumDriver;
import pages.LoginPage;
import pages.ProductPage;
import utils.ConfigUtil;

public class BaseTest {
	
	public String currentWorkingDirectory;
	public String configFileName;
	public Properties configProperty;
	public String url;
	public String deviceName;
	public CommenDriver commendriver;
	LoginPage loginpage;
	ProductPage productpage;
    AppiumDriver appiumdriver;
 
  
 
	@BeforeSuite
	public void preSetup() throws Exception {
		
		currentWorkingDirectory = System.getProperty("user.dir");
		configFileName = currentWorkingDirectory+"/src/config/config.properties";
		System.out.println("configFileName"+configFileName);
		configProperty = ConfigUtil.readProperties(configFileName);	
		System.out.println("configProperty"+configProperty);
	
		
	}
	@BeforeClass
	public void setup() throws Exception{
		
		if(this.configProperty==null) {
			
			configProperty = new Properties();
		    currentWorkingDirectory = System.getProperty("user.dir");
		    configFileName = currentWorkingDirectory+"/src/config/config.properties";
		    System.out.println(configFileName);
		    
		    configProperty = ConfigUtil.readProperties(configFileName);
		    url = configProperty.getProperty("baseURL");
			deviceName = configProperty.getProperty("appName");
			
			commendriver = new CommenDriver(url, deviceName);
			appiumdriver = commendriver.driver;
		    return;
			
		}
		
		url = configProperty.getProperty("baseURL");
		deviceName = configProperty.getProperty("appName");
		commendriver = new CommenDriver(url, deviceName);
		appiumdriver = commendriver.driver;
	
		
		
				
		
	}
	 @BeforeMethod
	  public void beforeMethod(Method m) {
		 
		 loginpage = new LoginPage(appiumdriver);
		 productpage = new ProductPage(appiumdriver);
		 System.out.println("\n"+ "***** starting test:" + m.getName() + "*****" + "\n");
		  
	  }
	
	
	
	@AfterClass
	public void tearDown() {
		
	
		commendriver.closeApp();
		
		
	}
	
	
	

}
