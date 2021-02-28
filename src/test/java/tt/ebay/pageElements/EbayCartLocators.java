package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayCartLocators {

	//color
	@FindBy(xpath="//select[@name='color']")
	public WebElement ddcolor;
	
	//size
	@FindBy(xpath="//select[@name='size']")
	public WebElement ddsize;
		
	//Quantity
	@FindBy(xpath="//input[@id='qtyTexrBox']")
	public WebElement txtbxQuantity;
	
	
	//Add to Cart
		@FindBy(xpath="//input[@id='atcRedesignId_btn']")
		public WebElement btnAddCart;
	
}


