package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SupplierLoginPage {

	BasePage page;

	WebDriver PageClassWebDriver;

	public SupplierLoginPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver = TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
	}

	@FindBy(how = How.NAME, using = "username")
	WebElement username;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"btn_login\"]")
	WebElement loginbutton;

	public void setUsername(String uname) {
		page.waitForWebElementToAppear(username);
		username.sendKeys(uname);
	}

	public void setPassword(String pass) {
		page.waitForWebElementToAppear(password);
		password.sendKeys(pass);
	}

	public SupplierDashboardPage clickLoginButton() {
		page.waitForWebElementToAppear(loginbutton);
		loginbutton.click();
		return new SupplierDashboardPage(PageClassWebDriver);
	}

}
