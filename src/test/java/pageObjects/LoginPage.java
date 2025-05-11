package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	public LoginPage(WebDriver driver) {
		super(driver);
		}
	
	// Locators
	@FindBy(xpath="//input[@id='input-email']") WebElement Email;
	@FindBy(xpath="//input[@id='input-password']") WebElement Password;
	@FindBy(xpath="//input[@class='btn btn-primary']") WebElement LoginButton;
	
	// Action Methods
	public  void setemail(String email)
	{
		Email.sendKeys(email);
	}
	
	
	public void setpassword(String passwrd)
	{
		Password.sendKeys(passwrd);
	}
	
	
	public void LoginButnClick()
	{
		LoginButton.click();
	}


	
	
	
	

}
