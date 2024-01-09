package testcases.Dilnaz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class Testcase03 extends CommonMethods {

	@Test
	public void myPreviousOrder() throws InterruptedException {
		click(hp.headerButton);
		clickOnMenuBar(hp.header, getProperty("Luma_HeaderOption1"));
		click(ap.myOrder);
		Assert.assertTrue(compareStringInList(ap.firstPreviousOrder,getProperty("First_Previous_Order_Date")));
	}
}