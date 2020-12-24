package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import WebPageClass.RequestInformationTab;
import WebPageClass.SupplierAvailableRequestPage;

public class RequestInformationTabTest extends SupplierLoginPageTest{

	SupplierAvailableRequestPage objAvialablePage;
	RequestInformationTab objRequestInformationTab;
	String values;
	String values2;
	
	@Test(priority = 1, description="Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
	}
	
	@Test(priority = 2, description="Verify End status random row from the table")
	public void verifyclickEndStatusRowDetails() {
		values=objAvialablePage.RowElements(objAvialablePage.passRandomEndStatusRow());
		String arr[] = values.toString().split(", ");
		objRequestInformationTab=objAvialablePage.clickRequestInformationTab();
		String actualValue=objRequestInformationTab.getTabHeadingLabel();
		System.out.println(actualValue);
		String expectedValue = "Bidding will Start "+arr[0]+" at "+arr[2]+" and end at "+arr[3]+" - "+arr[5];
		System.out.println(expectedValue.toString());
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 3, description="Verify Started status random row from the table")
	public void verifyclickStartedStatusRowDetails() {
		values2=objAvialablePage.RowElements(objAvialablePage.passRandomStartedStatusRow());
		String arr2[] = values2.toString().split(", ");
		objRequestInformationTab=objAvialablePage.clickRequestInformationTab();
		String actualValue=objRequestInformationTab.getTabHeadingLabel();
		System.out.println(actualValue);
		String expectedValue = "Bidding will Start "+arr2[0]+" at "+arr2[2]+" and end at "+arr2[3]+" - "+arr2[5];
		System.out.println(expectedValue.toString());
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 4, description="Verify Part Name Label")
	public void verifypartNameLabel() {
		String actualValue=objRequestInformationTab.getPartNameLabel();
		System.out.println(actualValue);
		String expectedValue = "Part Name";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 5, description="Verify Part Name of End Status")
	public void verifypartNameEnd() {
		String actualValue=objRequestInformationTab.getPartName();
		String arr[] = values.toString().split(", ");
		System.out.println(actualValue);
		String expectedValue = arr[4];
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 6, description="Verify Part Name of Started Status")
	public void verifypartNameStarted() {
		String actualValue=objRequestInformationTab.getPartName();
		String arr2[] = values2.toString().split(", ");
		System.out.println(actualValue);
		String expectedValue = arr2[4];
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 7, description="Verify Description Label")
	public void verifydescriptionLabel() {
		String actualValue=objRequestInformationTab.getDescriptionLabel();
		System.out.println(actualValue);
		String expectedValue = "Description";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 8, description="Verify Description of End Status")
	public void verifypartDescriptionEnd() {
		String actualValue=objRequestInformationTab.getDescription();
		String arr[] = values.toString().split(", ");
		System.out.println(actualValue);
		String expectedValue = arr[4];
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 9, description="Verify Description of Started Status")
	public void verifypartDescriptionStarted() {
		String actualValue=objRequestInformationTab.getDescription();
		String arr2[] = values2.toString().split(", ");
		System.out.println(actualValue);
		String expectedValue = arr2[4];
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
//	@AfterTest
//	public void driverquit() {
//		driver.quit();
//	}
//	
}
