package TestClass;

import org.testng.annotations.Test;

import UtilityClass.DropDownUtilityClass;
import UtilityClass.ExcelUtilityClass;

import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import WebPageClass.SupplierAvailableRequestPage;


public class SupplierAvailableRequestPageTest extends SupplierLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;
	DropDownUtilityClass DropDown=new DropDownUtilityClass();
	ExcelUtilityClass Excel=new ExcelUtilityClass();
	
	// call the main page test methods
	
	@Test(priority = 1, description="Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
	}
	
//	@Test(priority = 2, description="Verify Available Request Link")
//	public void verifyclickavailaberequest() {
//		objHomePage.clickAvilableRequestPage();
//	}
//	
	@Test(priority = 3, description="Verify Available Request Page Title")
	public void verifyTitle() {
		String actualTitle = objAvialablePage.getTitle();
		String expectedTitle = "Trade Mart |";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4, description="Verify Available Request Page Heading")
	public void verifyHeading() {
		String actualTitle = objAvialablePage.getHeading();
		String expectedTitle = "Sparepart Requests";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}

//	@Test(priority=3)
//	public void verifyPrintButton() {
//		objAvialablePage.clickPrintButton();
//	}
//	
//	@Test(priority=4)
//	public void verifyRefreshButton() {
//		objAvialablePage.clickRefreshButton();
//		//driver.quit();
//	}

	
	// call the spare part dropdown test methods
	
	@Test(priority = 5 , description="Verify Spare Part Dropdown Label")
	public void verifySparePartLabel() {
		String actualLabel = objAvialablePage.getSparePartLabel();
		String expectedLabel = "Sparepart Type";
		Assert.assertEquals(actualLabel, expectedLabel);
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 6, description="Verify Spare Part Default Dropdown Value")
	public void verifyDefaultSparePartDropdown() {
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		var selectedOption = DropDown.getSelectedOption(sparePartDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 7, description="Verify Spare Part Dropdown Values count")
	public void verifyCountsSparePartDropdown() {
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		var selectedOptions = DropDown.getSelectOptions(sparePartDropdown);
		assertEquals(selectedOptions.size(), 16, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 8, description="Verify Spare Part Dropdown Values names")
	public void verifySparePartValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(0,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(sparePartDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 9, description="Verify select value from Spare Part Dropdown")
	public void verifySparePartSelect() throws InterruptedException {
		String expectedValue= "Door ";
		String defaultValue= "All";
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		DropDown.selectFromDropdown(expectedValue, sparePartDropdown);
		String actualvalue=DropDown.getSelectedOption(sparePartDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
		DropDown.selectFromDropdown(defaultValue, sparePartDropdown);
		Thread.sleep(3000);
	}
	 
	
	// call the bidding status dropdown test methods
	
	@Test(priority = 9, description="Verify Bidding Status Dropdown Label")
	public void verifyBiddingStatusLabel() {
		String actualLabel = objAvialablePage.getBiddingStatusLabel();
		String expectedLabel = "Bidding Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 10, description="Verify Bidding Status Default Dropdown Value")
	public void verifyDefaultBiddingStatusDropdown() {
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		var selectedOption = DropDown.getSelectedOption(biddingStatusDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 11, description="Verify Bidding Status Dropdown Values count")
	public void verifyCountsBiddingStatusDropdown() {
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		var selectedOptions = DropDown.getSelectOptions(biddingStatusDropdown);
		assertEquals(selectedOptions.size(), 4, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 12, description="Verify Bidding Status Dropdown Values names")
	public void verifyBiddingStatusValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(1,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(biddingStatusDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 13, description="Verify select value from Bidding Status Dropdown")
	public void verifyBiddingStatusSelect() throws InterruptedException {
		String expectedValue= "PENDING";
		String defaultValue= "All";
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		DropDown.selectFromDropdown(expectedValue, biddingStatusDropdown);
		String actualvalue=DropDown.getSelectedOption(biddingStatusDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
		DropDown.selectFromDropdown(defaultValue, biddingStatusDropdown);
		Thread.sleep(3000);
	}
	 
	
	// call the winning status dropdown test methods
	
	@Test(priority = 13, description="Verify Winning Status Dropdown Label")
	public void verifyWinningStatusLabel() {
		String actualLabel = objAvialablePage.getWinningStatusLabel();
		String expectedLabel = "Winning Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 14, description="Verify Winning Status Default Dropdown Value")
	public void verifyDefaultWinningStatusDropdown() {
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		var selectedOption = DropDown.getSelectedOption(winningStatusDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 15, description="Verify Winning Status Dropdown Values counts")
	public void verifyCountsWinningStatusDropdown() {
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		var selectedOptions = DropDown.getSelectOptions(winningStatusDropdown);
		assertEquals(selectedOptions.size(), 3, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 16, description="Verify Winning Status Dropdown Values names")
	public void verifyWinningStatusValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(2,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(winningStatusDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 17, description="Verify select value from Winning Status Dropdown")
	public void verifyWinningStatusSelect() throws InterruptedException {
		String expectedValue= "LOST";
		String defaultValue= "All";
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		DropDown.selectFromDropdown(expectedValue, winningStatusDropdown);
		String actualvalue=DropDown.getSelectedOption(winningStatusDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
		DropDown.selectFromDropdown(defaultValue, winningStatusDropdown);
		Thread.sleep(3000);
	}
	 
	
	// call the bidding date dropdown test methods
	
	@Test(priority = 17, description="Verify Bidding Date Dropdown Label")
	public void verifyBiddingDateLabel() {
		String actualLabel = objAvialablePage.getBiddingDateLabel();
		String expectedLabel = "Bidding Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 18, description="Verify Bidding Date Default Dropdown Value")
	public void verifyDefaultBiddingDateDropdown() {
		String expectedvalues=objAvialablePage.getCurrentDateAndTime();
		String biddingdateDropdown=objAvialablePage.getBiddingDateDropdown();
		assertEquals(biddingdateDropdown, expectedvalues, "Incorrect Default Value Selection");
	}
	
	
	// call the show entries dropdown test methods
	
	@Test(priority = 19, description="Verify Show Entries Dropdown Label")
	public void verifyShowEntriesLabel() {
		String actualLabel = objAvialablePage.getShowEntriesLabel();
		String expectedLabel = "Show entries";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 20, description="Verify Show Entries Default Dropdown Value")
	public void verifyDefaultShowEntriesDropdown() {
		var showentriesDropdown=objAvialablePage.getShowEntriesDropdown();
		var selectedOption = DropDown.getSelectedOption(showentriesDropdown);
		assertEquals(selectedOption.toString(), "10", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 21, description="Verify Show Entries Dropdown Values counts")
	public void verifyCountsShowEntriesDropdown() {
		var showentriesDropdown=objAvialablePage.getShowEntriesDropdown();
		var selectedOptions = DropDown.getSelectOptions(showentriesDropdown);
		assertEquals(selectedOptions.size(), 4, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 22, description="Verify Show Entries Dropdown Values names")
	public void verifyShowEntriesValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(3,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var showEntriesDropdown=objAvialablePage.getShowEntriesDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(showEntriesDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 23, description="Verify select value from Show Entries Dropdown")
	public void verifShowEntriesSelect() throws InterruptedException {
		String expectedValue= "50";
		String defaultValue= "10";
		var showEntriesDropdown=objAvialablePage.getShowEntriesDropdown();
		DropDown.selectFromDropdown(expectedValue, showEntriesDropdown);
		String actualvalue=DropDown.getSelectedOption(showEntriesDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
		DropDown.selectFromDropdown(defaultValue, showEntriesDropdown);
		Thread.sleep(3000);
	}
	
	// call the search input test methods
	
	@Test(priority = 23, description="Verify Search Label")
	public void verifySearchLabel() {
		String actualLabel = objAvialablePage.getSearchLabel();
		String expectedLabel = "Search:";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 24, description="Verify Search box deafult value")
	public void verifyDefaultSearch() {
		String actualValue = objAvialablePage.getSearchInput();
		String expectedValue = "";
		AssertJUnit.assertEquals("Input is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 25, description="Verify Input in Search box")
	public void verifyInputSearch() throws InterruptedException {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(0,Excel.getInputExcelPath());
		String values = Arrays.toString(ExcelValue.toArray()).replace("[", "").replace("]", "");
		String Arr[]=values.split(", ");
		for (String Value : Arr) {
			objAvialablePage.insertSearch(Value);
			Thread.sleep(3000);
			objAvialablePage.cleansearch();
			Thread.sleep(3000);
		}
	}
	
	
	// call the table related test methods
	
	@Test(priority = 25, description="Verify Top Column Date Label")
	public void verifyColumnDate() {
		String actualValue = objAvialablePage.getColumnDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 26, description="Verify Top Column Code Label")
	public void verifyColumnCode() {
		String actualValue = objAvialablePage.getColumnCode();
		String expectedValue = "Code";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 27, description="Verify Top Column Bidding Starts Label")
	public void verifyColumnBiddingStarts() {
		String actualValue = objAvialablePage.getColumnBiddingStarts();
		String expectedValue = "Bidding Starts";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 28, description="Verify Top Column Bidding Ends Label")
	public void verifyColumnBiddingEnds() {
		String actualValue = objAvialablePage.getColumnBiddingEnds();
		String expectedValue = "Bidding Ends";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 29, description="Verify Top Column Spare Part Label")
	public void verifyColumnSparePart() {
		String actualValue = objAvialablePage.getColumnSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 30, description="Verify Top Column Status Label")
	public void verifyColumnStatus() {
		String actualValue = objAvialablePage.getColumnStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	


	@Test(priority = 31, description="Verify Bottom Column Date Label")
	public void verifyColumnFDate() {
		String actualValue = objAvialablePage.getColumnFDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 32, description="Verify Bottom Column Code Label")
	public void verifyColumnFCode() {
		String actualValue = objAvialablePage.getColumnFCode();
		String expectedValue = "Code";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 33, description="Verify Bottom Column Bidding Starts Label")
	public void verifyColumnFBiddingStarts() {
		String actualValue = objAvialablePage.getColumnFBiddingStarts();
		String expectedValue = "Bidding Starts";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 34, description="Verify Bottom Column Bidding Ends Label")
	public void verifyColumnFBiddingEnds() {
		String actualValue = objAvialablePage.getColumnFBiddingEnds();
		String expectedValue = "Bidding Ends";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 35, description="Verify Bottom Column Spare Part Label")
	public void verifyColumnFSparePart() {
		String actualValue = objAvialablePage.getColumnFSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 36, description="Verify Bottom Column Status Label")
	public void verifyColumnFStatus() {
		String actualValue = objAvialablePage.getColumnFStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	
	// call the showing label test methods
	
	@Test(priority = 37, description="Verify Showing Label")
	public void verifyShowingLabel() {
		String actualValue = objAvialablePage.getShowingLabel();
		String expectedValue = "Showing 1 to 10 of 67 entries";
		AssertJUnit.assertEquals("Label detail is Incorrect", expectedValue, actualValue);
	}

	// call the pagination related test methods
	
	@Test(priority = 38, description="Verify showing pagination previous Label")
	public void verifyShowingPaginationPreviousLabel() {
		String actualValue = objAvialablePage.getPaginationPreviousLabel();
		String expectedValue = "Previous";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 39, description="Verify showing pagination First Label")
	public void verifyShowingPaginationFirstLabel() {
		String actualValue = objAvialablePage.getPaginationFirstLabel();
		String expectedValue = "1";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 40, description="Verify showing pagination Second Label")
	public void verifyShowingPaginationSecondLabel() {
		String actualValue = objAvialablePage.getPaginationSecondLabel();
		String expectedValue = "2";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 41, description="Verify showing pagination Third Label")
	public void verifyShowingPaginationThirdLabel() {
		String actualValue = objAvialablePage.getPaginationThirdLabel();
		String expectedValue = "3";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 42, description="Verify showing pagination next Label")
	public void verifyShowingPaginationNextLabel() {
		String actualValue = objAvialablePage.getPaginationNextLabel();
		String expectedValue = "Next";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
//	@Test(priority = 26)
//	public void verifyHoverPaginationPrevious() {
//		String actualValue = objAvialablePage.getHoverPaginationPreviousLabel();
//		String expectedValue = "Next";
//		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
//	}
	
	
	
	// call the tabs related test methods
	
	@Test(priority = 43, description="Verify Request information Tab Label")
	public void verifyrequestInformationTabLabel() {
		String actualValue = objAvialablePage.getRequestInformationTab();
		String expectedValue = "Request Informations";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 44, description="Verify My Bid Tab Label")
	public void verifymyBidTabLabel() {
		String actualValue = objAvialablePage.getMyBidTab();
		String expectedValue = "My Bid";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 45, description="Verify Default active Tab")
	public void verifyDefaultactiveTab() {
		String actualValue = objAvialablePage.getActivetab();
		System.out.println(actualValue);
		String expectedValue = "Request Informations";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 46, description="Verify My Bid Tab click")
	public void verifyclickMyBidTab() {
		objAvialablePage.clickMyBidTab();
		String actualValue = objAvialablePage.getActivetab();
		System.out.println(actualValue);
		String expectedValue = "My Bid";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 47, description="Verify Request Information Tab click")
	public void verifyclickRequestInformationTab() {
		objAvialablePage.clickRequestInformationTab();
		String actualValue = objAvialablePage.getActivetab();
		System.out.println(actualValue);
		String expectedValue = "Request Informations";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
}

