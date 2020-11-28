package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.SupplierPurchaseOrderPage;


public class SupplierPurchaseOrderPageTest extends SupplierLoginPageTest{

	SupplierPurchaseOrderPage objSupPurcOrdPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objSupPurcOrdPage=objHomePage.clickPurchasePage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objSupPurcOrdPage.getTitle();
		String expectedTitle = "Trade Mart |";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}

	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objSupPurcOrdPage.getHeading();
		String expectedTitle = "Garage Accepted Sparepart Requests";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
}
