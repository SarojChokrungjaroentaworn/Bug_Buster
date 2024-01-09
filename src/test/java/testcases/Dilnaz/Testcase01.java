package testcases.Dilnaz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class Testcase01 extends CommonMethods {

	@Test
	public void productReview() {
		getDriver();
		hoverOverMouse(hp.gear);
		click(gp.Bags);
		click(gp.reviewButtonOfFirstItem);
		Assert.assertTrue(compare(getDriver().getCurrentUrl(), getProperty("CurrentURLForNganTestCase_01")));
	}

}
