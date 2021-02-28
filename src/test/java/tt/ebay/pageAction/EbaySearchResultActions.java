package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import tt.ebay.pageElements.EbaySearchResultLocators;
import tt.utilities.SetupDrivers;

public class EbaySearchResultActions {
	EbaySearchResultLocators EbaySearchResultLocatorsObj;
	
	public EbaySearchResultActions(){
		EbaySearchResultLocatorsObj = new EbaySearchResultLocators();
		PageFactory.initElements(SetupDrivers.driver ,EbaySearchResultLocatorsObj);
	}
	
	public void verifyShirtRelatedproducts(){
	
	//Option:1
		EbaySearchResultLocatorsObj.txtSleeveLength.isDisplayed();
		
		//Option:2
		System.out.println(EbaySearchResultLocatorsObj.txtSleeveLength.getText());
	}
	public void homePage() {
		SetupDrivers.driver.get("https://www.ebay.com/");
		SetupDrivers.driver.manage().window().maximize();
		SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

public void filterLongSleev()	throws InterruptedException{
	Thread.sleep(3000); 
	EbaySearchResultLocatorsObj.cbxLongSleeve.click();
   Thread.sleep(3000); 
}
	
public void clickImage(){
//EbaySearchResultLocatorsObj.image.click();

}

public void viewCartbutton(){
//EbaySearchResultLocatorsObj.
}

public void filterBrand(String Brand) throws Exception{
Thread.sleep(3000); 
if(Brand.equals("Adidas")){
EbaySearchResultLocatorsObj.cbxBrandAdidas.equals("Adidas");



}

}
}













