package TestClass;


import org.testng.annotations.Test;

import WebPageClass.GarageDashboardPage;


public class GarageLoginPageTest extends BaseTest{
	
		GarageDashboardPage objHomePage;
	    
		@Test(priority = 0)
		public void verifyvalidlogin() {
			objGarLogin = goGarLoginPage();
			objGarLogin.setUsername("SQAG2");
			objGarLogin.setPassword("123456");
			objHomePage=objGarLogin.clickLoginButton();
		}
}
