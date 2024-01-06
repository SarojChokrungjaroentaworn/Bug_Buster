package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class ItemPage {

	public ItemPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath = "//img[@alt='Montana Wind Jacket']")
	public WebElement montanaWindJacketItem;

	@FindBy(xpath = "//*[@id=\"maincontent\"]/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img")
	public WebElement montanaWindJacketItem2;

	@FindBy(xpath = "//div[@option-id='167']")
	public WebElement sizeS;

	@FindBy(xpath = "//div[@id='option-label-color-93-item-49']")
	public WebElement colorblack;
	
	@FindBy(xpath = "//div[@id='option-label-color-93-item-50']")
	public WebElement colorblue;

	@FindBy(xpath = "//button[@title='Add to Cart']")
	public WebElement addToCartButton;

	@FindBy(xpath = "//a[@class='action showcart']")
	public WebElement goToCart;
	
	@FindBy(xpath = "//a[@class='action showcart active']")
	public WebElement goToCartActive;
	
	@FindBy(xpath="//li[@class='item product product-item odd last']")
	public WebElement firstItemInCart;
	
	@FindBy(xpath = "//strong[@class='subtitle empty']")
	public WebElement emptyCart;
	
	@FindBy(xpath = "//select[@id='sorter']/option[2]")
	public WebElement sortByName;
	
	@FindBy(xpath = "//select[@id='sorter']/option[3]")
	public WebElement sortByPrice;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']/li//span[@class='price']")
	public List<WebElement> listItemAfterSort;
	
	@FindBy(xpath = "//ol[@class='products list items product-items']/li//span[@class='price']")
	public List<WebElement> listItemWithPriceOptions;
	
	@FindBy(xpath = "//div[@data-price-box='product-id-1556']//span[@class='price']")
    public WebElement firstItemPrice;
	
	@FindBy(xpath = "//div[@data-price-box='product-id-1652']")
	public WebElement secondItemPrice;
	
	@FindBy(xpath = "//div[@id='narrow-by-list']/div")
	public List<WebElement> leftBarMenu;
	
	@FindBy(xpath = "//*[@id='narrow-by-list']/div[2]/div[2]/div/div")
	public List<WebElement> sizeList;
	
	@FindBy(xpath = "//div[@class='filter-options-content']/ol/li")
	public List<WebElement> subLeftMenu;
	
	@FindBy(xpath = "//div[@class='filter-options-content']/ol/li[4]/a")
	public WebElement everCool;
	
	@FindBy(xpath = "//div[@class='product details product-item-details']")
	public WebElement teesSBlackEverCoolItemDetail;
	
	@FindBy(xpath = "//div[@class='filter-current']/ol/li//span[@class='filter-value']")
	public List<WebElement> nowShoppingByList;
	
	@FindBy(xpath = "//div[@class='product-addto-links']/a[1]")
	public WebElement addToWishListButton;
	
	@FindBy(xpath = "//div[@role='alert']")
	public WebElement addToWishListtext;
	
	//Ngan
	@FindBy(xpath = "//*[@id=\"option-label-size-143-item-168\"]")
	public WebElement sizeM;

	@FindBy(xpath = "//*[@id=\"option-label-color-93-item-53\"]")
	public WebElement colorGreen;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[2]/div/div[2]/div[5]/div/a[2]/span")
	public WebElement addToCompareButton;
	
	@FindBy(xpath="//*[@id=\"maincontent\"]/div[1]/div[2]/div/div/div/a")
	public WebElement comparisonList;
	
	@FindBy(xpath ="//*[@id='maincontent']/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img")
	public WebElement montanaJacket;
		
	@FindBy(xpath = "//*[@id='maincontent']/div[3]/div[1]/div[3]/div[2]/ol/li[1]/div/a/span/span/img")
	 public WebElement heroHoodie;
	
	

}
