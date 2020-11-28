package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.SupplierEditProfilePage;

public class SupplierEditProfilePageTest extends SupplierLoginPageTest{

	SupplierEditProfilePage objSupEditProPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objSupEditProPage=objHomePage.clickEditProfilePage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objSupEditProPage.getTitle();
		String expectedTitle = "Agent User Management";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objSupEditProPage.getHeading();
		String expectedTitle = "Edit Profile";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}

}
