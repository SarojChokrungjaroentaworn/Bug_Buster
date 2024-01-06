package testcases.Dilnaz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class Testcase01 extends CommonMethods {
	
	@Test
	public void serchRefinement() {
		getDriver();
		sendKey(hp.searchTextBox, getProperty("SearchItemMensT-shirts_Testcase01"));
		click(hp.MagnifyingGlass);
		Assert.assertEquals(sp.searchResults.getText(),"Search results for: 'Mens t-shirts'" );
		
		
	}
	
    

}
