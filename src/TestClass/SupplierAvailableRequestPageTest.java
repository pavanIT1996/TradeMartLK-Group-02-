package TestClass;

import org.testng.annotations.AfterTest;
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
	DropDownUtilityClass DropDown = new DropDownUtilityClass();
	ExcelUtilityClass Excel = new ExcelUtilityClass();


	// call the main page test methods

	@Test(priority = 1, description = "Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage = objHomePage.clickmakebid();
	}

//	@Test(priority = 2, description="Verify Available Request Link")
//	public void verifyclickavailaberequest() {
//		objHomePage.clickAvilableRequestPage();
//	}
//	
	@Test(priority = 3, description = "Verify Available Request Page Title")
	public void verifyTitle() {
		String actualTitle = objAvialablePage.getTitle();
		String expectedTitle = "Trade Mart |";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}

	@Test(priority = 4, description = "Verify Available Request Page Heading")
	public void verifyHeading() {
		String actualTitle = objAvialablePage.getHeading();
		String expectedTitle = "Sparepart Requests";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}

//	@Test(priority=5)
//	public void verifyPrintButton() throws InterruptedException {
//		objAvialablePage.clickPrintButton();
//	}
	
//	@Test(priority=6)
//	public void verifyRefreshButton() {
//		objAvialablePage.clickRefreshButton();
//		
//	}

	// call the spare part dropdown test methods

	@Test(priority = 7, description = "Verify Spare Part Dropdown Label")
	public void verifySparePartLabel() {
		String actualLabel = objAvialablePage.getSparePartLabel();
		String expectedLabel = "Sparepart Type";
		Assert.assertEquals(actualLabel, expectedLabel);
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 8, description = "Verify Spare Part Default Dropdown Value")
	public void verifyDefaultSparePartDropdown() {
		var sparePartDropdown = objAvialablePage.getSparePartTypeDropdown();
		var selectedOption = DropDown.getSelectedOption(sparePartDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}

	@Test(priority = 9, description = "Verify Spare Part Dropdown Values count")
	public void verifyCountsSparePartDropdown() {
		var sparePartDropdown = objAvialablePage.getSparePartTypeDropdown();
		var selectedOptions = DropDown.getSelectOptions(sparePartDropdown);
		assertEquals(selectedOptions.size(), 16, "Incorrect Number Of Selections");
	}

	@Test(priority = 10, description = "Verify Spare Part Dropdown Values names")
	public void verifySparePartValues() {
		List<String> ExcelValue = new ArrayList<>();
		ExcelValue = Excel.readBooksFromExcelFile(0, Excel.getDropdownExcelPath());
		System.out.println("Excel Values: " + ExcelValue);
		var sparePartDropdown = objAvialablePage.getSparePartTypeDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(sparePartDropdown);
		System.out.println("Actual Values: " + selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue),
				"Values are not matching with the dropdown list");
	}

	@Test(priority = 11, description = "Verify select value from Spare Part Dropdown")
	public void verifySparePartSelect() throws InterruptedException {
		String expectedValue = "Door ";
		var sparePartDropdown = objAvialablePage.getSparePartTypeDropdown();
		DropDown.selectFromDropdown(expectedValue, sparePartDropdown);
		String actualvalue = DropDown.getSelectedOption(sparePartDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
	}
	
	@Test(priority = 12, description = "Verify table value changes according to the spare part Dropdown selection")
	public void verifySparePartWithTable(){
		String expectedValue = "Door ";
		assertTrue(objAvialablePage.CheckTableValuesChanges(expectedValue),"Table Not showing Matching Values");
	}
	
	@Test(priority = 13, description = "Verify showing table row counts according to the spare part Dropdown selection")
	public void verifySparePartRowCounts(){
		String defaultValue = "All";
		var sparePartDropdown = objAvialablePage.getSparePartTypeDropdown();
		var showEntriesDropdown = objAvialablePage.getShowEntriesDropdown();
		int value=Integer.parseInt(DropDown.getSelectedOption(showEntriesDropdown));
		assertTrue(objAvialablePage.RowCounts()<=value,"Count More than expected");
		DropDown.selectFromDropdown(defaultValue, sparePartDropdown);
	}
	

	// call the bidding status dropdown test methods

	@Test(priority = 14, description = "Verify Bidding Status Dropdown Label")
	public void verifyBiddingStatusLabel() {
		String actualLabel = objAvialablePage.getBiddingStatusLabel();
		String expectedLabel = "Bidding Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 15, description = "Verify Bidding Status Default Dropdown Value")
	public void verifyDefaultBiddingStatusDropdown() {
		var biddingStatusDropdown = objAvialablePage.getBiddingStatusDropdown();
		var selectedOption = DropDown.getSelectedOption(biddingStatusDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}

	@Test(priority = 16, description = "Verify Bidding Status Dropdown Values count")
	public void verifyCountsBiddingStatusDropdown() {
		var biddingStatusDropdown = objAvialablePage.getBiddingStatusDropdown();
		var selectedOptions = DropDown.getSelectOptions(biddingStatusDropdown);
		assertEquals(selectedOptions.size(), 4, "Incorrect Number Of Selections");
	}

	@Test(priority = 17, description = "Verify Bidding Status Dropdown Values names")
	public void verifyBiddingStatusValues() {
		List<String> ExcelValue = new ArrayList<>();
		ExcelValue = Excel.readBooksFromExcelFile(1, Excel.getDropdownExcelPath());
		System.out.println("Excel Values: " + ExcelValue);
		var biddingStatusDropdown = objAvialablePage.getBiddingStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(biddingStatusDropdown);
		System.out.println("Actual Values: " + selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue),
				"Values are not matching with the dropdown list");
	}

	@Test(priority = 18, description = "Verify select value from Bidding Status Dropdown")
	public void verifyBiddingStatusSelect() throws InterruptedException {
		String expectedValue = "PENDING";
		var biddingStatusDropdown = objAvialablePage.getBiddingStatusDropdown();
		DropDown.selectFromDropdown(expectedValue, biddingStatusDropdown);
		String actualvalue = DropDown.getSelectedOption(biddingStatusDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
	}
	
	@Test(priority = 19, description = "Verify table value changes according to the Bidding Status Dropdown selection")
	public void verifyBiddingStatusWithTable(){
		String expectedValue = "PENDING";
		assertTrue(objAvialablePage.CheckTableValuesChanges(expectedValue),"Table Not showing Matching Values");
	}
	
	@Test(priority = 20, description = "Verify showing table row counts according to the Bidding Status Dropdown selection")
	public void verifyBiddingStatusRowCounts(){
		String defaultValue = "All";
		var biddingStatusDropdown = objAvialablePage.getBiddingStatusDropdown();
		var showEntriesDropdown = objAvialablePage.getShowEntriesDropdown();
		int value=Integer.parseInt(DropDown.getSelectedOption(showEntriesDropdown));
		assertTrue(objAvialablePage.RowCounts()<=value,"Count More than expected");
		DropDown.selectFromDropdown(defaultValue, biddingStatusDropdown);
	}


	// call the winning status dropdown test methods

	@Test(priority = 21, description = "Verify Winning Status Dropdown Label")
	public void verifyWinningStatusLabel() {
		String actualLabel = objAvialablePage.getWinningStatusLabel();
		String expectedLabel = "Winning Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 22, description = "Verify Winning Status Default Dropdown Value")
	public void verifyDefaultWinningStatusDropdown() {
		var winningStatusDropdown = objAvialablePage.getWinningStatusDropdown();
		var selectedOption = DropDown.getSelectedOption(winningStatusDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}

	@Test(priority = 23, description = "Verify Winning Status Dropdown Values counts")
	public void verifyCountsWinningStatusDropdown() {
		var winningStatusDropdown = objAvialablePage.getWinningStatusDropdown();
		var selectedOptions = DropDown.getSelectOptions(winningStatusDropdown);
		assertEquals(selectedOptions.size(), 3, "Incorrect Number Of Selections");
	}

	@Test(priority = 24, description = "Verify Winning Status Dropdown Values names")
	public void verifyWinningStatusValues() {
		List<String> ExcelValue = new ArrayList<>();
		ExcelValue = Excel.readBooksFromExcelFile(2, Excel.getDropdownExcelPath());
		System.out.println("Excel Values: " + ExcelValue);
		var winningStatusDropdown = objAvialablePage.getWinningStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(winningStatusDropdown);
		System.out.println("Actual Values: " + selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue),
				"Values are not matching with the dropdown list");
	}

	@Test(priority = 25, description = "Verify select value from Winning Status Dropdown")
	public void verifyWinningStatusSelect() throws InterruptedException {
		String expectedValue = "LOST";
		var winningStatusDropdown = objAvialablePage.getWinningStatusDropdown();
		DropDown.selectFromDropdown(expectedValue, winningStatusDropdown);
		String actualvalue = DropDown.getSelectedOption(winningStatusDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);

	}
	
	@Test(priority = 26, description = "Verify table value changes according to the Winning Status Dropdown selection")
	public void verifyWinningStatusWithTable(){
		String expectedValue = "PENDING";
		assertTrue(objAvialablePage.CheckTableValuesChanges(expectedValue),"Table Not showing Matching Values");
	}
	
	@Test(priority = 27, description = "Verify showing table row counts according to the Winning Status Dropdown selection")
	public void verifyWinningStatusRowCounts(){
		String defaultValue = "All";
		var winningStatusDropdown = objAvialablePage.getWinningStatusDropdown();
		var showEntriesDropdown = objAvialablePage.getShowEntriesDropdown();
		int value=Integer.parseInt(DropDown.getSelectedOption(showEntriesDropdown));
		assertTrue(objAvialablePage.RowCounts()<=value,"Count More than expected");
		DropDown.selectFromDropdown(defaultValue, winningStatusDropdown);
	}

	// call the bidding date dropdown test methods

	@Test(priority = 28, description = "Verify Bidding Date Dropdown Label")
	public void verifyBiddingDateLabel() {
		String actualLabel = objAvialablePage.getBiddingDateLabel();
		String expectedLabel = "Bidding Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 29, description = "Verify Bidding Date Default Dropdown Value")
	public void verifyDefaultBiddingDateDropdown() {
		String expectedvalues = objAvialablePage.getCurrentDateAndTime();
		String biddingdateDropdown = objAvialablePage.getBiddingDateDropdown();
		assertEquals(biddingdateDropdown, expectedvalues, "Incorrect Default Value Selection");
	}

	// call the show entries dropdown test methods

	@Test(priority = 30, description = "Verify Show Entries Dropdown Label")
	public void verifyShowEntriesLabel() {
		String actualLabel = objAvialablePage.getShowEntriesLabel();
		String expectedLabel = "Show entries";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 31, description = "Verify Show Entries Default Dropdown Value")
	public void verifyDefaultShowEntriesDropdown() {
		var showentriesDropdown = objAvialablePage.getShowEntriesDropdown();
		var selectedOption = DropDown.getSelectedOption(showentriesDropdown);
		assertEquals(selectedOption.toString(), "10", "Incorrect Default Value Selection");
	}

	@Test(priority = 32, description = "Verify Show Entries Dropdown Values counts")
	public void verifyCountsShowEntriesDropdown() {
		var showentriesDropdown = objAvialablePage.getShowEntriesDropdown();
		var selectedOptions = DropDown.getSelectOptions(showentriesDropdown);
		assertEquals(selectedOptions.size(), 4, "Incorrect Number Of Selections");
	}

	@Test(priority = 33, description = "Verify Show Entries Dropdown Values names")
	public void verifyShowEntriesValues() {
		List<String> ExcelValue = new ArrayList<>();
		ExcelValue = Excel.readBooksFromExcelFile(3, Excel.getDropdownExcelPath());
		System.out.println("Excel Values: " + ExcelValue);
		var showEntriesDropdown = objAvialablePage.getShowEntriesDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(showEntriesDropdown);
		System.out.println("Actual Values: " + selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue),
				"Values are not matching with the dropdown list");
	}

	@Test(priority = 34, description = "Verify select value from Show Entries Dropdown")
	public void verifShowEntriesSelect() throws InterruptedException {
		String expectedValue = "50";
		var showEntriesDropdown = objAvialablePage.getShowEntriesDropdown();
		DropDown.selectFromDropdown(expectedValue, showEntriesDropdown);
		String actualvalue = DropDown.getSelectedOption(showEntriesDropdown);
		assertEquals(actualvalue.toString(), expectedValue, "Incorrect Value Selection");
		Thread.sleep(3000);
	}

	@Test(priority = 35, description = "Verify showing table row counts according to the Show Entries Dropdown selection")
	public void verifyShowEntriesRowCounts(){
		String defaultValue = "10";
		var showEntriesDropdown = objAvialablePage.getShowEntriesDropdown();
		int value=Integer.parseInt(DropDown.getSelectedOption(showEntriesDropdown));
		assertTrue(objAvialablePage.RowCounts()<=value,"Count More than expected");
		DropDown.selectFromDropdown(defaultValue, showEntriesDropdown);
	}
	
	// call the search input test methods

	@Test(priority = 36, description = "Verify Search Label")
	public void verifySearchLabel() {
		String actualLabel = objAvialablePage.getSearchLabel();
		String expectedLabel = "Search:";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 37, description = "Verify Search box deafult value")
	public void verifyDefaultSearch() {
		String actualValue = objAvialablePage.getSearchInput();
		String expectedValue = "";
		AssertJUnit.assertEquals("Input is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 38, description = "Verify Input in Search box")
	public void verifyInputSearch() throws InterruptedException {
		List<String> Values = new ArrayList<>();
		Values = objAvialablePage.searchValuesSet();
		String values = Arrays.toString(Values.toArray()).replace("[", "").replace("]", "");
		String Arr[] = values.split(", ");
		for (String Value : Arr) {
			objAvialablePage.insertSearch(Value);
			Thread.sleep(3000);
			assertTrue(objAvialablePage.CheckTableValuesChanges(Value),"Table Not showing Matching Values");
			objAvialablePage.cleansearch();
			Thread.sleep(3000);
		}
	}

	// call the table related test methods

	@Test(priority = 39, description = "Verify Top Column Date Label")
	public void verifyColumnDate() {
		objAvialablePage.AllTableRows();
		String actualValue = objAvialablePage.getColumnDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 40, description = "Verify table descending order by date")
	public void verifyColumnDateDescending(){
		objAvialablePage.Select100fromShowEntries();
		objAvialablePage.AllTableRows();
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(0,"descending");
		objAvialablePage.clickColumnDate();
		actualList=objAvialablePage.GetActualList(0);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in descending order to Date");
	}
	
	@Test(priority = 41, description = "Verify table ascending order by date")
	public void verifyColumnDateAscending() {
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(0,"ascending");
		objAvialablePage.clickColumnDate();
		actualList=objAvialablePage.GetActualList(0);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in ascending order to Date");
	}


	@Test(priority = 42, description = "Verify Top Column Code Label")
	public void verifyColumnCode() {
		String actualValue = objAvialablePage.getColumnCode();
		String expectedValue = "Code";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 43, description = "Verify table ascending order by Code")
	public void verifyColumnCodeAscending(){
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(1,"ascending");
		objAvialablePage.clickColumnCode();
		actualList=objAvialablePage.GetActualList(1);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in ascending order to Code");
	}
	
	@Test(priority = 44, description = "Verify table descending order by Code")
	public void verifyColumnCodeDescending(){
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(1,"descending");
		objAvialablePage.clickColumnCode();
		actualList=objAvialablePage.GetActualList(1);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in descending order to Code");
	}

	@Test(priority = 45, description = "Verify Top Column Bidding Starts Label")
	public void verifyColumnBiddingStarts() {
		String actualValue = objAvialablePage.getColumnBiddingStarts();
		String expectedValue = "Bidding Starts";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 46, description = "Verify table ascending order by BiddingStarts")
	public void verifyColumnBiddingStartsAscending(){
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(2,"ascending");
		objAvialablePage.clickColumnBiddingStarts();
		actualList=objAvialablePage.GetActualList(2);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in ascending order to BiddingStarts");
	}
	
	@Test(priority = 47, description = "Verify table descending order by BiddingStarts")
	public void verifyColumnBiddingStartsDescending() {
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(2,"descending");
		objAvialablePage.clickColumnBiddingStarts();
		actualList=objAvialablePage.GetActualList(2);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in descending order to BiddingStarts");
	}
	

	@Test(priority = 48, description = "Verify Top Column Bidding Ends Label")
	public void verifyColumnBiddingEnds() {
		String actualValue = objAvialablePage.getColumnBiddingEnds();
		String expectedValue = "Bidding Ends";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 49, description = "Verify table ascending order by BiddingEnds")
	public void verifyColumnBiddingEndsAscending(){
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(3,"ascending");
		objAvialablePage.clickColumnBiddingEnds();
		actualList=objAvialablePage.GetActualList(3);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in ascending order to BiddingEnds");
	}
	
	@Test(priority = 50, description = "Verify table descending order by BiddingStarts")
	public void verifyColumnBiddingEndsDescending() {
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(3,"descending");
		objAvialablePage.clickColumnBiddingEnds();
		actualList=objAvialablePage.GetActualList(3);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in descending order to BiddingEnds");
	}

	@Test(priority = 51, description = "Verify Top Column Spare Part Label")
	public void verifyColumnSparePart() {
		String actualValue = objAvialablePage.getColumnSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 52, description = "Verify table ascending order by SparePart")
	public void verifyColumnSparePartsAscending(){
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(4,"ascending");
		objAvialablePage.clickColumnSparePart();
		actualList=objAvialablePage.GetActualList(4);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in ascending order to SparePart");
	}
	
	@Test(priority = 53, description = "Verify table descending order by SparePart")
	public void verifyColumnSparePartDescending() {
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(4,"descending");
		objAvialablePage.clickColumnSparePart();
		actualList=objAvialablePage.GetActualList(4);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in descending order to SparePart");
	}

	@Test(priority = 54, description = "Verify Top Column Status Label")
	public void verifyColumnStatus() {
		String actualValue = objAvialablePage.getColumnStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 55, description = "Verify table ascending order by Status")
	public void verifyColumnStatusAscending(){
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(5,"ascending");
		objAvialablePage.clickColumnStatus();
		actualList=objAvialablePage.GetActualList(5);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in ascending order to Status");
	}
	
	@Test(priority = 56, description = "Verify table descending order by Status")
	public void verifyColumnStatusDescending() {
		List<String> expectedList = new ArrayList<>();
		List<String> actualList = new ArrayList<>();
		expectedList=objAvialablePage.GetExpectedList(5,"descending");
		objAvialablePage.clickColumnStatus();
		actualList=objAvialablePage.GetActualList(5);
		assertTrue(objAvialablePage.compareList(expectedList,actualList),"Not ordered table in descending order to Status");
	}

	@Test(priority = 57, description = "Verify Bottom Column Date Label")
	public void verifyColumnFDate() {
		String actualValue = objAvialablePage.getColumnFDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 58, description = "Verify Bottom Column Code Label")
	public void verifyColumnFCode() {
		String actualValue = objAvialablePage.getColumnFCode();
		String expectedValue = "Code";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 59, description = "Verify Bottom Column Bidding Starts Label")
	public void verifyColumnFBiddingStarts() {
		String actualValue = objAvialablePage.getColumnFBiddingStarts();
		String expectedValue = "Bidding Starts";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 60, description = "Verify Bottom Column Bidding Ends Label")
	public void verifyColumnFBiddingEnds() {
		String actualValue = objAvialablePage.getColumnFBiddingEnds();
		String expectedValue = "Bidding Ends";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 61, description = "Verify Bottom Column Spare Part Label")
	public void verifyColumnFSparePart() {
		String actualValue = objAvialablePage.getColumnFSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 62, description = "Verify Bottom Column Status Label")
	public void verifyColumnFStatus() {
		String actualValue = objAvialablePage.getColumnFStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	// call the showing label test methods

	@Test(priority = 63, description = "Verify Showing Label")
	public void verifyShowingLabel() {
		int total=objAvialablePage.RowCounts();
		String actualValue = objAvialablePage.getShowingLabel();
		String expectedValue = "Showing 1 to "+total+" of "+total+" entries";
		AssertJUnit.assertEquals("Label detail is Incorrect", expectedValue, actualValue);
	}

	// call the pagination related test methods

	@Test(priority = 64, description = "Verify showing pagination previous Label")
	public void verifyShowingPaginationPreviousLabel() {
		String actualValue = objAvialablePage.getPaginationPreviousLabel();
		String expectedValue = "Previous";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 65, description = "Verify showing pagination next Label")
	public void verifyShowingPaginationNextLabel() {
		String actualValue = objAvialablePage.getPaginationNextLabel();
		String expectedValue = "Next";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	

	@Test(priority = 66, description = "Verify click pagination Previous Label disabled")
	public void verifyHoverPaginationPrevious() throws InterruptedException {
		String actualValue=objAvialablePage.getHoverPaginationPreviousLabel();
		String expectedValue = "paginate_button previous disabled";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
		Thread.sleep(3000);
	}
	
	
	@Test(priority = 67, description = "Verify hover pagination next Label disabled")
	public void verifyHoverPaginationNext() throws InterruptedException {
		String actualValue=objAvialablePage.getHoverPaginationNextLabel();
		String expectedValue = "paginate_button next disabled";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
		Thread.sleep(3000);
	}

	@Test(priority = 68, description = "Verify click pagination next Label")
	public void verifyClickPaginationNextLabel() throws InterruptedException {
		objAvialablePage.Select25fromShowEntries();
		Thread.sleep(3000);
		objAvialablePage.clickPaginationNextLabel();
		Thread.sleep(3000);
	}
	
	@Test(priority = 69, description = "Verify click pagination previous Label")
	public void verifyClickPaginationPreviousLabel() throws InterruptedException {
		objAvialablePage.clickPaginationPreviousLabel();
		Thread.sleep(3000);
	}
	


	// call the tabs related test methods

	@Test(priority = 70, description = "Verify Request information Tab Label")
	public void verifyrequestInformationTabLabel() {
		String actualValue = objAvialablePage.getRequestInformationTab();
		String expectedValue = "Request Informations";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 71, description = "Verify My Bid Tab Label")
	public void verifymyBidTabLabel() {
		String actualValue = objAvialablePage.getMyBidTab();
		String expectedValue = "My Bid";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 72, description = "Verify Default active Tab")
	public void verifyDefaultactiveTab() {
		String actualValue = objAvialablePage.getActivetab();
		System.out.println(actualValue);
		String expectedValue = "Request Informations";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 73, description = "Verify My Bid Tab click")
	public void verifyclickMyBidTab() {
		objAvialablePage.clickMyBidTab();
		String actualValue = objAvialablePage.getActivetab();
		System.out.println(actualValue);
		String expectedValue = "My Bid";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 74, description = "Verify Request Information Tab click")
	public void verifyclickRequestInformationTab() {
		objAvialablePage.clickRequestInformationTab();
		String actualValue = objAvialablePage.getActivetab();
		System.out.println(actualValue);
		String expectedValue = "Request Informations";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}
	
}
