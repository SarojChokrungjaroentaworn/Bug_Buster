package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ShoppingCartPage {

	public ShoppingCartPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}

	@FindBy(xpath = "//button[@id='top-cart-btn-checkout']")
	public WebElement proceedCheckOut;

	@FindBy(xpath = "//a[@title='Remove item']")
	public WebElement trash;

	@FindBy(xpath = "//button[@class='action-primary action-accept']")
	public WebElement okToDeleteItem;

	@FindBy(xpath = "//a[@class='action viewcart']")
	public WebElement viewAndEditCart;

	@FindBy(xpath = "//table[@id='shopping-cart-table']/tbody[1]")
	public WebElement firstItemInCart;
	
	@FindBy(xpath = "//strong[@class='subtitle empty']")
	public WebElement emptyCart;
	
	

}
