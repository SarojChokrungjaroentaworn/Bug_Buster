package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.BaseClass;

public class LogInPage {
	
	public LogInPage() {
		PageFactory.initElements(BaseClass.getDriver(), this);
	}
	
	@FindBy(xpath="//*[@id='email']")
	public WebElement email;
	
	@FindBy(xpath="//*[@name='login[password]']")
	public WebElement password;
	
	@FindBy(xpath="//*[@class='action login primary']")
	public WebElement signInButton;
	
	
}
