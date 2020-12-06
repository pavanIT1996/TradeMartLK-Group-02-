package WebPageClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SupplierAvailableRequestPage {

	BasePage page;

	WebDriver PageClassWebDriver;

	public SupplierAvailableRequestPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver = TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
	}

	// initialize webelements
	
	// initialize labels
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[1]/h2")
	WebElement heading;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a[1]")
	WebElement printButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a[2]")
	WebElement refreshButton;

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
	
	
	// initialize dropdown and inputs
	
	@FindBy(how = How.ID, using = "parttype")
	WebElement parttypeDropDown;

	@FindBy(how = How.ID, using = "statusdrop")
	WebElement biddingstatusDropDown;
	
	@FindBy(how = How.ID, using = "typedrop")
	WebElement winningstatusDropDown;

	@FindBy(how = How.XPATH, using = "//*[@id=\"duereportrange\"]/span")
	WebElement biddingdateDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_length\"]/label/select")
	WebElement showentriesDropDown;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_filter\"]/label/input")
	WebElement searchInput;
	
	
	// initialize table columns Headers
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[1]")
	WebElement columnDate;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[2]")
	WebElement columnCode;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[3]")
	WebElement columnBiddingStarts;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[4]")
	WebElement columnBiddingEnds;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[5]")
	WebElement columnSparePart;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/thead/tr/th[6]")
	WebElement columnStatus;
	
	
	// initialize table columns Footers
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tfoot/tr/th[1]")
	WebElement columnFDate;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tfoot/tr/th[2]")
	WebElement columnFCode;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tfoot/tr/th[3]")
	WebElement columnFBiddingStarts;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tfoot/tr/th[4]")
	WebElement columnFBiddingEnds;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tfoot/tr/th[5]")
	WebElement columnFSparePart;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tfoot/tr/th[6]")
	WebElement columnFStatus;
	
	
	//initialize showing info count
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_info\"]")
	WebElement showingLabel;
	
	
	
	//initialize methods
	
	public String getTitle() {
		return PageClassWebDriver.getTitle();
	}

	public String getHeading() {
		page.waitForWebElementToAppear(heading);
		return heading.getText();
	}

	public void clickPrintButton() {
		page.waitForWebElementToAppear(printButton);
		printButton.click();
	}

	public void clickRefreshButton() {
		page.waitForWebElementToAppear(refreshButton);
		printButton.click();
	}

	public String getSparePartLabel() {
		page.waitForWebElementToAppear(sparePartType);
		String arr[] = sparePartType.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public WebElement getSparePartTypeDropdown() {
		page.waitForWebElementToAppear(parttypeDropDown);
		return parttypeDropDown;
	}
	
	public String getBiddingStatusLabel() {
		page.waitForWebElementToAppear(biddingStatus);
		String arr[] = biddingStatus.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public WebElement getBiddingStatusDropdown() {
		page.waitForWebElementToAppear(biddingstatusDropDown);
		return biddingstatusDropDown;
	}

	public String getWinningStatusLabel() {
		page.waitForWebElementToAppear(winningStatus);
		String arr[] = winningStatus.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public WebElement getWinningStatusDropdown() {
		page.waitForWebElementToAppear(winningstatusDropDown);
		return winningstatusDropDown;
	}
	
	public String getBiddingDateLabel() {
		page.waitForWebElementToAppear(biddingDate);
		String arr[] = biddingDate.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}
	
	public String getBiddingDateDropdown() {
		page.waitForWebElementToAppear(biddingdateDropDown);
		return biddingdateDropDown.getText();
	}
	
	public String getShowEntriesLabel() {
		page.waitForWebElementToAppear(showEntries);
		WebElement webeleValue=showEntries.findElement(By.tagName("label"));
		String arr[] = webeleValue.getText().split("\\r\\n|\\n|\\r");
		String Label=arr[0]+" "+arr[5];
		return Label;
	}
	
	public WebElement getShowEntriesDropdown() {
		page.waitForWebElementToAppear(showentriesDropDown);
		return showentriesDropDown;
	}

	
	public String getSearchLabel() {
		page.waitForWebElementToAppear(search);
		return search.getText();
	}
	
	public String getSearchInput() {
		page.waitForWebElementToAppear(searchInput);
		return searchInput.getText();
	}
	
	
	
	public String getColumnDate() {
		page.waitForWebElementToAppear(columnDate);
		return columnDate.getText();
	}
	
	public String getColumnCode() {
		page.waitForWebElementToAppear(columnCode);
		return columnCode.getText();
	}
	
	public String getColumnBiddingStarts() {
		page.waitForWebElementToAppear(columnBiddingStarts);
		return columnBiddingStarts.getText();
	}
	
	public String getColumnBiddingEnds() {
		page.waitForWebElementToAppear(columnBiddingEnds);
		return columnBiddingEnds.getText();
	}
	
	public String getColumnSparePart() {
		page.waitForWebElementToAppear(columnSparePart);
		return columnSparePart.getText();
	}
	
	public String getColumnStatus() {
		page.waitForWebElementToAppear(columnStatus);
		return columnStatus.getText();
	}
	
	
	public String getColumnFDate() {
		page.waitForWebElementToAppear(columnFDate);
		return columnFDate.getText();
	}
	
	public String getColumnFCode() {
		page.waitForWebElementToAppear(columnFCode);
		return columnFCode.getText();
	}
	
	public String getColumnFBiddingStarts() {
		page.waitForWebElementToAppear(columnFBiddingStarts);
		return columnFBiddingStarts.getText();
	}
	
	public String getColumnFBiddingEnds() {
		page.waitForWebElementToAppear(columnFBiddingEnds);
		return columnFBiddingEnds.getText();
	}
	
	public String getColumnFSparePart() {
		page.waitForWebElementToAppear(columnFSparePart);
		return columnFSparePart.getText();
	}
	
	public String getColumnFStatus() {
		page.waitForWebElementToAppear(columnFStatus);
		return columnFStatus.getText();
	}
	
	public String getShowingLabel() {
		page.waitForWebElementToAppear(showingLabel);
		return showingLabel.getText();
	}
	
}
