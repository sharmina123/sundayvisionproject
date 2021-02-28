package tt.ebay.pageAction;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayCartLocators;
import tt.utilities.SetupDrivers;

public class EbayCartAction {
	
	EbayCartLocators EbayCartLocatorsObj;

	public  EbayCartAction(){
		EbayCartLocatorsObj = new EbayCartLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayCartLocatorsObj);
	}
	public void selectcolor(){
}

	public void selectsize(){
		
	}
	
	public void saddToCart(){
		
	}
	
}