package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountDIsplay_AftrLogin;
import test_Base.BaseClass;
import utilities.DataProviders;


public class TC003_Login_DDT_Test extends BaseClass
{

	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class, groups="DataDriven")
	public void verify_loginDDT(String email, String password, String exp)
	{
		
		
		try {
	
		//Home page
			HomePage hp=new HomePage(driver);
			hp.ClickMyAccount();
			hp.ClickLogin(); //Login link under MyAccount
				
			//Login page
			LoginPage lp=new LoginPage(driver);
			lp.setemail(email);
			lp.setpassword(password);
			lp.LoginButnClick(); 		//Login button
				
			//My Account Page
			MyAccountDIsplay_AftrLogin macc=new MyAccountDIsplay_AftrLogin(driver);
			boolean targetPage=macc.MyAccountDisplay();
			
			
			/*Data is valid  -  login success - test pass  - logout
								Login failed - test fail

			  Data is invalid - login success - test fail  - logout
							    login failed - test pass
			*/
			
			if(exp.equalsIgnoreCase("Valid"))
			{
				if(targetPage==true)
				{
					macc.CLickLogout();
					Assert.assertTrue(true);
				}
				else
				{
					Assert.assertTrue(false);
				}
			}
			
			if(exp.equalsIgnoreCase("Invalid"))
			{
				if(targetPage==true)
				{
					macc.CLickLogout();
					Assert.assertTrue(false);
				}
				else
				{
					Assert.assertTrue(true);
				}
			}
		}
		catch(Exception e)
		{
			Assert.fail("An exception occurred: " + e.getMessage());
		}
			
		
	}
	
}









