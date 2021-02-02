package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GarageNotificationPage {
	BasePage page;
    
	WebDriver PageClassWebDriver;

	public GarageNotificationPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page=new BasePage(PageClassWebDriver);
	}
	
	
	// initialize dropdown elements
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div/div[1]/h2")
	WebElement heading;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[1]")
	WebElement messageGroupLabel;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[2]")
	WebElement readStatusLabel;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div/div[2]/div[1]/div/div[3]")
	WebElement biddingDateLabel;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable_filter\"]/label")
	WebElement searchLabel;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"parttype\"]")
	WebElement messageGroupDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"statusdrop\"]")
	WebElement readStatusDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"duereportrange\"]/span")
	WebElement biddingDateDropdown;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable_length\"]/label/select")
	WebElement showEntriesDropdown;
	
	
	
	// initialize search box
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable_filter\"]/label/input")
	WebElement searchBox;
	
	// initialize table column headers
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable\"]/thead/tr/th[1]")
	WebElement dateColumn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable\"]/thead/tr/th[2]")
	WebElement timeColumn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable\"]/thead/tr/th[3]")
	WebElement headingColumn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable\"]/thead/tr/th[4]")
	WebElement readStatusColumn;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"crud-main-datatable\"]/thead/tr/th[5]")
	WebElement emailSendColumn;
	
	
	public String getTitle() {
		return PageClassWebDriver.getTitle();
	}
	
	public String getHeading() {
		page.waitForWebElementToAppear(heading);
		return heading.getText();
	}
	
	public String getMessageGroupLabel() {
		page.waitForWebElementToAppear(messageGroupLabel);
		String arr[] = messageGroupLabel.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public String getReadStatusLabel() {
		page.waitForWebElementToAppear(readStatusLabel);
		String arr[] = readStatusLabel.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public String getBiddingDateLabel() {
		page.waitForWebElementToAppear(biddingDateLabel);
		String arr[] = biddingDateLabel.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public String getSearchLabel() {
		page.waitForWebElementToAppear(searchLabel);
		return searchLabel.getText();
	}
	
	public String getDateColumnLabel() {
		page.waitForWebElementToAppear(dateColumn);
		return dateColumn.getText();
	}
	
	public String getTimeColumnLabel() {
		page.waitForWebElementToAppear(timeColumn);
		return timeColumn.getText();
	}
	
	public String getHeadingColumnLabel() {
		page.waitForWebElementToAppear(headingColumn);
		return headingColumn.getText();
	}
	
	public String getReadStatusColumnLabel() {
		page.waitForWebElementToAppear(readStatusColumn);
		return readStatusColumn.getText();
	}
	
	public String getEmailSendColumnLabel() {
		page.waitForWebElementToAppear(emailSendColumn);
		return emailSendColumn.getText();
	}
	
	public WebElement getreadStatusDropdown() {
		page.waitForWebElementToAppear(readStatusDropdown);
		return readStatusDropdown;
	}
}
