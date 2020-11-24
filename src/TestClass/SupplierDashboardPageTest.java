package TestClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import WebPageClass.AvailableRequestPage;
import WebPageClass.SupplierDashboardPage;
import WebPageClass.SupplierLoginPage;

public class SupplierDashboardPageTest extends SupplierLoginPageTest {

	AvailableRequestPage objAvialablePage;

	@Test(priority = 1)
	public void verifyclickmakebidbutton() {
		objAvialablePage=objHomePage.clickmakebid();
	}

}
