package testcases.zach;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class BB_TestCase_02 extends CommonMethods {
	@Test 
public void bagPage() {
	click(hp.gear);
	hoverOverMouse(gp.Gear);
	hardWait(3);
	click(gp.Bags);
	hoverOverMouse(gp.DrivenBackpack);
	hardWait(3);
	click(gp.AddToCart);
	Assert.assertTrue(gp.AddedToCartVerification.getText().contains(getProperty("Item_Added_ForTestCase_BB_TestCase_02")));
}
}
