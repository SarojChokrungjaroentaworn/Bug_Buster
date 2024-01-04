package testcases.zach;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.BaseClass;
import utilities.CommonMethods;

public class BB_TestCase_03 extends CommonMethods{
@Test
public void FitnessEquipment() {
	click(hp.gear);
	hoverOverMouse(gp.Gear);
	hardWait(3);
	click(gp.FitnessEquipmentMenu);
	String expectedURL= BaseClass.getDriver().getCurrentUrl();
	String actualURL= "https://magento.softwaretestingboard.com/gear/fitness-equipment.html";
	Assert.assertEquals(actualURL, expectedURL);
	hoverOverMouse(gp.SpriteFoamRoller);
	click(gp.AddSpriteFoamRollerToCart);
	Assert.assertTrue(gp.SpriteRollerAddedToCartVerification.getText().contains(getProperty("SpriteFoamRoller_AddedToCart_Verification")));
}
}


//Assert.assertTrue(gp.FitnessEquipmentVerification.getText().contains(getProperty("Luma_SubBarMenuGear_Option2")));