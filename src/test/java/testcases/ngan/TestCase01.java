package testcases.ngan;


import org.testng.annotations.Test;

import utilities.CommonMethods;

//Test Logo

public class TestCase01 extends CommonMethods{

	@Test
	public void logoTesting () {
		getDriver();
		click(hp.whatnew);
		click(hp.logo);
		click(hp.sale);
		click(hp.logo);
	}
	
}
