package WebPageClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GaragePurchaseOrderPage {
	BasePage page;
    
	WebDriver PageClassWebDriver;

	public GaragePurchaseOrderPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver=TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page=new BasePage(PageClassWebDriver);
	}
	
	@FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[3]/div[1]/div[1]/h2")
	WebElement heading;
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div[1]")
	WebElement sparePartType;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div[2]")
	WebElement biddingStatus;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div[3]")
	WebElement winningStatus;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[2]/div[1]/div/div[4]")
	WebElement biddingDate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_length\"]")
	WebElement showEntries;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_filter\"]/label")
	WebElement search;
	

	// initialize table columns Headers
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[1]")
	WebElement columnDate;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[2]")
	WebElement columnRequestId;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[3]")
	WebElement columnBidId;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[4]")
	WebElement columnSparePart;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[5]")
	WebElement columnStatus;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tbody")
	WebElement tablebody;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_info\"]")
	WebElement showingLabel;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div/div[2]/div[3]/div[1]")
	WebElement purchaseHeading;
	
	public String getTitle() {
		return PageClassWebDriver.getTitle();
	}
	
	public String getHeading() {
		page.waitForWebElementToAppear(heading);
		return heading.getText();
	}
	
	public String getSparePartLabel() {
		page.waitForWebElementToAppear(sparePartType);
		String arr[] = sparePartType.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public String getBiddingStatusLabel() {
		page.waitForWebElementToAppear(biddingStatus);
		String arr[] = biddingStatus.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public String getWinningStatusLabel() {
		page.waitForWebElementToAppear(winningStatus);
		String arr[] = winningStatus.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public String getBiddingDateLabel() {
		page.waitForWebElementToAppear(biddingDate);
		String arr[] = biddingDate.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public String getShowEntriesLabel() {
		page.waitForWebElementToAppear(showEntries);
		WebElement webeleValue = showEntries.findElement(By.tagName("label"));
		String arr[] = webeleValue.getText().split("\\r\\n|\\n|\\r");
		String Label = arr[0] + " " + arr[5];
		return Label;
	}
	
	public String getSearchLabel() {
		page.waitForWebElementToAppear(search);
		return search.getText();
	}
	
	public String getColumnDate() {
		page.waitForWebElementToAppear(columnDate);
		return columnDate.getText();
	}
	
	public String getColumnRequestId() {
		page.waitForWebElementToAppear(columnRequestId);
		return columnRequestId.getText();
	}
	
	public String getColumnBidId() {
		page.waitForWebElementToAppear(columnBidId);
		return columnBidId.getText();
	}
	
	public String getColumnSparePart() {
		page.waitForWebElementToAppear(columnSparePart);
		return columnSparePart.getText();
	}
	
	public String getColumnStatus() {
		page.waitForWebElementToAppear(columnStatus);
		return columnStatus.getText();
	}
	
	public int RowCounts() {
		int count = 0;
		List<WebElement> ExcelValue = new ArrayList<>();
		ExcelValue = AllTableRows();
		for (WebElement Value : ExcelValue) {
			Value.click();
			if (Value.getText().equals("No data available in table"))
				return count;
			else
				count++;
		}
		return count;
	}
	
	
	public List<WebElement> AllTableRows() {
		List<WebElement> allrows = new ArrayList<>();
		page.waitForWebElementToAppear(tablebody);
		allrows = tablebody.findElements(By.tagName("tr"));
		return allrows;
	}
	
	public String getShowingLabel() {
		page.waitForWebElementToAppear(showingLabel);
		return showingLabel.getText();
	}
	
	public String getPurchaseHeading() {
		page.waitForWebElementToAppear(purchaseHeading);
		return purchaseHeading.getText();
	}
}
