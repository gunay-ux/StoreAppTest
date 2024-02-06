package pages;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProductPage extends BasePage {
	
	@AndroidFindBy(xpath="")
    private WebElement country;
	
	@AndroidFindBy(xpath="")
    private WebElement username;
	 
	@AndroidFindBy(xpath="")
    private WebElement password;
	 
	@AndroidFindBy(xpath="")
    private WebElement gender;
	 
	@AndroidFindBy(xpath="")
    private WebElement entry;

}
