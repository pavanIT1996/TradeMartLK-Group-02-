package TestClass;

import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import WebPageClass.SupplierEditAgentPage;


public class SupplierEditAgentPageTest extends SupplierLoginPageTest{

	SupplierEditAgentPage objSupEditAgePage;
	
	@Test(priority = 2)
	public void verifyclickeditprofile() {
		objSupEditAgePage=objHomePage.clickEditAgentPage();
	}
	
	@Test(priority = 3)
	public void verifyTitle() {
		String actualTitle = objSupEditAgePage.getTitle();
		String expectedTitle = "Edit supplier information";
		AssertJUnit.assertEquals("Title Incorrect", expectedTitle, actualTitle);
	}

	
	@Test(priority = 4)
	public void verifyHeading() {
		String actualTitle = objSupEditAgePage.getHeading();
		String expectedTitle = "Edit Agent Information";
		AssertJUnit.assertEquals("Heading Incorrect", expectedTitle, actualTitle);
		driver.quit();
	}

}
