package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterationPage extends BasePage
{	
	
	public RegisterationPage(WebDriver driver)    // Mandatory step
	{
		super(driver);
	}

	// Locators
	@FindBy(xpath="//input[@name='firstname']") WebElement Firstname;
	@FindBy(xpath="//input[@name='lastname']") WebElement Lastname;
	@FindBy(xpath="//input[@name='email']") WebElement Email;
	@FindBy(xpath="//input[@name='telephone']") WebElement Telephone;
	@FindBy(xpath="//input[@name='password']") WebElement Password;
	@FindBy(xpath="//input[@name='confirm']") WebElement ConfirmPassword;
	@FindBy(xpath="//input[@value='0']") WebElement CheckBoxNo;
	@FindBy(xpath="//input[@name='agree']") WebElement CheckBoxPrivacy;
	@FindBy(xpath="//input[@value='Continue']") WebElement ContinueButton;
	@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement RegMessage;
	
	// Action Methods
	public void SetFirstName(String Fname)
	{
		Firstname.sendKeys(Fname);
	}
	
	public void SetLastName(String Lname)
	{
		Lastname.sendKeys(Lname);
	}
	
	public void SetEmail(String email)
	{
		Email.sendKeys(email);
	}
	
	public void SetTelephone(String telephone)
	{
		Telephone.sendKeys(telephone);
	}
	
	public void SetPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void SetConfirmPassword(String cnfrmPassword)
	{
		ConfirmPassword.sendKeys(cnfrmPassword);
	}
	
	public void ClickCheckBoxNo()
	{
		CheckBoxNo.click();
	}
	
	public void ClickCheckBoxPrivacy()
	{
		CheckBoxPrivacy.click();
	}
	
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}
	
	
	public String RegMessageDisplayed()
	{
		return RegMessage.getText();
	}
	
	
	
	
	
	
}
