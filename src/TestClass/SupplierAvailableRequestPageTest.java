package TestClass;

import org.testng.annotations.Test;

import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import WebPageClass.SupplierAvailableRequestPage;
import WebPageClass.SupplierDashboardPage;

public class SupplierAvailableRequestPageTest extends SupplierLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;
	
	@Test(priority = 1)
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
//		driver.quit();
	}
	
	@Test(priority = 2)
	public void verifyclickavailaberequest() {
		objHomePage.clickAvilableRequestPage();
//		driver.quit();
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

//	@Test(priority = 5)
//	public void verifySparePatyType() {
//		String actualLabel = objAvialablePage.getSparePartyTypeLabel();
//		String expectedLabel = "Sparpart Type";
//		AssertJUnit.assertEquals("Label Incorrect", expectedLabel, actualLabel);
//	}

	
	@Test(priority = 6)
	public void verifyDefaultSpareDropdown() {
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		var selectedOption = objAvialablePage.getSelectedOption(sparePartDropdown);
		assertEquals(selectedOption.toString(), "All", "Incorrect Default Value Selection");
	}
	
	@Test(priority = 7)
	public void verifyCountsSpareDropdown() {
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		var selectedOptions = objAvialablePage.getSelectOptions(sparePartDropdown);
		assertEquals(selectedOptions.size(), 16, "Incorrect Number Of Selections");
	}

	@Test(priority = 8)
	public void verifyValuesSpareDropdown() {
		String[] checkValues= {"All","ALL ","Wind Screen ", "Door ","Buffer ","Head Light ",
				"Head Light - Left Side ","Head Light - Right Side ","Signal Light - Left Side ",
				"Signal Light - Right Side ","Shock Absorber - Left Side ","Shock Absorber - Right Side ","Buffet - Front ",
				"Buffet - Rear ","Windscreen - Front ","Windscreen - Rear "};
		var sparePartDropdown=objAvialablePage.getSparePartTypeDropdown();
		List<String> selectOptions = objAvialablePage.getSelectOptions(sparePartDropdown);
		assertTrue(objAvialablePage.verify_Values_In_Dropdown(selectOptions, checkValues), "Values are not matching with the dropdown list");
		driver.quit();
	}

	
}

