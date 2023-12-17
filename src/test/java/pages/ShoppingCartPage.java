package pages;

import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShoppingCartPage {
	
	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

}
