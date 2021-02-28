package tt.ebay.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EbayBrandOutlineLocators {
	
@FindBy(xpath="//*[@id=\"gh-ac\"]")
public WebElement itemTestBox;	


@FindBy(xpath="//*[@id=\"gh-btn\"]")
public WebElement searchBtn;	

//Brand search
@FindBy(xpath="//*[@id=\"x-refine_group_1_1\"]/u1/1i/div/span/input")
public WebElement adidasChkbox;

@FindBy(xpath="//*[@id=\"x-refine_group_1_1\"]/u1/1i/[3]/div/a/div/span/input")
public WebElement unbrandCKbox;	

@FindBy(xpath= "//*[@arialabel='nike']")
public WebElement cbxBrandNike;


@FindBy(xpath = "//*[@arialabel='adidas']")
public WebElement cbxBrandadidas;

@FindBy(xpath = "//*[@arialabel='unbranded']")
public WebElement Chkboxunbranded;






}
