package testcases.sirirat;


import org.testng.annotations.Listeners;


import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;



//Search Refinement Mens t-shirts

@Listeners(ListensTestNG.class)

public class BBTC_01 extends CommonMethods {
	

	
	@Test
	public void searchRefinement() {
		
		getDriver();                        //copy "key" from user data file
		sendKey(sp.searchTextBox,getProperty("Luma_SearchRefinement"));
		click(hp.MagnifyingGlass);
		scrollDown(500);
		takeScreenShot(getDriver());
		
		
		
		
		
		
		
		
		
//		String firstItemPriceString = ip.firstItemPrice.getText(); 
//		
//        firstItemPriceString = firstItemPriceString.substring(1);
//        
//        double firstItemPriceDouble = Double.parseDouble(firstItemPriceString);
	    
        
        
    
		
	}

}