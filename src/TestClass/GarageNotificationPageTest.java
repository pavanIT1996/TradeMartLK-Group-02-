package TestClass;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.testng.AssertJUnit;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import UtilityClass.DropDownUtilityClass;
import WebPageClass.GarageNotificationPage;

public class GarageNotificationPageTest extends GarageLoginPageTest{
	
	GarageNotificationPage objGarNotiPage;
	DropDownUtilityClass DropDown = new DropDownUtilityClass();
	
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarNotiPage=objHomePage.clickNotificationPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarNotiPage.getTitle();
		String expectedTitle = "Trade Mart | Notification";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objGarNotiPage.getHeading();
		String expectedTitle = "Notifications";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 5, description="Verify Message Group Label")
	public void verifyMessageGroupLabel() {
		String actualValue = objGarNotiPage.getMessageGroupLabel();
		System.out.println(actualValue);
		String expectedValue = "Message Group";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 6, description="Verify Message Status Label")
	public void verifyMessageStatusLabel() {
		String actualValue = objGarNotiPage.getReadStatusLabel();
		System.out.println(actualValue);
		String expectedValue = "Read Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 7, description="Verify Bidding date Label")
	public void verifyBiddingDateLabel() {
		String actualValue = objGarNotiPage.getBiddingDateLabel();
		System.out.println(actualValue);
		String expectedValue = "Bidding Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 8, description="Verify search Label")
	public void verifySearchLabel() {
		String actualValue = objGarNotiPage.getSearchLabel();
		System.out.println(actualValue);
		String expectedValue = "Search:";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 9, description="Verify date column Label")
	public void verifyDateColumnLabel() {
		String actualValue = objGarNotiPage.getDateColumnLabel();
		System.out.println(actualValue);
		String expectedValue = "Date";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 10, description="Verify date column Label")
	public void verifyTimeColumnLabel() {
		String actualValue = objGarNotiPage.getTimeColumnLabel();
		System.out.println(actualValue);
		String expectedValue = "Time";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 11, description="Verify heading column Label")
	public void verifyHeadingColumnLabel() {
		String actualValue = objGarNotiPage.getHeadingColumnLabel();
		System.out.println(actualValue);
		String expectedValue = "Heading";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 12, description="Verify Read Status column Label")
	public void verifyReadStatusColumnLabel() {
		String actualValue = objGarNotiPage.getReadStatusColumnLabel();
		System.out.println(actualValue);
		String expectedValue = "Read Status";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 13, description="Verify EmailSEnd column Label")
	public void verifyEmailSendColumnLabel() {
		String actualValue = objGarNotiPage.getEmailSendColumnLabel();
		System.out.println(actualValue);
		String expectedValue = "Email Send";
		AssertJUnit.assertEquals("Label is Incorrect", expectedValue, actualValue);
	}
	
	@Test(priority = 14, description = "Verify Read Status Dropdown Values names")
	public void verifyReadStatusValues() {
		List<String> ExpectedValues = new ArrayList<>();
		ExpectedValues.add("READ");
		ExpectedValues.add("UNREAD");
		var readStatusDropdown = objGarNotiPage.getreadStatusDropdown();
		List<String> selectOptions = DropDown.getSelectOptions(readStatusDropdown);
		System.out.println("Actual Values: " + selectOptions);
		assertTrue(DropDown.verify_Values_In_Dropdown(selectOptions, ExpectedValues),
				"Values are not matching with the dropdown list");
	}
	
	@AfterTest
	public void driverquit() {
		driver.quit();
	}
}
