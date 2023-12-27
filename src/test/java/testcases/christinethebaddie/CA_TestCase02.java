package testcases.christinethebaddie;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.CommonMethods;

public class CA_TestCase02 extends CommonMethods {

	@Test
	public void subscribeSubmission() {
		
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
		
		
        WebElement textElement = getDriver().findElement(By.xpath("//div[@id='mce-success-response']"));

        String actualText = textElement.getText();
        String expectedText = "Almost finished... We need to confirm your email address. To complete the subscription process, please click the link in the email we just sent you.";

        Assert.assertEquals(actualText, expectedText, "Text verification failed.");
		
		
	}
	
}
