package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class SearchPage {
	
	public SearchPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
		
	}
	
	@FindBy(xpath = "//input[@id='search']")
	public WebElement searchTextBox;
	
	}
	
	

