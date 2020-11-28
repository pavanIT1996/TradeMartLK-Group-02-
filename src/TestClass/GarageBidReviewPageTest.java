package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.GarageBidReviewPage;

public class GarageBidReviewPageTest extends GarageLoginPageTest{
	GarageBidReviewPage objGarBidReviPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarBidReviPage=objHomePage.clickBidReviewPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarBidReviPage.getTitle();
		String expectedTitle = "Trade Mart | Bid Review";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualHeading = objGarBidReviPage.getHeading();
		String expectedHeading = "Bid Review : Sparepart Requests";
		AssertJUnit.assertEquals("Heading Incorrect", expectedHeading, actualHeading);
		driver.quit();
	}
}

