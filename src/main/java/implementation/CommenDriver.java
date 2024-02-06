package implementation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.net.MalformedURLException;


import org.openqa.selenium.WebDriver;


public class CommenDriver {
	
	public WebDriver driver;
	public AppiumDriverLocalService service;
	
	public CommenDriver() throws MalformedURLException {
		service = new AppiumServiceBuilder()
		       .withIPAddress("127.0.0.1")
		       .usingPort(4723)
		       .build();
		UiAutomator2Options option = new UiAutomator2Options();
		option.setApp("/home/gunay/eclipse-workspace/StoreAppTest/src/test/resources/General-Store.apk");
		option.setDeviceName("Myphone");
		driver  = new AndroidDriver(service.getUrl(), option);
		
		
		
	}
	

}