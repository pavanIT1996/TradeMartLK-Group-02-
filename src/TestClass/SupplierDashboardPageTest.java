package TestClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import WebPageClass.SupplierAvailableRequestPage;
import WebPageClass.SupplierDashboardPage;
import WebPageClass.SupplierLoginPage;

public class SupplierDashboardPageTest extends SupplierLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;

	@Test(priority = 1)
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
//		driver.quit();
	}

	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objHomePage.clickEditProfilePage();
//		driver.quit();
	}
	
	@Test(priority = 3)
	public void verifyclickeditagent() {
		objHomePage.clickEditAgentPage();
//		driver.quit();
	}
	
	@Test(priority = 4)
	public void verifyclickusermanagement() {
		objHomePage.clickUserManagementPage();
//		driver.quit();
	}
	
	@Test(priority = 5)
	public void verifyclickavailaberequest() {
		objHomePage.clickAvilableRequestPage();
//		driver.quit();
	}
	
	@Test(priority = 6)
	public void verifyclicknotification() {
		objHomePage.clickNotificationPage();
//		driver.quit();
	}
	
	@Test(priority = 7)
	public void verifyclickpurchase() {
		objHomePage.clickPurchasePage();
		driver.quit();
	}
}
