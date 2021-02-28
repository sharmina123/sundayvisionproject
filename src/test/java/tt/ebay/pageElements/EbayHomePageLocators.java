package tt.ebay.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import tt.utilities.SetupDrivers;

public class EbayHomePageLocators {
	//search for anything
@FindBy(xpath="//input[@id='gh-ac']")	
public WebElement txtboxSearchForAnything;

      //Search

      @FindBy(xpath="//input[@id='gh-btn']")
public WebElement btnSearch;
      
      //Search - Locators without page factory
      
      WebElement Search = SetupDrivers.driver.findElement(By.xpath("//input[@id='gh-btn']"));

	public Object txtSearchForAnything;
}
