package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.VerificationPage;
import test_Base.BaseClass;

@Test(groups= {"Sanity", "Master"})

public class TC005_SearchProduct_Test extends BaseClass {
	
	public void Verify_Search_Func() throws InterruptedException {
	
	HomePage hp = new HomePage(driver);
	hp.SearchBox();
	hp.SearchIconButn();
	Thread.sleep(2500);
	
	VerificationPage vp = new VerificationPage(driver);
	vp.SearchProdDisp();
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
