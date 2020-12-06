package TestClass;

import org.testng.annotations.Test;

import UtilityClass.DropDownUtilityClass;
import UtilityClass.ExcelUtilityClass;

import org.apache.poi.ss.usermodel.Cell;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import WebPageClass.SupplierAvailableRequestPage;
import WebPageClass.SupplierDashboardPage;

public class SupplierAvailableRequestPageTest extends SupplierLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;
	DropDownUtilityClass DropDown=new DropDownUtilityClass();
	ExcelUtilityClass Excel=new ExcelUtilityClass();
	
	@Test(priority = 1)
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
	}
	
	@Test(priority = 2)
	public void verifyclickavailaberequest() {
		objHomePage.clickAvilableRequestPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objAvialablePage.getTitle();
		String expectedTitle = "Trade Mart |";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
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

	@Test(priority = 5)
	public void verifySparePartLabel() {
		String actualLabel = objAvialablePage.getSparePartLabel();
		String expectedLabel = "Sparepart Type";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 6)
	public void verifyDefaultSparePartDropdown() {
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		var selectedOption = DropDown.getSelectedOption(sparePartDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 7)
	public void verifyCountsSparePartDropdown() {
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		var selectedOptions = DropDown.getSelectOptions(sparePartDropdown);
		assertEquals(selectedOptions.size(), 16, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 8)
	public void verifySparePartValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(0,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(sparePartDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 9)
	public void verifyBiddingStatusLabel() {
		String actualLabel = objAvialablePage.getBiddingStatusLabel();
		String expectedLabel = "Bidding Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 10)
	public void verifyDefaultBiddingStatusDropdown() {
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		var selectedOption = DropDown.getSelectedOption(biddingStatusDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 11)
	public void verifyCountsBiddingStatusDropdown() {
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		var selectedOptions = DropDown.getSelectOptions(biddingStatusDropdown);
		assertEquals(selectedOptions.size(), 4, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 12)
	public void verifyBiddingStatusValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(1,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var biddingStatusDropdown=objAvialablePage.getBiddingStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(biddingStatusDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 13)
	public void verifyWinningStatusLabel() {
		String actualLabel = objAvialablePage.getWinningStatusLabel();
		String expectedLabel = "Winning Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 14)
	public void verifyDefaultWinningStatusDropdown() {
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		var selectedOption = DropDown.getSelectedOption(winningStatusDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 15)
	public void verifyCountsWinningStatusDropdown() {
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		var selectedOptions = DropDown.getSelectOptions(winningStatusDropdown);
		assertEquals(selectedOptions.size(), 3, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 16)
	public void verifyWinningStatusValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(2,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var winningStatusDropdown=objAvialablePage.getWinningStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(winningStatusDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	@Test(priority = 17)
	public void verifyBiddingDateLabel() {
		String actualLabel = objAvialablePage.getBiddingDateLabel();
		String expectedLabel = "Bidding Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}

	@Test(priority = 15)
	public void verifyDefaultBiddingDateDropdown() {
		String biddingdateDropdown=objAvialablePage.getBiddingDateDropdown();
		assertEquals(biddingdateDropdown, "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 18)
	public void verifyShowEntriesLabel() {
		String actualLabel = objAvialablePage.getShowEntriesLabel();
		String expectedLabel = "Show entries";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 19)
	public void verifyDefaultShowEntriesDropdown() {
		var showentriesDropdown=objAvialablePage.getShowEntriesDropdown();
		var selectedOption = DropDown.getSelectedOption(showentriesDropdown);
		assertEquals(selectedOption.toString(), "10", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 20)
	public void verifyCountsShowEntriesDropdown() {
		var showentriesDropdown=objAvialablePage.getShowEntriesDropdown();
		var selectedOptions = DropDown.getSelectOptions(showentriesDropdown);
		assertEquals(selectedOptions.size(), 4, "Incorrect Number Of Selections");
	}
	
	@Test(priority = 21)
	public void verifyShowEntriesValues() {
		List<String> ExcelValue=new ArrayList<>();
		ExcelValue=Excel.readBooksFromExcelFile(3,Excel.getDropdownExcelPath());
		System.out.println("Excel Values: "+ExcelValue);
		var showEntriesDropdown=objAvialablePage.getShowEntriesDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(showEntriesDropdown);
		System.out.println("Actual Values: "+selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExcelValue), "Values are not matching with the dropdown list");
	}
	
	
	@Test(priority = 22)
	public void verifySearchLabel() {
		String actualLabel = objAvialablePage.getSearchLabel();
		String expectedLabel = "Search:";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 23)
	public void verifyDefaultSearch() {
		String actualValue = objAvialablePage.getSearchInput();
		String expectedValue = "";
		AssertJUnit.assertEquals("Input is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnDate() {
		String actualValue = objAvialablePage.getColumnDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 24)
	public void verifyColumnCode() {
		String actualValue = objAvialablePage.getColumnCode();
		String expectedValue = "Code";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnBiddingStarts() {
		String actualValue = objAvialablePage.getColumnBiddingStarts();
		String expectedValue = "Bidding Starts";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnBiddingEnds() {
		String actualValue = objAvialablePage.getColumnBiddingEnds();
		String expectedValue = "Bidding Ends";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnSparePart() {
		String actualValue = objAvialablePage.getColumnSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnStatus() {
		String actualValue = objAvialablePage.getColumnStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	


	@Test(priority = 24)
	public void verifyColumnFDate() {
		String actualValue = objAvialablePage.getColumnFDate();
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 24)
	public void verifyColumnFCode() {
		String actualValue = objAvialablePage.getColumnFCode();
		String expectedValue = "Code";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnFBiddingStarts() {
		String actualValue = objAvialablePage.getColumnFBiddingStarts();
		String expectedValue = "Bidding Starts";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnFBiddingEnds() {
		String actualValue = objAvialablePage.getColumnFBiddingEnds();
		String expectedValue = "Bidding Ends";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnFSparePart() {
		String actualValue = objAvialablePage.getColumnFSparePart();
		String expectedValue = "Spare Part";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 24)
	public void verifyColumnFStatus() {
		String actualValue = objAvialablePage.getColumnFStatus();
		String expectedValue = "Status";
		AssertJUnit.assertEquals("Column name is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 25)
	public void verifyShowingLabel() {
		String actualValue = objAvialablePage.getShowingLabel();
		String expectedValue = "Values";
		AssertJUnit.assertEquals("Label detail is Incorrect", expectedValue, actualValue);
	}


	
}

