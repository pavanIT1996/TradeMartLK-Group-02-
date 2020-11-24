package TestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPageClass.SupplierLoginPage;

public class GarageLoginPageTest {
	
	String driverPath = "C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\LibraryFiles\\ChromeDriver\\chromedriverV86.exe";
	
	WebDriver driver;
	
	@BeforeTest
	public void setup() {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.trademartlk.com/operation/dashboard/garage-login-deshan");
	}
	
	
	@Test(priority=0)
	public void verifyvalidlogin() {
		SupplierLoginPage login= PageFactory.initElements(driver, SupplierLoginPage.class);
//		login.login("SQAG2", "123456");	
	}
	
//	@Test(priority=1)
//	public void verifyInvalidlogin() {
//		SupplierLoginPage login= PageFactory.initElements(driver, SupplierLoginPage.class);
//		login.login("SQAG2", "123456");	
//	}
}
