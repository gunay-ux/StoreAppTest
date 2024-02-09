package implementation;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import java.time.Duration;





public class CommenDriver {
	
	public AppiumDriver driver;
	public AppiumDriverLocalService service;
	
	public CommenDriver( String url, String deviceName){
	
		service = new AppiumServiceBuilder()
			       .withIPAddress("127.0.0.1")
			       .usingPort(4723)
			       .build();
			UiAutomator2Options option = new UiAutomator2Options();
			option.setApp(url);
			option.setDeviceName(deviceName);
			driver  = new AndroidDriver(service.getUrl(), option);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
			
			
		
		}
	
	public AppiumDriver getDriver() {
	    	  return driver;
	      }
	   
	
	public void CloseApp() {
		
		driver.quit();
		service.stop();
		
		
	}
	

}