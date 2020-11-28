package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.SupplierNotificationPage;


public class SupplierNotificationPageTest extends SupplierLoginPageTest{
	
	SupplierNotificationPage objSupNotiPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objSupNotiPage=objHomePage.clickNotificationPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objSupNotiPage.getTitle();
		String expectedTitle = "Trade Mart | Bid Review";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objSupNotiPage.getHeading();
		String expectedTitle = "Notifications";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
}
