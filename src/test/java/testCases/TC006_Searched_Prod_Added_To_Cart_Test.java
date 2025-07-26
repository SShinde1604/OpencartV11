package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.VerificationPage;
import test_Base.BaseClass;

@Test(groups= {"Sanity", "Master"})

public class TC006_Searched_Prod_Added_To_Cart_Test extends BaseClass{
	
	public void Verify_SearchProdAddedToCartFunc() {
	
		HomePage hp = new HomePage(driver);
		hp.AddToCart();
		
		VerificationPage vp = new VerificationPage(driver);
		String Verify_SuccessMsg = vp.ProdAddedToCart_SuccessMsgDisplay();
		Assert.assertEquals(Verify_SuccessMsg, "shopping cart");
	
	}

}
