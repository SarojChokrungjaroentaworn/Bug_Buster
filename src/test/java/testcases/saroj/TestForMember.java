package testcases.saroj;

import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

public class TestForMember extends CommonMethods{
	
	@Test
	public void testOnly() {
		getDriver();
		click(fp.subscribeToMailingLink);
		
		String expectedUrl = "https://softwaretestingboard.com/subscribe/";
		String actualUrl = getDriver().getCurrentUrl();
		
		Assert.assertEquals(actualUrl, expectedUrl, "The URL is not correct!!!");
		
		sendKey(subp.emailAddressTextBox, getProperty("email"));
		sendKey(subp.firstNameTextBox, getProperty("firstName"));
		sendKey(subp.lastNameTextBox, getProperty("lastName"));
		sendKey(subp.companyNameTextBox, getProperty("companyName"));
		sendKey(subp.positionTextBox, getProperty("Position"));
		
		click(subp.subscribeButton);
		
        System.out.println(fp.textStatusSubsribe.getText());
	}

}
