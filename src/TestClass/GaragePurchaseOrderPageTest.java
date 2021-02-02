package TestClass;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
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
		String expectedTitle = "Trade Mart | Purchase Order";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualHeading = objGarPurOrdPage.getHeading();
		String expectedHeading = "Garage Accepted Sparepart Requests";
		AssertJUnit.assertEquals("Title Incorrect", expectedHeading, actualHeading);
	}
	
	@Test(priority = 5, description = "Verify Spare Part Dropdown Label")
	public void verifySparePartLabel() {
		String actualLabel = objGarPurOrdPage.getSparePartLabel();
		String expectedLabel = "Sparepart Type";
		Assert.assertEquals(actualLabel, expectedLabel);
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 6, description = "Verify Bidding Status Dropdown Label")
	public void verifyBiddingStatusLabel() {
		String actualLabel = objGarPurOrdPage.getBiddingStatusLabel();
		String expectedLabel = "Bidding Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 7, description = "Verify Winning Status Dropdown Label")
	public void verifyWinningStatusLabel() {
		String actualLabel = objGarPurOrdPage.getWinningStatusLabel();
		String expectedLabel = "Winning Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 8, description = "Verify Bidding Date Dropdown Label")
	public void verifyBiddingDateLabel() {
		String actualLabel = objGarPurOrdPage.getBiddingDateLabel();
		String expectedLabel = "Bidding Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 9, description = "Verify Show Entries Dropdown Label")
	public void verifyShowEntriesLabel() {
		String actualLabel = objGarPurOrdPage.getShowEntriesLabel();
		String expectedLabel = "Show entries";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 10, description = "Verify Top Column Date Label")
	public void verifyColumnDate() {
		String actualValue = objGarPurOrdPage.getColumnDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 11, description = "Verify Top Column RequestID Label")
	public void verifyColumnRequestID() {
		String actualValue = objGarPurOrdPage.getColumnRequestId();
		String expectedValue = "Request ID";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 12, description = "Verify Top Column Bid ID Label")
	public void verifyColumnBidID() {
		String actualValue = objGarPurOrdPage.getColumnBidId();
		String expectedValue = "Bid ID";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 13, description = "Verify Top Column Spare Part Label")
	public void verifyColumnSparePart() {
		String actualValue = objGarPurOrdPage.getColumnSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 13, description = "Verify Top Column Status Label")
	public void verifyColumnStatus() {
		String actualValue = objGarPurOrdPage.getColumnStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 14, description = "Verify Showing Label")
	public void verifyShowingLabel() {
		int total=objGarPurOrdPage.RowCounts();
		String actualValue = objGarPurOrdPage.getShowingLabel();
		String expectedValue = "Showing "+total+" to "+total+" of "+total+" entries";
		AssertJUnit.assertEquals("Label detail is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 15, description = "Verify Purchase heading")
	public void verifyPurchaseHeading() {
		String actualTitle = objGarPurOrdPage.getPurchaseHeading();
		String expectedTitle = "Purchase Requests / Purchase Order";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
	}
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}
}
