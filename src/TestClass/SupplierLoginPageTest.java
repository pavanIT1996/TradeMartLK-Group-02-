package TestClass;

import org.testng.annotations.Test;
import WebPageClass.SupplierDashboardPage;

public class SupplierLoginPageTest extends BaseTest {

    SupplierDashboardPage objHomePage;
    
	@Test(priority = 0)
	public void verifyvalidlogin() {
		objSupLogin = goSupLoginPage();
		objSupLogin.setUsername("SQAG2");
		objSupLogin.setPassword("123456");
		objHomePage=objSupLogin.clickLoginButton();
	}

}
