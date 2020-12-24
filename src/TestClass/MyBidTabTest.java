package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
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
	public void verifyclickEndStatusRow() throws InterruptedException {
		String values=objAvialablePage.RowElements(objAvialablePage.passRandomEndStatusRow());
		Thread.sleep(3000);
		System.out.println(values.toString());
		String arr[] = values.toString().split(", ");
		objMyBidTab = objAvialablePage.clickMyBidTab();
		Thread.sleep(3000);
		String actualValue = objMyBidTab.getTabHeadingLabel();
		System.out.println("Actual value : "+actualValue);
		String expectedValue = "My Bid for - "+arr[4];
		System.out.println("Expected value : "+expectedValue.toString());
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	
	@Test(priority = 3, description="Verify Started status random row from the table")
	public void verifyclickStartedStatusRow() throws InterruptedException {
		String values2=objAvialablePage.RowElements(objAvialablePage.passRandomStartedStatusRow());
		Thread.sleep(3000);
		System.out.println(values2.toString());
		String arr2[] = values2.toString().split(", ");
		objMyBidTab = objAvialablePage.clickMyBidTab();
		Thread.sleep(3000);
		String actualValue2 = objMyBidTab.getTabHeadingLabel();
		System.out.println("Actual value : "+actualValue2);
		String expectedValue = "My Bid for - "+arr2[4];
		System.out.println("Expected value : "+expectedValue.toString());
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue2);
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
	public void verifyinputs() throws InterruptedException {
		objMyBidTab.clickEditButton();
		Thread.sleep(3000);
		objMyBidTab.insertprice("100");
		Thread.sleep(3000);
		objMyBidTab.insertwarranty("testwarranty");
		Thread.sleep(3000);
		objMyBidTab.insertdescription("testdescription");;
		Thread.sleep(3000);
		objMyBidTab.insertreturnpolicy("testPolicy");
		Thread.sleep(3000);
		objMyBidTab.insertfirstpic("C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\Attachments\\PictureFiles\\Test01JPG.jpg");
		Thread.sleep(3000);
		objMyBidTab.insertsecondpic("C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\Attachments\\PictureFiles\\Test03PNG.jpg");
		Thread.sleep(3000);
		objMyBidTab.insertthirdpic("C:\\Users\\Pavan\\SeleniumPractice\\TradeMartLK\\Attachments\\PictureFiles\\Test01PNG.png");
		Thread.sleep(3000);
		objMyBidTab.clickSaveButton();
	}
	
	@Test(priority = 10, description="Verify confirmation box title")
	public void verifyconfirmationboxTitle() {
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
	
	@Test(priority = 12, description="Verify confirmation box ok button label")
	public void verifyconfirmationboxOkbuttonLable() {
		String actualValue = objMyBidTab.getConfirmationOkButtonlabel();
		System.out.println(actualValue);
		String expectedValue = "OK";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 13, description="Verify confirmation box cancel button label")
	public void verifyconfirmationboxCancelbuttonLable() throws InterruptedException {
		String actualValue = objMyBidTab.getConfirmationCancelButtonlabel();
		System.out.println(actualValue);
		String expectedValue = "CANCEL";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
		Thread.sleep(3000);
		objMyBidTab.clickConfirmationOkButton();
		Thread.sleep(5000);
	}
	
	@Test(priority = 14, description="Verify notificaion title")
	public void verifynotificationTitle() {
		String actualValue = objMyBidTab.getNotifcationTitle();
		String expectedValue = "Success";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 14, description="Verify notification description")
	public void verifynotificationDescription() {
		String actualValue = objMyBidTab.getNotifcationDescription();
		String expectedValue = "Woow . It worked :)";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 15, description="Verify save button label")
	public void verifySaveButtonLabel() {
		String actualValue = objMyBidTab.getSaveButton();
		String expectedValue = "Save";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 16, description = "Verify Save Button color")
	public void verifySaveButtonColor() throws InterruptedException{
		String color=objMyBidTab.getSaveButtonColor();
		Thread.sleep(3000);
		System.out.println("Save color : "+color);
		String actualLabel=objMyBidTab.convertToHex(color);
		String expectedLabel = "#26b99a";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 17, description="Verify edit button label")
	public void verifyEditButtonLabel() {
		String actualValue = objMyBidTab.getEditButton();
		String expectedValue = "Edit";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 18, description="Verify reset button label")
	public void verifyResetButtonLabel() {
		String actualValue = objMyBidTab.getResetButton();
		String expectedValue = "Reset";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 19, description = "Verify Save Button color")
	public void verifyResetButtonColor() throws InterruptedException{
		String color=objMyBidTab.getResetButtonColor();
		Thread.sleep(3000);
		System.out.println("Reset color : "+color);
		String actualLabel=objMyBidTab.convertToHex(color);
		String expectedLabel = "#337ab7";
		AssertJUnit.assertEquals("Label is Incorrect", expectedLabel, actualLabel);
	}
	
	@Test(priority = 20, description="Verify hover disabled")
	public void verifyHoverDisable() throws InterruptedException {
		Thread.sleep(3000);
		String actualValue = objMyBidTab.getHoverPriceinput();
		System.out.println("Actual : "+actualValue);
		String expectedValue = "not-allowed";
		System.out.println("Expected : "+expectedValue);
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 21, description="Verify Input Disabled")
	public void verifyInputDisabled() throws InterruptedException {
		Thread.sleep(3000);
		String actualValue = objMyBidTab.getPriceinputDisabled();
		System.out.println("Actual : "+actualValue);
		String expectedValue = "true";
		System.out.println("Expected : "+expectedValue);
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 22, description="Verify Input Enabled")
	public void verifyInputEnabled() throws InterruptedException {
		objMyBidTab.clickEditButton();
		Thread.sleep(3000);
		String actualValue = objMyBidTab.getPriceinputDisabled();
		System.out.println("Actual : "+actualValue);
		System.out.println("Expected : "+null);
		AssertJUnit.assertEquals("Label is Incorrect", null, actualValue);
	}
	
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}
	
}
