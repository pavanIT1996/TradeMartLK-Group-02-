package WebPageClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AvailableRequestPage {

	BasePage page;
	
	WebDriver PageClassWebDriver;

	public AvailableRequestPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
	}

	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div[1]/div[1]/h2")
	WebElement title;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a[1]")
	WebElement printbutton;
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a[2]")
	WebElement refreshbutton;


	
	public String getTitle(){
		page.waitForWebElementToAppear(title);
        return title.getText();
    }
	
	public void clickPrintButton(){
		page.waitForWebElementToAppear(printbutton);
		printbutton.click();
    }
	
	public void clickRefreshButton(){
		page.waitForWebElementToAppear(refreshbutton);
		printbutton.click();
    }
}
