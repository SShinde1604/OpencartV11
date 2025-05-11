package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountDIsplay_AftrLogin extends BasePage{
	
	public MyAccountDIsplay_AftrLogin(WebDriver driver)
	{
		super(driver);
		}
	
	//LOcators
	@FindBy(xpath="//h2[text()='My Account']") WebElement MyAccountTextVerify;
	@FindBy(xpath="//div[@class='list-group']//a[text()='Logout']") WebElement Logout;
	
	// Action Methods
	public boolean MyAccountDisplay()
	{
	try {
			return(MyAccountTextVerify.isDisplayed());
			} 
		catch (Exception e) 
		{
		   return false;		   
		}
	}
	
	
	public void CLickLogout()
	{
		Logout.click();
	}
	
	

}
