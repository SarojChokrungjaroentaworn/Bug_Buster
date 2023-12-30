package testcases.sirirat;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import utilities.CommonMethods;

// Ad Redirection 

public class BBTC_03 extends CommonMethods {

	@Test
	public void sortFunction() {

		getDriver();
		// click Woman menu
		click(hp.topBarMenuOptionWomen);
		// click Top menu
		click(hp.topInWoman);
		// click sort by price
		click(ip.sortByPrice);
		
		int index = 0;
		// initiate double array 	
		double[] listItem = new double[ip.listItemAfterSort.size()];
		for (WebElement each : ip.listItemAfterSort) {
			// get each String with $
			String itemPriceString = each.getText();
			// delete $
			itemPriceString = itemPriceString.substring(1);
			// change String to double
			double itemPriceDouble = Double.parseDouble(itemPriceString);
			// input each double into double array
			listItem[index++] = itemPriceDouble;
		}
        // compare between first item with forth item and forth item with last item
		Boolean sortResult = listItem[0] < listItem[3] && listItem[3] < listItem[ip.listItemAfterSort.size() - 1];
		Assert.assertTrue(sortResult);

	}
}
