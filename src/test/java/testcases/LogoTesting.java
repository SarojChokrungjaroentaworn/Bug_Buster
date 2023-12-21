package testcases;

import org.testng.annotations.Test;
import utilities.CommonMethods;

	public class LogoTesting extends CommonMethods{
		@Test
		public void openBrowser () {
			getDriver();
			click(hp.whatnew);
			click(hp.logo);
			click(hp.sale);
			click(hp.logo);
		
}
}

