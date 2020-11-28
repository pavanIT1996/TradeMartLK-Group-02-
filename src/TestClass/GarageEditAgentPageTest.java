package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.GarageEditAgentPage;

public class GarageEditAgentPageTest extends GarageLoginPageTest{
	GarageEditAgentPage objGarEditAgePage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarEditAgePage=objHomePage.clickEditAgentPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarEditAgePage.getTitle();
		String expectedTitle = "Edit garage information";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualHeading = objGarEditAgePage.getHeading();
		String expectedHeading = "Edit Agent Information";
		AssertJUnit.assertEquals("Title Incorrect", expectedHeading, actualHeading);
		driver.quit();
	}
}
