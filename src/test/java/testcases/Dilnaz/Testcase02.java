package testcases.Dilnaz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class Testcase02 extends CommonMethods {
	
	@Test
	public void serchCaseSensitivity() {
		getDriver();
		sendKey(hp.searchTextBox, getProperty("SearchItemWomensBag_Testcase02"));
		click(hp.MagnifyingGlass);
		hoverOverMouse(sp.womensBag);
		Assert.assertTrue(sp.womensBag.isDisplayed());
		

}
}