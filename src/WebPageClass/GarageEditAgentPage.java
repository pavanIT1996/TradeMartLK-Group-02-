package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GarageEditAgentPage {
	BasePage page;
    
	WebDriver PageClassWebDriver;

	public GarageEditAgentPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page=new BasePage(PageClassWebDriver);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div/div[1]/div/h2")
	WebElement heading;
	
	public String getTitle() {
		return PageClassWebDriver.getTitle();
	}
	
	public String getHeading() {
		page.waitForWebElementToAppear(heading);
		return heading.getText();
	}
}
