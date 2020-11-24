package TestClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import WebPageClass.AvailableRequestPage;
import WebPageClass.SupplierDashboardPage;


public class AvailableRequestPageTest extends SupplierDashboardPageTest{
	
	@Test(priority=2)
	public void verifyTitle() {
		String title=objAvialablePage.getTitle();
		String title2="THIS IS A MODAL WINDOW";
		assertEquals(title,title2,"Title Incorrect");
	}
	
	@Test(priority=3)
	public void verifyPrintButton() {
		objAvialablePage.clickPrintButton();
	}
	
	@Test(priority=4)
	public void verifyRefreshButton() {
		objAvialablePage.clickRefreshButton();
	}
}
