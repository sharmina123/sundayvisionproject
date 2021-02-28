package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayHomePageLocators;
import tt.utilities.SetupDrivers;

public class EbayHomePageActions {
	
EbayHomePageLocators EbayHomePageLocatorsObj;
	
public EbayHomePageActions(){
EbayHomePageLocatorsObj = new EbayHomePageLocators();
		
	PageFactory.initElements(SetupDrivers.driver, EbayHomePageLocatorsObj);
}
	
public void LoadEbayHomePage(){
SetupDrivers.driver.manage().window().maximize();
 SetupDrivers.driver.get("https://www.ebay.com/");
 SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}
	
public void searchShirt() throws Exception{
	Thread.sleep(3000);
	EbayHomePageLocatorsObj.txtboxSearchForAnything.clear();
	EbayHomePageLocatorsObj.txtboxSearchForAnything.sendKeys("Shirt");
	EbayHomePageLocatorsObj.btnSearch.click();
}
	
	
public void searchItem(String Item)throws Exception{
	
	EbayHomePageLocatorsObj.txtboxSearchForAnything.clear();
	EbayHomePageLocatorsObj.txtboxSearchForAnything.sendKeys(Item);
	EbayHomePageLocatorsObj.btnSearch.click();	
	
}
	
}

