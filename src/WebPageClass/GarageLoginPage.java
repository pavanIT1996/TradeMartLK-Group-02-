package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class GarageLoginPage {
	WebDriver PageClassWebDriver;
	
	public GarageLoginPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
	}
	
	@FindBy(how=How.NAME,using="username")
	WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	WebElement password;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"btn_login\"]")
	WebElement loginbutton;
	
	public void login(String uname,String pass) {
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginbutton.click();
	}
}
