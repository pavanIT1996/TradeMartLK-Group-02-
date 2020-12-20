package TestClass;



import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.MyBidTab;
import WebPageClass.SupplierAvailableRequestPage;

public class MyBidTabTest extends SupplierLoginPageTest {

	SupplierAvailableRequestPage objAvialablePage;
	MyBidTab objMyBidTab;

	@Test(priority = 1, description="Verify Make Bid Button")
	public void verifyclickmakebidbutton() {
		objAvialablePage = objHomePage.clickmakebid();
	}

	@Test(priority = 2, description="Verify End status random row from the table")
	public void verifyclickEndStatusRow() {
		String values=objAvialablePage.RowElements(objAvialablePage.passRandomEndStatusRow());
		System.out.println(values.toString());
		String arr[] = values.toString().split(", ");
		objMyBidTab = objAvialablePage.clickMyBidTab();
		String actualValue = objMyBidTab.getTabHeadingLabel();
		System.out.println(actualValue);
		String expectedValue = "My Bid for - "+arr[4];
		System.out.println(expectedValue.toString());
		objAvialablePage.scrolltobottomofpage();
		//objMyBidTab.waitfortime();
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 3, description="Verify Started status random row from the table")
	public void verifyclickStartedStatusRow() {
		String values2=objAvialablePage.RowElements(objAvialablePage.passRandomStartedStatusRow());
		System.out.println(values2.toString());
		String arr2[] = values2.toString().split(", ");
		objMyBidTab = objAvialablePage.clickMyBidTab();
		String actualValue = objMyBidTab.getTabHeadingLabel();
		System.out.println(actualValue);
		String expectedValue = "My Bid for - "+arr2[4];
		System.out.println(expectedValue.toString());
		objAvialablePage.scrolltobottomofpage();
		//objMyBidTab.waitfortime();
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}

	@Test(priority = 4, description="Verify Price Label")
	public void verifypriceLabel() {
		String actualValue = objMyBidTab.getPriceLabel();
		System.out.println(actualValue);
		String expectedValue = "Price ( LKR )";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 5, description="Verify warranty Label")
	public void verifywarrantyLabel() {
		String actualValue = objMyBidTab.getWarrantyLabel();
		System.out.println(actualValue);
		String expectedValue = "Warranty";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 6, description="Verify description Label")
	public void verifydescriptionLabel() {
		String actualValue = objMyBidTab.getDescriptionLabel();
		System.out.println(actualValue);
		String expectedValue = "Description";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 7, description="Verify return policy Label")
	public void verifydreturnpolicyLabel() {
		String actualValue = objMyBidTab.getReturnPolicyLabel();
		System.out.println(actualValue);
		String expectedValue = "Return Policy";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 8, description="Verify photo Label")
	public void verifyphotoLabel() {
		String actualValue = objMyBidTab.getPhotoLabel();
		System.out.println(actualValue);
		String expectedValue = "Three Product Photos / Specs";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 9, description="Verify values in all inputs")
	public void verifyinputs() {
		objMyBidTab.clickEditButton();
		objMyBidTab.insertprice("100");
		objMyBidTab.insertwarranty("testwarranty");
		objMyBidTab.insertdescription("testdescription");;
		objMyBidTab.insertreturnpolicy("testPolicy");
		objMyBidTab.clickSaveButton();
		objMyBidTab.insertfirstpic("C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\Attachments\\PictureFiles\\Test01JPG.jpg");
		objMyBidTab.insertsecondpic("C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\Attachments\\PictureFiles\\Test03PNG.jpg");
		objMyBidTab.insertthirdpic("C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\Attachments\\PictureFiles\\Test01PNG.png");
		objMyBidTab.clickConfirmationOkButton();
	}
	
	@Test(priority = 10, description="Verify confirmation box title")
	public void verifyconfirmationboxTitle() {
		objMyBidTab.waitforinvisibleloading();
		objMyBidTab.refreshThePage();
		verifyclickStartedStatusRow();
		objMyBidTab.clickEditButton();
		String actualValue = objMyBidTab.getConfirmationtitle();
		System.out.println(actualValue);
		String expectedValue = "Confirmation Needed";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 11, description="Verify confirmation box description")
	public void verifyconfirmationboxDescription() {
		String actualValue = objMyBidTab.getConfirmationndescription();
		System.out.println(actualValue);
		String expectedValue = "Are you sure you want save or overide current bid ?";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 12, description="Verify confirmation box ok button click")
	public void verifyconfirmationboxOkbuttonLable() {
		String actualValue = objMyBidTab.getConfirmationOkButtonlabel();
		System.out.println(actualValue);
		String expectedValue = "OK";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 13, description="Verify confirmation box cancel button click")
	public void verifyconfirmationboxCancelbuttonLable() {
		String actualValue = objMyBidTab.getConfirmationCancelButtonlabel();
		System.out.println(actualValue);
		String expectedValue = "CANCEL";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	

	
}
