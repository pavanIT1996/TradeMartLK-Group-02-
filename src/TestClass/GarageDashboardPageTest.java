package TestClass;

import org.testng.annotations.Test;

import WebPageClass.SupplierAvailableRequestPage;

public class GarageDashboardPageTest extends GarageLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;

	@Test(priority = 1)
	public void verifyclickpartrequestbutton() {
		objAvialablePage = objHomePage.clickpartrequest();
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
	public void verifyclickpartrequest() {
		objHomePage.clickPartRequestPage();
//		driver.quit();
	}

	@Test(priority = 6)
	public void verifyclicknotification() {
		objHomePage.clickNotificationPage();
//		driver.quit();
	}

	@Test(priority = 7)
	public void verifyclickbidreview() {
		objHomePage.clickBidReviewPage();
//		driver.quit();
	}

	@Test(priority = 8)
	public void verifyclickpurchase() {
		objHomePage.clickPurchasePage();
		driver.quit();
	}

}
