package TestClass;


import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import WebPageClass.SupplierAvailableRequestPage;


public class SupplierDashboardPageTest extends SupplierLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;

	
	@Test(priority = 1, description="Verify Available Request Page Title")
	public void verifyTitle() {
		String actualTitle = objHomePage.getTitle();
		String expectedTitle = "SQA Supplier G2";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 2, description="Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
	}

	@Test(priority = 3, description="Verify click edit profile link")
	public void verifyclickeditprofile() {
		objHomePage.clickEditProfilePage();
	}
	
	@Test(priority = 4, description="Verify click edit agent link")
	public void verifyclickeditagent() {
		objHomePage.clickEditAgentPage();
	}
	
	@Test(priority = 5, description="Verify click user management link")
	public void verifyclickusermanagement() {
		objHomePage.clickUserManagementPage();
	}
	
	@Test(priority = 6, description="Verify click available request link")
	public void verifyclickavailaberequest() {
		objHomePage.clickAvilableRequestPage();
	}
	
	@Test(priority = 7, description="Verify click notification link")
	public void verifyclicknotification() {
		objHomePage.clickNotificationPage();
	}
	
	@Test(priority = 8, description="Verify click purchase link")
	public void verifyclickpurchase() {
		objHomePage.clickPurchasePage();
	}
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}
}
