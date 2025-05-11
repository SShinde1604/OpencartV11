package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountDIsplay_AftrLogin;
import test_Base.BaseClass;


@Test(groups= {"Sanity", "Master"})
public class TC002_Login_Test extends BaseClass {

	public void Verfiy_Login_Funct() throws InterruptedException
	{	
		try {
			//HomePage
			HomePage hp = new HomePage(driver);
			hp.ClickMyAccount();
			hp.ClickLogin();
			Thread.sleep(2000);

			// Login Page
			LoginPage lp=new LoginPage(driver);
			lp.setemail(p.getProperty("Email"));
			lp.setpassword(p.getProperty("Password"));
			lp.LoginButnClick();
			Thread.sleep(2000);


			// My Account Page
			MyAccountDIsplay_AftrLogin MyAcnt=new MyAccountDIsplay_AftrLogin(driver);
			boolean VerfyMyAcntMsg= MyAcnt.MyAccountDisplay();

			Assert.assertEquals(VerfyMyAcntMsg, true, "Login Failed");
		}
		catch(Exception e)
		{
			Assert.fail();
		}

	}

}
