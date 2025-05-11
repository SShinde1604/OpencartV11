package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage
{
	// Constructor
	public HomePage(WebDriver driver) 
	{
		super(driver);
		
	}
	
	
	// Locators	
	@FindBy(xpath="//span[text()='My Account']") WebElement MyAccount;
	@FindBy(xpath="//ul//li//a[text()='Register']") WebElement Register;
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//li//a[text()='Login']") WebElement Login;
	
	
	// Action Methods
	public void ClickMyAccount()
	{
		MyAccount.click();
	}
	
	
	public void ClickRegister()
	{
		Register.click();
	}
	
	
	public void ClickLogin()
	{
		Login.click();
	}
	
	
	
	
}
