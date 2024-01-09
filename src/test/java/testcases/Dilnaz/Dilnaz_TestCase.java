package testcases.Dilnaz;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utilities.CommonMethods;
import utilities.ListensTestNG;

@Listeners(ListensTestNG.class)
public class Dilnaz_TestCase extends CommonMethods {
	@Test
	public void productReview() {
		getDriver();
		hoverOverMouse(hp.gear);
		click(gp.Bags);
		click(gp.reviewButtonOfFirstItem);
		Assert.assertTrue(compare(getDriver().getCurrentUrl(), getProperty("CurrentURLForNganTestCase_01")));
	}

	@Test
	public void privacyAndPolicy() {
		getDriver();
		clickOnMenuBar(hp.footerRightMenu, getProperty("FooterMenuOption02"));
		Assert.assertTrue(compare(getDriver().getCurrentUrl(), getProperty("CurrentURLForNganTestCase_02")));
	}

	@Test
	public void myPreviousOrder() throws InterruptedException {
		click(hp.headerButton);
		clickOnMenuBar(hp.header, getProperty("Luma_HeaderOption1"));
		click(ap.myOrder);
		Assert.assertTrue(compareStringInList(ap.firstPreviousOrder, getProperty("First_Previous_Order_Date")));
	}

}
