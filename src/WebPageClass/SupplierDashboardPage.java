package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;


public class SupplierDashboardPage {
	
	BasePage page;
    
	WebDriver PageClassWebDriver;

	public SupplierDashboardPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page=new BasePage(PageClassWebDriver);
	}
	

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[2]/div/nav/ul/li[3]/a")
	WebElement makebidbutton;
	
	public AvailableRequestPage clickmakebid() {
		page.waitForWebElementToAppear(makebidbutton);
		makebidbutton.click();
		return new AvailableRequestPage(PageClassWebDriver);
	}

}
