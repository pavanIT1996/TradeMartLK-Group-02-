package WebPageClass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyBidTab {
	BasePage page;
	Actions action;

	WebDriver PageClassWebDriver;

	public MyBidTab(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver = TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
		action = new Actions(PageClassWebDriver);
	}

	// initialize webelements

	
	// initialize tab label elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[1]/h2")
	WebElement mybidTabHeading;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[2]/form/div[1]/label")
	WebElement pricelabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[2]/form/div[2]/label")
	WebElement warrantylabel;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[2]/form/div[3]/label")
	WebElement descriptionlabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[2]/form/div[4]/label")
	WebElement reutrnpolicylabel;

	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[2]/form/div[5]/label")
	WebElement photolabel;

	// initialize tab button elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[1]/div[1]/div/button[1]")
	WebElement editbutton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[1]/div[1]/div/button[2]")
	WebElement resetbutton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"menu1\"]/div/div/div/div/div[1]/div[1]/div/button[3]")
	WebElement savebutton;
	
	// initialize tab input elements
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-price\"]")
	WebElement priceinput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-warranty\"]")
	WebElement warrantyinput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-description\"]")
	WebElement descriptioninput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-return\"]")
	WebElement returnpolicyinput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-img1\"]")
	WebElement firstpicinput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-img2\"]")
	WebElement secondpicinput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"my-bid-img3\"]")
	WebElement thirdpicinput;
	
	// initialize confirmation box elements
	
	@FindBy(how = How.XPATH, using = "/html/body/div[9]/div/h4")
	WebElement confirmationboxtitle;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[9]/div/div[4]")
	WebElement confirmationboxdescription;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[9]/div/div[5]/button[1]")
	WebElement okbutton;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[9]/div/div[5]/button[2]")
	WebElement cancelbutton;
	
	// initialize loading
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"GlobleLoadingDiv\"]")
	WebElement loadingspan;
	
	
	
	// initialize methods
	

	// initialize tab label related methods
	
	public String getTabHeadingLabel() {
		page.waitForWebElementToAppear(mybidTabHeading);
		return mybidTabHeading.getText();
	}
	
	public String getPriceLabel() {
		page.waitForWebElementToAppear(pricelabel);
		return pricelabel.getText();
	}
	
	public String getWarrantyLabel() {
		page.waitForWebElementToAppear(warrantylabel);
		return warrantylabel.getText();
	}
	
	public String getDescriptionLabel() {
		page.waitForWebElementToAppear(descriptionlabel);
		return descriptionlabel.getText();
	}
	
	public String getReturnPolicyLabel() {
		page.waitForWebElementToAppear(reutrnpolicylabel);
		return reutrnpolicylabel.getText();
	}
	
	public String getPhotoLabel() {
		page.waitForWebElementToAppear(reutrnpolicylabel);
		return photolabel.getText();
	}
	
	
	// initialize tab button related methods
	
	public void clickEditButton() {
		page.waitForWebElementToAppear(editbutton);
		editbutton.click();
	}
	
	public void clickResetButton() {
		page.waitForWebElementToAppear(resetbutton);
		resetbutton.click();
	}
	
	public void clickSaveButton() {
		page.waitForWebElementToAppear(savebutton);
		savebutton.click();
	}
	
	
	// initialize tab input related methods
	
	public void insertprice(String value) {
		page.waitForWebElementToAppear(priceinput);
		priceinput.sendKeys(value);
	}
	
	public void clearprice() {
		priceinput.clear();
	}
	
	public void insertwarranty(String value) {
		page.waitForWebElementToAppear(warrantyinput);
		warrantyinput.sendKeys(value);
	}
	
	public void clearwarranty() {
		warrantyinput.clear();
	}
	
	public void insertdescription(String value) {
		page.waitForWebElementToAppear(descriptioninput);
		descriptioninput.sendKeys(value);
	}
	
	public void cleardescription() {
		descriptioninput.clear();
	}
	
	public void insertreturnpolicy(String value) {
		page.waitForWebElementToAppear(returnpolicyinput);
		returnpolicyinput.sendKeys(value);
	}
	
	public void clearreturnpolicy() {
		returnpolicyinput.clear();
	}
	
	
	public void insertfirstpic(String value) {
		page.waitForWebElementToAppear(firstpicinput);
		firstpicinput.sendKeys(value);
	}
	
	public void clearfirstpic() {
		firstpicinput.clear();
	}
	
	
	public void insertsecondpic(String value) {
		page.waitForWebElementToAppear(secondpicinput);
		secondpicinput.sendKeys(value);
	}
	
	public void clearsecondpic() {
		secondpicinput.clear();
	}
	
	public void insertthirdpic(String value) {
		page.waitForWebElementToAppear(thirdpicinput);
		thirdpicinput.sendKeys(value);
	}
	
	public void clearthirdpic() {
		thirdpicinput.clear();
	}
	
	
	// initialize confirmation box related methods
	
	
	public String getConfirmationtitle(){
		page.waitForWebElementToAppear(confirmationboxtitle);
		return confirmationboxtitle.getText();
	}
	
	
	public String getConfirmationndescription(){
		page.waitForWebElementToAppear(confirmationboxdescription);
		return confirmationboxdescription.getText();
	}
	
	
	public String getConfirmationOkButtonlabel(){
		page.waitForWebElementToAppear(okbutton);
		return okbutton.getText();
	}
	
	public String getConfirmationCancelButtonlabel(){
		page.waitForWebElementToAppear(cancelbutton);
		return cancelbutton.getText();
	}
	
	
	public void clickConfirmationOkButton(){
		page.waitForWebElementToAppear(okbutton);
		okbutton.click();
	}
	
	
	public void clickConfirmationCancelButton(){
		page.waitForWebElementToAppear(cancelbutton);
		cancelbutton.click();
	}
	
	public void refreshThePage(){
		PageClassWebDriver.navigate().refresh();
	}
	
	public void waitforinvisibleloading(){
		page.waitForElementToDisappear(loadingspan);
	}
	
}
