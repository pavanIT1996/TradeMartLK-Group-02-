package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


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
	WebElement availablerequests;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/ul/li[2]/a")
	WebElement notification;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"sidebar-menu\"]/div/ul/li[2]/ul/li[3]/a")
	WebElement purchaseorder;
	
	
	public String getTitle() {
		return PageClassWebDriver.getTitle();
	}
	
	public SupplierAvailableRequestPage clickmakebid() {
		page.waitForWebElementToAppear(makebidbutton);
		makebidbutton.click();
		return new SupplierAvailableRequestPage(PageClassWebDriver);
	}
	
	public void clickreference() {
		page.waitForWebElementToAppear(reference);
		reference.click();
	}

	public SupplierEditProfilePage clickEditProfilePage() {
		clickreference();
		page.waitForWebElementToAppear(editprofile);
		editprofile.click();
		return new SupplierEditProfilePage(PageClassWebDriver);
	}

	public SupplierEditAgentPage clickEditAgentPage() {
		clickreference();
		page.waitForWebElementToAppear(editagent);
		editagent.click();
		return new SupplierEditAgentPage(PageClassWebDriver);
	}
	
	public SupplierUserManagementPage clickUserManagementPage() {
		clickreference();
		page.waitForWebElementToAppear(usermanagement);
		usermanagement.click();
		return new SupplierUserManagementPage(PageClassWebDriver);
	}
	
	public void clickOperation() {
		page.waitForWebElementToAppear(operation);
		operation.click();
	}

	public SupplierAvailableRequestPage clickAvilableRequestPage() {
		clickOperation();
		page.waitForWebElementToAppear(availablerequests);
		availablerequests.click();
		return new SupplierAvailableRequestPage(PageClassWebDriver);
	}

	public SupplierNotificationPage clickNotificationPage() {
		clickOperation();
		page.waitForWebElementToAppear(notification);
		notification.click();
		return new SupplierNotificationPage(PageClassWebDriver);
	}
	
	public SupplierPurchaseOrderPage clickPurchasePage() {
		clickOperation();
		page.waitForWebElementToAppear(purchaseorder);
		purchaseorder.click();
		return new SupplierPurchaseOrderPage(PageClassWebDriver);
	}
}

