package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerificationPage extends BasePage{
	
	public VerificationPage(WebDriver driver) {
		super(driver);
	}
	
	// Locators
	// Search Product is displayed or not (Element)
	@FindBy(xpath="//h2[text()='Products meeting the search criteria']") WebElement SearchedProdDisplay;
	@FindBy(xpath="//a[text()='shopping cart']") WebElement ProdAddedToCart;
	
	
	// Action Methods
	// Search Product is displayed or not (Method)
	public boolean SearchProdDisp() {
		
		try {	
		return(SearchedProdDisplay.isDisplayed());
		}
		catch (Exception ef){
			return false;
		} 
	}
	
	public String ProdAddedToCart_SuccessMsgDisplay()
	{
		return ProdAddedToCart.getText();
	} 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
