package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.SupplierUserManagementPage;

public class SupplierUserManagementPageTest extends SupplierLoginPageTest{
	
	SupplierUserManagementPage objSupUseMngPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objSupUseMngPage=objHomePage.clickUserManagementPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objSupUseMngPage.getTitle();
		String expectedTitle = "Agent User Management";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objSupUseMngPage.getHeading();
		String expectedTitle = "Agent User Management";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
}
