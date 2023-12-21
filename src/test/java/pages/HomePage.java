package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class HomePage {
	
	public HomePage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//ul[@class='header links']/li")
	public List<WebElement> header;

	@FindBy(xpath="//a[@class='logo']")
	public WebElement logo;
	
	@FindBy(xpath="//*[@id=\"ui-id-3\"]")
	public WebElement whatnew;
	
	@FindBy(xpath="//*[@id=\"ui-id-8\"]")
	public WebElement sale;
	

}
