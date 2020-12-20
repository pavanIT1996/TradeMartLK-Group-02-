package WebPageClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import UtilityClass.DropDownUtilityClass;
import UtilityClass.ExcelUtilityClass;

public class SupplierAvailableRequestPage  {

	BasePage page;
	Actions action;

	WebDriver PageClassWebDriver;
	ExcelUtilityClass Excel=new ExcelUtilityClass();
	
	public SupplierAvailableRequestPage(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver = TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
		action = new Actions(PageClassWebDriver);
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

	// initialize showing info count

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_info\"]")
	WebElement showingLabel;

	// initialize pagination option

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_previous\"]/a")
	WebElement paginationPreviousLabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_paginate\"]/ul/li[2]/a")
	WebElement paginationFirstLabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_paginate\"]/ul/li[3]/a")
	WebElement paginationSecondLabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_paginate\"]/ul/li[4]/a")
	WebElement paginationThirdLabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable_next\"]/a")
	WebElement paginationNextLabel;

	// initialize tabs

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[2]/ul/li[1]")
	WebElement requestInformationTab;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[2]/ul/li[2]")
	WebElement myBidTab;

	// linitialize row of table
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"crud-main-datatable\"]/tbody")
	WebElement tablebody;
	

	// initialize methods

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

	// initialize spare part dropdown methods

	public String getSparePartLabel() {
		page.waitForWebElementToAppear(sparePartType);
		String arr[] = sparePartType.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public WebElement getSparePartTypeDropdown() {
		page.waitForWebElementToAppear(parttypeDropDown);
		return parttypeDropDown;
	}

	// initialize Bidding status dropdown methods

	public String getBiddingStatusLabel() {
		page.waitForWebElementToAppear(biddingStatus);
		String arr[] = biddingStatus.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public WebElement getBiddingStatusDropdown() {
		page.waitForWebElementToAppear(biddingstatusDropDown);
		return biddingstatusDropDown;
	}

	// initialize winning status dropdown methods

	public String getWinningStatusLabel() {
		page.waitForWebElementToAppear(winningStatus);
		String arr[] = winningStatus.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public WebElement getWinningStatusDropdown() {
		page.waitForWebElementToAppear(winningstatusDropDown);
		return winningstatusDropDown;
	}

	// initialize bidding date dropdown methods

	public String getBiddingDateLabel() {
		page.waitForWebElementToAppear(biddingDate);
		String arr[] = biddingDate.getText().split("\\r\\n|\\n|\\r");
		return arr[0];
	}

	public String getBiddingDateDropdown() {
		page.waitForWebElementToAppear(biddingdateDropDown);
		return biddingdateDropDown.getText();
	}
	
	public String getCurrentDateAndTime() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");  
		LocalDateTime now = LocalDateTime.now();  
		LocalDateTime lastmonth = now.minusDays(29);
		String Full=dtf.format(lastmonth)+" - "+dtf.format(now);
		return Full;   
	}

	// initialize show entries dropdown methods

	public String getShowEntriesLabel() {
		page.waitForWebElementToAppear(showEntries);
		WebElement webeleValue = showEntries.findElement(By.tagName("label"));
		String arr[] = webeleValue.getText().split("\\r\\n|\\n|\\r");
		String Label = arr[0] + " " + arr[5];
		return Label;
	}

	public WebElement getShowEntriesDropdown() {
		page.waitForWebElementToAppear(showentriesDropDown);
		return showentriesDropDown;
	}

	// initialize search methods

	public String getSearchLabel() {
		page.waitForWebElementToAppear(search);
		return search.getText();
	}

	public String getSearchInput() {
		page.waitForWebElementToAppear(searchInput);
		return searchInput.getText();
	}
	
	public void insertSearch(String value) {
		page.waitForWebElementToAppear(searchInput);
		searchInput.sendKeys(value);
	}
	
	public void cleansearch(){
		searchInput.sendKeys(Keys.CONTROL + "a");
		searchInput.sendKeys(Keys.DELETE);
	}

	// initialize table column label methods

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

	// initialize showing label methods

	public String getShowingLabel() {
		page.waitForWebElementToAppear(showingLabel);
		return showingLabel.getText();
	}

	// initialize pagination methods

	public String getPaginationPreviousLabel() {
		page.waitForWebElementToAppear(paginationPreviousLabel);
		return paginationPreviousLabel.getText();
	}

	public String getHoverPaginationPreviousLabel() {
		page.waitForWebElementToAppear(paginationPreviousLabel);
		action.moveToElement(paginationPreviousLabel).build().perform();
		return paginationPreviousLabel.getText();
	}

	public String getPaginationFirstLabel() {
		page.waitForWebElementToAppear(paginationFirstLabel);
		return paginationFirstLabel.getText();
	}

	public String getPaginationSecondLabel() {
		page.waitForWebElementToAppear(paginationSecondLabel);
		return paginationSecondLabel.getText();
	}

	public String getPaginationThirdLabel() {
		page.waitForWebElementToAppear(paginationThirdLabel);
		return paginationThirdLabel.getText();
	}

	public String getPaginationNextLabel() {
		page.waitForWebElementToAppear(paginationNextLabel);
		return paginationNextLabel.getText();
	}

	// initialize tab methods

	public String getRequestInformationTab() {
		page.scrolldown();
		page.waitForWebElementToAppear(requestInformationTab);
		return requestInformationTab.getText();
	}

	public String getMyBidTab() {
		page.scrolldown();
		page.waitForWebElementToAppear(myBidTab);
		return myBidTab.getText();
	}

	public String getActivetab() {
		String value = requestInformationTab.getAttribute("class");
		String value2 = myBidTab.getAttribute("class");
		if (value.equals("active")) {
			System.out.println("Active request Informations " + value);
			return requestInformationTab.getText();
		} else {
			System.out.println("Active My Bid " + value2);
			return myBidTab.getText();
		}
	}

	public MyBidTab clickMyBidTab() {
		page.waitForWebElementToAppear(myBidTab);
		myBidTab.click();
		return new MyBidTab(PageClassWebDriver);
	}

	public RequestInformationTab clickRequestInformationTab() {
		page.waitForWebElementToAppear(requestInformationTab);
		requestInformationTab.click();
		return new RequestInformationTab(PageClassWebDriver);
	}

	
	// initialize click row methods
	
	
	List<WebElement> endstatusrows=new ArrayList<>();
	List<WebElement> startedstatusrows=new ArrayList<>();
	
	public String AllTableRows() {
		Select100fromShowEntries();
		page.waitForWebElementToAppear(tablebody);
		List<WebElement> allrows=new ArrayList<>();
		allrows= tablebody.findElements(By.tagName("tr"));
	    for(WebElement row: allrows)
	    {
	    	String fullrow=row.getText();
	    	String lastword=fullrow.substring(fullrow.lastIndexOf(" ")+1);
	    	if(lastword.equals("END")) {
	    		endstatusrows.add(row);
	    		System.out.println("End Status rows List : "+row.getText());
	    	}
	    	else if(lastword.equals("STARTED")) {
	    		startedstatusrows.add(row);
	    		System.out.println("End Status rows List : "+row.getText());
	    	}
	    	else {
	    		System.out.println("Not Equal");
	    	}
	    }
	    return allrows.toString();
	}

	public WebElement getRandomRow(List<WebElement> List) {
		Random rand = new Random();
		int int_random = rand.nextInt(List.size()); 
		WebElement value=List.get(int_random);
		return value;
	}
	
	
	public WebElement passRandomEndStatusRow() {
		AllTableRows();
		return getRandomRow(endstatusrows);
	}
	
	
	public WebElement passRandomStartedStatusRow() {
		return getRandomRow(startedstatusrows);
	}
	
	public String RowElements(WebElement element) {
		Select100fromShowEntries();
		page.waitForWebElementToAppear(element);
		element.click();
		List<WebElement> columnvalues = element.findElements(By.tagName("td"));
		List<String> listBooks = new ArrayList<>();
		for (WebElement webElement : columnvalues) {
			listBooks.add(webElement.getText());
		}
		String values = Arrays.toString(listBooks.toArray()).replace("[", "").replace("]", "");
		return values;
	}

	public void Select100fromShowEntries() {
		DropDownUtilityClass DropDown = new DropDownUtilityClass();
		DropDown.selectFromDropdown("100", getShowEntriesDropdown());
	}
	
	public void scrolltobottomofpage() {
		JavascriptExecutor js = (JavascriptExecutor) PageClassWebDriver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	
}
