package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebPageClass.GaragePartRequestPage;

public class GaragePartRequestPageTest extends GarageLoginPageTest{
	GaragePartRequestPage objGarPartReqPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarPartReqPage=objHomePage.clickPartRequestPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarPartReqPage.getTitle();
		String expectedTitle = "Part Request";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objGarPartReqPage.getTitle();
		String expectedTitle = "Part Request";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}
}
