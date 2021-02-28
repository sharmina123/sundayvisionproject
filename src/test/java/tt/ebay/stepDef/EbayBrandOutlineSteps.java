package tt.ebay.stepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import tt.ebay.pageAction.EbayHomePageActions;

public class EbayBrandOutlineSteps {

	EbayHomePageActions EbayHomePageActionsObj = new EbayHomePageActions();
	//EbaySearchResultActions EbaySearchResultActionsObj = new EbaySearchResultActions();
	
	@Given("Open Ebay Website")
	public void open_Ebay_Website() {
		EbayHomePageActionsObj.equals(EbayHomePageActionsObj);
	}
	
	@When("^Search for \"([^\"]*)\"$")
	public void search_for(String items) throws Throwable {
		EbayHomePageActionsObj.searchShirt();
	}

	@When("^Filter by \"([^\"]*)\"$")
	public void filter_by(String brand) throws Throwable {
		EbayHomePageActionsObj.equals(brand);
		
	}
	

	@Then("^Item list should have product of \"([^\"]*)\"$")
	public void item_list_should_have_product_of(String brand) throws Throwable {
		EbayHomePageActions.class.equals(brand);													
	    
}

}
