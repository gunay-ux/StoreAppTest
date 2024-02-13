package implementation;

import java.time.Duration;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.AppiumDriver;

import utils.TestUtils;

public class ElementControl {
	
	 AppiumDriver driver;
 
	
    public ElementControl(AppiumDriver driver) {
    	this.driver = driver;
    	
    }
    
    public void waitForVisibility(WebElement e) {
   	 
  	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtils.WAIT) );
  	  wait.until(ExpectedConditions.visibilityOf(e));
  }
    public void click(WebElement e) {
  	  waitForVisibility(e);
  	  e.click();
    }
    
    public void sendKeys(WebElement e, String txt) {
  	  waitForVisibility(e);
  	  e.sendKeys(txt);
  	  System.out.println("sendkey:"+txt);
    }
    
    public String getAttribute(WebElement e, String attribute) {
  	  waitForVisibility(e);
  	 return e.getAttribute(attribute);
  	 
    }
    
    public boolean is_Enabled(WebElement e) {
    	  waitForVisibility(e);
    	  return e.isEnabled();
    	 
      }
    
  
  

    
    

}
