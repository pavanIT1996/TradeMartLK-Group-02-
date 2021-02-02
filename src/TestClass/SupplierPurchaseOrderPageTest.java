package TestClass;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
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
		String expectedTitle = "Trade Mart | Purchase Order";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}

	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objSupPurcOrdPage.getHeading();
		String expectedTitle = "Garage Accepted Sparepart Requests";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 5, description = "Verify Spare Part Dropdown Label")
	public void verifySparePartLabel() {
		String actualLabel = objSupPurcOrdPage.getSparePartLabel();
		String expectedLabel = "Sparepart Type";
		Assert.assertEquals(actualLabel, expectedLabel);
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 6, description = "Verify Bidding Status Dropdown Label")
	public void verifyBiddingStatusLabel() {
		String actualLabel = objSupPurcOrdPage.getBiddingStatusLabel();
		String expectedLabel = "Bidding Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 7, description = "Verify Winning Status Dropdown Label")
	public void verifyWinningStatusLabel() {
		String actualLabel = objSupPurcOrdPage.getWinningStatusLabel();
		String expectedLabel = "Winning Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 8, description = "Verify Bidding Date Dropdown Label")
	public void verifyBiddingDateLabel() {
		String actualLabel = objSupPurcOrdPage.getBiddingDateLabel();
		String expectedLabel = "Bidding Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 9, description = "Verify Show Entries Dropdown Label")
	public void verifyShowEntriesLabel() {
		String actualLabel = objSupPurcOrdPage.getShowEntriesLabel();
		String expectedLabel = "Show entries";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 10, description = "Verify Top Column Date Label")
	public void verifyColumnDate() {
		String actualValue = objSupPurcOrdPage.getColumnDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 11, description = "Verify Top Column RequestID Label")
	public void verifyColumnRequestID() {
		String actualValue = objSupPurcOrdPage.getColumnRequestId();
		String expectedValue = "Request ID";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 12, description = "Verify Top Column Bid ID Label")
	public void verifyColumnBidID() {
		String actualValue = objSupPurcOrdPage.getColumnBidId();
		String expectedValue = "Bid ID";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 13, description = "Verify Top Column Spare Part Label")
	public void verifyColumnSparePart() {
		String actualValue = objSupPurcOrdPage.getColumnSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 13, description = "Verify Top Column Status Label")
	public void verifyColumnStatus() {
		String actualValue = objSupPurcOrdPage.getColumnStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 14, description = "Verify Showing Label")
	public void verifyShowingLabel() {
		int total=objSupPurcOrdPage.RowCounts();
		String actualValue = objSupPurcOrdPage.getShowingLabel();
		String expectedValue = "Showing 1 to "+total+" of "+total+" entries";
		AssertJUnit.assertEquals("Label detail is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 15, description = "Verify Purchase heading")
	public void verifyPurchaseHeading() {
		String actualTitle = objSupPurcOrdPage.getPurchaseHeading();
		String expectedTitle = "Purchase Requests / Purchase Order";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 16, description = "Verify Accept Button Label")
	public void verifyAcceptButtonLabel() {
		String actualTitle = objSupPurcOrdPage.getAcceptButton();
		String expectedTitle = "Accept Request";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 17, description = "Verify Accept Button Label")
	public void verifyRejectButtonLabel() {
		String actualTitle = objSupPurcOrdPage.getRejectButton();
		String expectedTitle = "Reject Request";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
	}
	
	
	@Test(priority = 18, description = "Verify Accept Button color")
	public void verifyAcceptButtonColor(){
		String color=objSupPurcOrdPage.getAcceptButtonColor();
		System.out.println("Accept color : "+color);
		String actualLabel=objSupPurcOrdPage.convertToHex(color);
		String expectedLabel = "#26b99a";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 19, description = "Verify Reject Button color")
	public void verifyRejectButtonColor(){
		String color=objSupPurcOrdPage.getRejectButtonColor();
		System.out.println("Accept color : "+color);
		String actualLabel=objSupPurcOrdPage.convertToHex(color);
		String expectedLabel = "#d9534f";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@AfterTest
	public void driverquit() {
		driver.quit();
	}
}
