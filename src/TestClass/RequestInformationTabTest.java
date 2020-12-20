package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.RequestInformationTab;
import WebPageClass.SupplierAvailableRequestPage;

public class RequestInformationTabTest extends SupplierLoginPageTest{

	SupplierAvailableRequestPage objAvialablePage;
	RequestInformationTab objRequestInformationTab;
	
	@Test(priority = 1, description="Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
	}
	
	@Test(priority = 2, description="Verify End status random row from the table")
	public void verifyclickEndStatusRowDetails() {
		String values=objAvialablePage.RowElements(objAvialablePage.passRandomEndStatusRow());
		String arr[] = values.toString().split(", ");
		objRequestInformationTab=objAvialablePage.clickRequestInformationTab();
		String actualValue=objRequestInformationTab.getTabHeadingLabel();
		System.out.println(actualValue);
		String expectedValue = "Bidding will Start "+arr[0]+" at "+arr[2]+" and end at "+arr[3]+" - "+arr[5];
		System.out.println(expectedValue.toString());
		objAvialablePage.scrolltobottomofpage();
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 3, description="Verify Started status random row from the table")
	public void verifyclickStartedStatusRowDetails() {
		String values2=objAvialablePage.RowElements(objAvialablePage.passRandomStartedStatusRow());
		String arr2[] = values2.toString().split(", ");
		objRequestInformationTab=objAvialablePage.clickRequestInformationTab();
		String actualValue=objRequestInformationTab.getTabHeadingLabel();
		System.out.println(actualValue);
		String expectedValue = "Bidding will Start "+arr2[0]+" at "+arr2[2]+" and end at "+arr2[3]+" - "+arr2[5];
		System.out.println(expectedValue.toString());
		objAvialablePage.scrolltobottomofpage();
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 4, description="Verify Part Name Label")
	public void verifypartNameLabel() {
		String actualValue=objRequestInformationTab.getPartNameLabel();
		System.out.println(actualValue);
		String expectedValue = "Part Name";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 5, description="Verify Description Label")
	public void verifydescriptionLabel() {
		String actualValue=objRequestInformationTab.getDescriptionLabel();
		System.out.println(actualValue);
		String expectedValue = "Description";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
}
