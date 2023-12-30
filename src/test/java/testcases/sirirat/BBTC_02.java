package testcases.sirirat;

import org.testng.annotations.Test;

import utilities.CommonMethods;

public class BBTC_02 extends CommonMethods {

	@Test
	public void caseSensitivity() {

		getDriver();
		sendKey(sp.searchTextBox, getProperty("Luma_SearchCaseSensitivity"));
		click(hp.MagnifyingGlass);

	}

}
