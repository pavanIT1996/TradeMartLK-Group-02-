package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GarageDashboardPage {
	BasePage page;
    
	WebDriver PageClassWebDriver;

	public GarageDashboardPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page=new BasePage(PageClassWebDriver);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[2]/div/nav/ul/li[3]/a")
	WebElement partrequestbutton;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[1]/a/i")
	WebElement reference;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[1]/ul/li[1]/a")
	WebElement editprofile;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[1]/ul/li[2]/a")
	WebElement editagent;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[1]/ul/li[3]/a")
	WebElement usermanagement;
		
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/a/i")
	WebElement operation;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/ul/li[1]/a")
	WebElement partrequests;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/ul/li[2]/a")
	WebElement notification;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/ul/li[3]/a")
	WebElement bidreview;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/ul/li[4]/a")
	WebElement purchaseorders;
	
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/h3")
	WebElement heading;
	
	
	public GaragePartRequestPage clickPartRequestButton() {
		page.waitForWebElementToAppear(partrequestbutton);
		partrequestbutton.click();
		return new GaragePartRequestPage(PageClassWebDriver);
	}
	
	public String getheading() {
		page.waitForWebElementToAppear(heading);
		return heading.getText();
	}

	
	public void clickreference() {
		page.waitForWebElementToAppear(reference);
		reference.click();
	}

	public GarageEditProfilePage clickEditProfilePage() {
		clickreference();
		page.waitForWebElementToAppear(editprofile);
		editprofile.click();
		return new GarageEditProfilePage(PageClassWebDriver);
	}

	public GarageEditAgentPage clickEditAgentPage() {
		clickreference();
		page.waitForWebElementToAppear(editagent);
		editagent.click();
		return new GarageEditAgentPage(PageClassWebDriver);
	}
	
	public GarageUserManagementPage clickUserManagementPage() {
		clickreference();
		page.waitForWebElementToAppear(usermanagement);
		usermanagement.click();
		return new GarageUserManagementPage(PageClassWebDriver);
	}
	
	public void clickOperation() {
		page.waitForWebElementToAppear(operation);
		operation.click();
	}

	public GaragePartRequestPage clickPartRequestPage() {
		clickOperation();
		page.waitForWebElementToAppear(partrequests);
		partrequests.click();
		return new GaragePartRequestPage(PageClassWebDriver);
	}

	public GarageNotificationPage clickNotificationPage() {
		clickOperation();
		page.waitForWebElementToAppear(notification);
		notification.click();
		return new GarageNotificationPage(PageClassWebDriver);
	}
	
	public GarageBidReviewPage clickBidReviewPage() {
		clickOperation();
		page.waitForWebElementToAppear(bidreview);
		bidreview.click();
		return new GarageBidReviewPage(PageClassWebDriver);
	}
	

	public GaragePurchaseOrderPage clickPurchasePage() {
		clickOperation();
		page.waitForWebElementToAppear(purchaseorders);
		purchaseorders.click();
		return new GaragePurchaseOrderPage(PageClassWebDriver);
	}
}
