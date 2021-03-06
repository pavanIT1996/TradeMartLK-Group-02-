package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GarageBidReviewPage {
	BasePage page;
    
	WebDriver PageClassWebDriver;

	public GarageBidReviewPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page=new BasePage(PageClassWebDriver);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div[1]/div[1]/h2")
	WebElement heading;
	
	public String getTitle() {
		return PageClassWebDriver.getTitle();
	}
	
	public String getHeading() {
		page.waitForWebElementToAppear(heading);
		return heading.getText();
	}
}
