package Grouping;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterationPage;
import test_Base.BaseClass;

public class TC001_AccountRegistration_Test extends BaseClass

{	
	@Test
	public void Verify_Accnt_RegistrationPage() throws InterruptedException
	{
		HomePage hp=new HomePage(driver);
		hp.ClickMyAccount();
		hp.ClickRegister();
		Thread.sleep(3000);
		
		RegisterationPage rp=new RegisterationPage(driver);
		rp.SetFirstName(randomString());
		rp.SetLastName(randomString());
		rp.SetEmail(randomString()+"@gmail.com");
		rp.SetTelephone(randomNumber());
		
		// Password AlphaNumeric
		
		String Passwrd = randomAlphaNumeric();
		 rp.SetPassword(Passwrd);
		rp.SetConfirmPassword(Passwrd);
		Thread.sleep(3000);
		
		rp.ClickCheckBoxNo();
		rp.ClickCheckBoxPrivacy();
		rp.ClickContinueButton();
		Thread.sleep(3000);
		
		String VerfyMsg= rp.RegMessageDisplayed();
		
		Assert.assertEquals(VerfyMsg, "Your Account Has Been Created!");
		
	}
	

	
	
	
	
}
