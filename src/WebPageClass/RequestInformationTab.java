package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RequestInformationTab {

	BasePage page;
	Actions action;
	
	WebDriver PageClassWebDriver;

	public RequestInformationTab(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver = TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
		action= new Actions(PageClassWebDriver);
	}
	
	// initialize webelements
	
	// initialize labels
	@FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/div/h3")
	WebElement requestTabHeading;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/div/h5[1]")
	WebElement requestPartNameLabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/div/p")
	WebElement requestPartName;

	@FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/div/h5[2]")
	WebElement requestDescriptionLabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"home\"]/div/div[1]")
	WebElement requestDescription;
	
	// initialize methods
	
	public String getTabHeadingLabel() {
		page.waitForWebElementToAppear(requestTabHeading);
		page.scrolldown();
		return requestTabHeading.getText();
	}
	
	public String getPartNameLabel() {
		page.waitForWebElementToAppear(requestPartNameLabel);
		return requestPartNameLabel.getText();
	}
	
	public String getDescriptionLabel() {
		page.waitForWebElementToAppear(requestDescriptionLabel);
		return requestDescriptionLabel.getText();
	}
	
	public String getPartName() {
		page.waitForWebElementToAppear(requestPartName);
		return requestPartName.getText();
	}
	
	public String getDescription() {
		page.waitForWebElementToAppear(requestDescription);
		return requestDescription.getText();
	}
	
}
