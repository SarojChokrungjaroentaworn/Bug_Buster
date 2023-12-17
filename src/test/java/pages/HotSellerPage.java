package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HotSellerPage {
	
	public HotSellerPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
