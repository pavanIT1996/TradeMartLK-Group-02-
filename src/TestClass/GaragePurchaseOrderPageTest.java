package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.GaragePurchaseOrderPage;

public class GaragePurchaseOrderPageTest extends GarageLoginPageTest{
	GaragePurchaseOrderPage objGarPurOrdPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarPurOrdPage=objHomePage.clickPurchasePage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarPurOrdPage.getTitle();
		String expectedTitle = "Trade Mart |";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualHeading = objGarPurOrdPage.getHeading();
		String expectedHeading = "Garage Accepted Sparepart Requests";
		AssertJUnit.assertEquals("Title Incorrect", expectedHeading, actualHeading);
		driver.quit();
	}
}
