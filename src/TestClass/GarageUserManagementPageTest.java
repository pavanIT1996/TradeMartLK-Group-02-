package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.GarageUserManagementPage;

public class GarageUserManagementPageTest extends GarageLoginPageTest{
	GarageUserManagementPage objGarUserMngPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarUserMngPage=objHomePage.clickUserManagementPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarUserMngPage.getTitle();
		String expectedTitle = "Agent User Management";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objGarUserMngPage.getHeading();
		String expectedTitle = "Agent User Management";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
}
