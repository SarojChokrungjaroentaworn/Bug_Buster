package utilities;

import pages.HomePage;
import pages.LogInPage;

public class PageInitializer extends BaseClass{
	
	public static HomePage hp;
	public static LogInPage lp;
	
	public static void initialize() {
		hp = new HomePage();
		lp = new LogInPage();
	}

}
