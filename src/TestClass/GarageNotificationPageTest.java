package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.GarageNotificationPage;

public class GarageNotificationPageTest extends GarageLoginPageTest{
	GarageNotificationPage objGarNotiPage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objGarNotiPage=objHomePage.clickNotificationPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objGarNotiPage.getTitle();
		String expectedTitle = "Notification";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objGarNotiPage.getHeading();
		String expectedTitle = "Notifications";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}
}
