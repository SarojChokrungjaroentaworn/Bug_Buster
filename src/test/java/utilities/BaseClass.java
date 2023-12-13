package utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.AccountPage;
import pages.LogInPage;

public class BaseClass {
	private static WebDriver driver;

	// Driver method
	@BeforeClass(alwaysRun = true)
	public static WebDriver getDriver() {
		if (driver == null) {
			switch (getProperty("browser")) {
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "safari":
				if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
					throw new WebDriverException("Your OS doesn't support Safari");
				}
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
			case "edge":
				if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
					throw new WebDriverException("Your OS doesn't support Edge");
				}
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			}
			driver.get(getProperty("url"));
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			PageInitializer.initialize();
		}
		return driver;
	}

	LogInPage lp = new LogInPage();
	AccountPage ap = new AccountPage();

	@BeforeMethod(alwaysRun = true)
	public void login() {
		lp.email.sendKeys(getProperty("email"));
		lp.password.sendKeys(getProperty("password"));
		lp.signInButton.click();
	}

//	@AfterMethod(alwaysRun = true)
	public void logOut() {
		if (ap.customerMenu != null) {
			ap.customerMenu.click();
			CommonMethods.clickOnMenuBar(ap.customerMenuOptions, getProperty("CustomerMenuOptionSelected"));
		}
	}

	// driver tear down method
//	 @AfterClass(alwaysRun = true)
	public static void tearDown() {
		if (getDriver() != null) {
			getDriver().close();
			getDriver().quit();

		}

	}

	// PropertiesReader
	private static Properties properties;
	static {
		try {
			// path to the file locaiton
			String filePath = "src/test/resources/properties/UserDataFile.properties";
			// open connection to the file
			FileInputStream fis = new FileInputStream(filePath);
			properties = new Properties();
			properties.load(fis);
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return properties.getProperty(keyName);
	}

}
