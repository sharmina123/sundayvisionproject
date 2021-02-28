package tt.ebay.pageAction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import tt.ebay.pageElements.EbayBrandOutlineLocators;
import tt.utilities.SetupDrivers;

public class EbayBrandoutlineAction {
	
	EbayBrandOutlineLocators EbayBrandOutlineLocatorsobj;
	public EbayBrandoutlineAction (){
		EbayBrandOutlineLocatorsobj = new EbayBrandOutlineLocators();
		PageFactory.initElements(SetupDrivers.driver, EbayBrandOutlineLocatorsobj);
		
	}

		public void LoadEbayHomePage(){
		SetupDrivers.driver.manage().window().maximize();
		 SetupDrivers.driver.get("https://www.ebay.com/");
		 SetupDrivers.driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		}	
		
		public void searchShirt() throws Exception{
			Thread.sleep(3000);
			EbayBrandOutlineLocatorsobj.itemTestBox.clear();
			EbayBrandOutlineLocatorsobj.itemTestBox.sendKeys("Shirt");
			EbayBrandOutlineLocatorsobj.searchBtn.click();
		}

		public void brandtBox(String brand) throws Throwable {
			
			Thread.sleep(3000);
			
			if(brand.equals("Adidas")) {
				EbayBrandOutlineLocatorsobj.adidasChkbox.click();
				
			}else if (brand.equals("Nike")) {
				EbayBrandOutlineLocatorsobj.cbxBrandNike.click();
				
			}
			else if (brand.equals("Unbranded")) {
				EbayBrandOutlineLocatorsobj.Chkboxunbranded.click();
			}
			
			Thread.sleep(3000);
		}

		}	
		
	
		

