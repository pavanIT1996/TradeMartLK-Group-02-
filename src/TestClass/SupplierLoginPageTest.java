package TestClass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import WebPageClass.SupplierDashboardPage;
import WebPageClass.SupplierLoginPage;

public class SupplierLoginPageTest extends BaseTest {

    SupplierDashboardPage objHomePage;
    
	@Test(priority = 0)
	public void verifyvalidlogin() {
		objSupLogin = goLoginPage();
		objSupLogin.setUsername("SQAG2");
		objSupLogin.setPassword("123456");
		objHomePage = objSupLogin.clickLoginButton();
//		new SupplierDashboardPage(driver);
//		System.out.println(objHomePage.toString() + " 01");
	}

//	public SupplierDashboardPage goSupDashPage() {
//		if (super.driver != null) {
//			System.out.println(objHomePage.toString() + " 02");
//			return new SupplierDashboardPage(super.driver);
//		} else {
//			return new SupplierDashboardPage(super.driver);
//		}
//	}

//	@Test(priority=1)
//	public void verifyclickmakebidbutton() {
//		objHomePage=objLogin.GoToSupDashboard();
//		objHomePage.clickmakebid();
//	}
}
