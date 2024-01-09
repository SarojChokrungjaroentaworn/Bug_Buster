package testcases.Dilnaz;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class Testcase02 extends CommonMethods {

	@Test
	public void privacyAndPolicy() {
		getDriver();
		clickOnMenuBar(hp.footerRightMenu, getProperty("FooterMenuOption02"));
		Assert.assertTrue(compare(getDriver().getCurrentUrl(), getProperty("CurrentURLForNganTestCase_02")));
	}

}