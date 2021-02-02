package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebPageClass.GarageEditProfilePage;

public class GarageEditProfilePageTest extends GarageLoginPageTest{
	GarageEditProfilePage objGarEditProPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarEditProPage=objHomePage.clickEditProfilePage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarEditProPage.getTitle();
		String expectedTitle = "Agent User Management";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualHeading = objGarEditProPage.getHeading();
		String expectedHeading = "Edit Profile";
		AssertJUnit.assertEquals("Title Incorrect", expectedHeading, actualHeading);
	}
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}

}
