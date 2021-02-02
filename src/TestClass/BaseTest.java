package TestClass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import WebPageClass.GarageLoginPage;
import WebPageClass.SupplierLoginPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {

	protected WebDriver driver;
	private Capabilities caps;

	private String path = "C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\LibraryFiles\\ChromeDriver\\chromedriverV87.exe";
	private String path2 = "C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\LibraryFiles\\GeckoDriver\\geckodriverV27.exe";

	SupplierLoginPage objSupLogin;
	GarageLoginPage objGarLogin;

//	@BeforeClass()
//	public void setup() {
//		ChromeBrowser();
//		ManagerBrowser();
//	}

	@BeforeClass
	@Parameters("browser")
	public void setup(String browser) throws Exception {
		// Check if parameter passed from TestNG is 'firefox'
		if (browser.equalsIgnoreCase("firefox")) {
			// create firefox instance
			System.setProperty("webdriver.gecko.driver", path2);
			driver = new FirefoxDriver();
		}
		// Check if parameter passed as 'chrome'
		else if (browser.equalsIgnoreCase("chrome")) {
			// set path to chromedriver.exe
			System.setProperty("webdriver.chrome.driver", path);
			// create chrome instance
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
	     else {
			// If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

//	public void ManagerBrowser() {
//		driver.manage().window().maximize();
//	}
//
//	public void ChromeBrowser() {
//		System.setProperty("webdriver.chrome.driver", path);
//		driver = new ChromeDriver();
//	}

	public SupplierLoginPage goSupLoginPage() {
		System.out.println(driver.toString() + " 01");
		driver.get("https://www.trademartlk.com/operation/dashboard/supplier-login-sqag2");
		System.out.println(driver.toString() + " 02");
		return new SupplierLoginPage(driver);
	}

	public GarageLoginPage goGarLoginPage() {
		System.out.println(driver.toString() + " 01");
		driver.get("https://www.trademartlk.com/operation/dashboard/garage-login-deshan");
		System.out.println(driver.toString() + " 02");
		return new GarageLoginPage(driver);
	}
}
