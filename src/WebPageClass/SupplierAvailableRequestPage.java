package WebPageClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[1]/h2")
	WebElement heading;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a[1]")
	WebElement printButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[3]/div[1]/div[1]/div[1]/div/a[2]")
	WebElement refreshButton;

	@FindBy(how = How.CLASS_NAME, using = "col-xl-2 col-lg-2 col-md-2 col-sm-6 col-xs-12")
	WebElement sparePartTypeLabel;

	@FindBy(how = How.ID, using = "parttype")
	WebElement parttypeDropDown;

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

	public String getSparePartyTypeLabel() {
		page.waitForWebElementToAppear(sparePartTypeLabel);
		return sparePartTypeLabel.getText();
	}

	public WebElement getSparePartTypeDropdown() {
		page.waitForWebElementToAppear(parttypeDropDown);
		return parttypeDropDown;
	}
	
	

	// All drop down common
	public void selectFromDropdown(String option, WebElement dropdown) {
		findDropDownElement(dropdown).selectByVisibleText(option);
	}

	public String getSelectedOption(WebElement dropdown) {
		WebElement SelectedElement = findDropDownElement(dropdown).getFirstSelectedOption();
		return SelectedElement.getText();
	}

	public List<String> getSelectOptions(WebElement dropdown) {
		List<WebElement> SelectElements = findDropDownElement(dropdown).getOptions();
		return SelectElements.stream().map(e -> e.getText()).collect(Collectors.toList());
	}

	private Select findDropDownElement(WebElement dropdown) {
		return new Select(dropdown);
	}

	public static boolean verify_Values_In_Dropdown(List<String> listOfElements, String[] strValues) {
		boolean bValue=false;
		List<String> list = new ArrayList<String>();
		for (String strValue : strValues) {
			boolean bflag = false;
			for (String element : listOfElements) {
				if (strValue.equals(element)) {
					bflag= true;
				}
			}
			if (!bflag)
				list.add(strValue);
		}
		if (list.size() > 0) {
			for(String strList : list) {
				System.out.println("Value not present in dropdown: "+strList);
			}
			//Assign false if any of the value not found in dropdown
			bValue = false;
		} else {
			//Assign true if all values found in dropdown
			System.out.println("All value(s) found in dropdown");
			bValue=true;
		}
		return bValue;
	}
}
