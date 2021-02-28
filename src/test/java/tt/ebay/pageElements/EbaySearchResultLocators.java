package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbaySearchResultLocators {

	//Text "Sleeve Length"
	@FindBy(xpath="//h3[text()='Sleeve Length']")
	public WebElement txtSleeveLength;
	
	//Long Sleeve
		@FindBy(xpath="//input[@aria-label=()='Long Sleeve']")
		public WebElement cbxLongSleeve;
		
		//Validate Long Sleeve Shirts
				@FindBy(xpath="//*[contains(text(),Long Sleeve)]")
				public WebElement txtLongSleeve;
		
		//CheckBox for Robotic
		//@FindBy(xpath="//input[@aria-label='Robotic']")
		//public WebElement checkBox;
		
		//image of Robotic
				//@FindBy(xpath="//[@id=srp-river-results']/u1/1i[1]/div/a/div/img]")
			//	public WebElement image;
				
				//Brand Nike
				@FindBy(xpath="//a[@aria-label-'Nike']")
				public WebElement bxBrandNike;

				//Brand Adidas
				@FindBy(xpath="//a[@aria-label-'adidas']")
				public Object cbxBrandAdidas;

				//Unbranded
				@FindBy(xpath="//a[@aria-label-'adidas']")
				public Object cbxUnbranded;
				
				
				//Validate Nike
				@FindBy(xpath="//*[contains(text(),'Nike')]")
				public WebElement txtNike;

				//Validate Adidas
				@FindBy(xpath="//*[contains(text(),'Adidas')]")
				public WebElement txtAdidas;
	
				//Validate Unbranded
				@FindBy(xpath="//*[contains(text(),'Unbranded')]")
				public WebElement txtUnbranded;
				
				
				//Select first item
				@FindBy(xpath="//h3[contains(text(),'AAA ALSTYLE 1301 MENS PLAIN T SHIRT CASUAL SHORT S')]")
				public WebElement InkFirst;
	
}