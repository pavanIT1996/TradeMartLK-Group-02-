package TestClass;

import static org.testng.Assert.assertEquals;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.BiddingDateDropdown;
import WebPageClass.SupplierAvailableRequestPage;

public class BiddingDateDropdownTest extends SupplierLoginPageTest{
	
	SupplierAvailableRequestPage objAvialablePage;
	BiddingDateDropdown objBiddingDateDropdown;
	
	
	// call the main page test methods

	@Test(priority = 1, description = "Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage = objHomePage.clickmakebid();
	}
		
	@Test(priority = 2, description = "Verify Today Button Label")
	public void verifyTodayButtonLabel() {
		objBiddingDateDropdown=objAvialablePage.clickBiddingDateDropdown();
		String actualLabel=objBiddingDateDropdown.getBiddingDateToday();
		String expectedLabel = "Today";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	
	@Test(priority = 3, description = "Verify Tommorrow Button Label")
	public void verifyTomorrowButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateTomorrow();
		String expectedLabel = "Tomorrow";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 4, description = "Verify Next 7 Day Button Label")
	public void verifyNext7ButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateNext7();
		String expectedLabel = "Next 7 Days";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 5, description = "Verify Next 30 Day Button Label")
	public void verifyNext30ButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateNext30();
		String expectedLabel = "Next 30 Days";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	
	@Test(priority = 6, description = "Verify This Month Button Label")
	public void verifythisMonthButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateThisMonth();
		String expectedLabel = "This Month";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 7, description = "Verify Last Month Button Label")
	public void verifylastMonthButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateLastMonth();
		String expectedLabel = "Last Month";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 8, description = "Verify Last 7 Day Button Label")
	public void verifyLast7ButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateLast7();
		String expectedLabel = "Last 7 Days";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 9, description = "Verify Yesterday Button Label")
	public void verifyYesterdayButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateYesterday();
		String expectedLabel = "Yesterday";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 10, description = "Verify Custom Button Label")
	public void verifyCustomButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateCustom();
		String expectedLabel = "Custom";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 11, description = "Verify Submit Button Label")
	public void verifySubmitButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateSubmitButton();
		String expectedLabel = "Submit";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 12, description = "Verify Cancel Button Label")
	public void verifyCancelButtonLabel() {
		String actualLabel=objBiddingDateDropdown.getBiddingDateCancelButton();
		String expectedLabel = "Clear";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 13, description = "Verify Today Button Hover color")
	public void verifyTodayButtonHoverColor() throws InterruptedException {
		String hovercolor=objBiddingDateDropdown.hoverBiddingDateToday();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.convertToHex(hovercolor);
		String expectedLabel = "#536a7f";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 14, description = "Verify Today Button click")
	public void verifyTodayButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateToday();
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		Thread.sleep(3000);
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("today");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 15, description = "Verify Tomorrow Button click")
	public void verifyTomorrowButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateTomorrow();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("tomorrow");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 16, description = "Verify Next 7 Days Button click")
	public void verifyNext7ButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateNext7();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("next7");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 17, description = "Verify Next 30 Days Button click")
	public void verifyNext30ButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateNext30();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("next30");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 18, description = "Verify This Month Button click")
	public void verifyThisMonthButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateThisMonth();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("thismonth");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 19, description = "Verify Last Month Button click")
	public void verifyLastMonthButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateLastMonth();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("lastmonth");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	
	@Test(priority = 20, description = "Verify Last 7 Days Button click")
	public void verifyLast7ButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateLast7();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("last7");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	
	@Test(priority = 21, description = "Verify Yesterday Button click")
	public void verifyYesterdayButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateYesterday();
		Thread.sleep(3000);
		String actualLabel=objBiddingDateDropdown.getBiddingDateDropdown();
		String expectedLabel = objBiddingDateDropdown.getCurrentDateAndTime("yesterday");
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	
	@Test(priority = 22, description = "Verify submit Button click")
	public void verifySubmitButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateSubmitButton();
		Thread.sleep(3000);
	}
	
	@Test(priority = 23, description = "Verify cancel Button click")
	public void verifyCancelButtonClick() throws InterruptedException {
		objBiddingDateDropdown.clickBiddingDateDropdown();
		Thread.sleep(3000);
		objBiddingDateDropdown.clickBiddingDateCancelButton();
		Thread.sleep(3000);
	}
}
