package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;
import tt.ebay.pageAction.EbaySearchResultActions;

public class EbaySearchsteps {
	
	EbaySearchResultActions searchAction = new EbaySearchResultActions();
	 
	
	
	@Given("^Open Ebay website$")
	public void open_Ebay_website() throws Throwable {
		searchAction.homePage();	
		
	}

	@When("^Search for shirts$")
	public void search_for_shirts() throws Throwable {
		
	}
}