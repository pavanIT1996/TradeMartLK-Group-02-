package WebPageClass;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BiddingDateDropdown {

	BasePage page;
	Actions action;

	WebDriver PageClassWebDriver;

	public BiddingDateDropdown(WebDriver TestClassParameterDriver) {
		this.PageClassWebDriver = TestClassParameterDriver;
		PageFactory.initElements(TestClassParameterDriver, this);
		page = new BasePage(PageClassWebDriver);
		action = new Actions(PageClassWebDriver);
	}

	// initialize bidding date dropdown inputs
	@FindBy(how = How.XPATH, using = "//*[@id=\"duereportrange\"]/span")
	WebElement biddingdateDropDown;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[1]")
	WebElement todayDate;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[2]")
	WebElement tomorrowDate;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[3]")
	WebElement next7Days;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[4]")
	WebElement next30Days;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[5]")
	WebElement thisMonth;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[6]")
	WebElement lastMonth;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[7]")
	WebElement last7Days;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[8]")
	WebElement yesterdayDate;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/ul/li[9]")
	WebElement customDate;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/div/button[1]")
	WebElement submitButton;

	@FindBy(how = How.XPATH, using = "/html/body/div[7]/div[3]/div/button[2]")
	WebElement cancelButton;

	public void clickBiddingDateDropdown() {
		page.waitForWebElementToAppear(biddingdateDropDown);
		biddingdateDropDown.click();
	}

	public String getBiddingDateToday() {
		page.waitForWebElementToAppear(todayDate);
		return todayDate.getText();
	}

	public String getBiddingDateDropdown() {
		page.waitForWebElementToAppear(biddingdateDropDown);
		return biddingdateDropDown.getText();
	}

	public String getCurrentDateAndTime(String type) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate now = LocalDate.now();
		String Full = null;
		if (type.equals("today")) {
			Full = dtf.format(now) + " 00:00" + " - " + dtf.format(now) + " 23:59";
		} else if (type.equals("tomorrow")) {
			now = now.plusDays(1);
			Full = dtf.format(now) + " 00:00" + " - " + dtf.format(now) + " 23:59";
		} else if (type.equals("next7")) {
			LocalDate next7 = now.plusDays(6);
			Full = dtf.format(now) + " 00:00" + " - " + dtf.format(next7) + " 23:59";
		} else if (type.equals("next30")) {
			LocalDate next30 = now.plusDays(29);
			Full = dtf.format(now) + " 00:00" + " - " + dtf.format(next30) + " 23:59";
		} else if (type.equals("thismonth")) {
			int year = now.getYear();
			int month = now.getMonthValue();
			String firstdate = "01";
			int lastdate = now.lengthOfMonth();
			Full = year + "-" + month + "-" + firstdate + " 00:00" + " - " + year + "-" + month + "-" + lastdate
					+ " 23:59";
		} else if (type.equals("lastmonth")) {
			now = now.minusMonths(1);
			int year = now.getYear();
			int month = now.getMonthValue();
			String firstdate = "01";
			int lastdate = now.lengthOfMonth();
			Full = year + "-" + month + "-" + firstdate + " 00:00" + " - " + year + "-" + month + "-" + lastdate
					+ " 23:59";
		} else if (type.equals("last7")) {
			LocalDate last7 = now.minusDays(6);
			Full = dtf.format(last7) + " 00:00" + " - " + dtf.format(now) + " 23:59";
		} else if (type.equals("yesterday")) {
			now = now.minusDays(1);
			Full = dtf.format(now) + " 00:00" + " - " + dtf.format(now) + " 23:59";
		} else {
			System.out.println("No valid type");
		}

		return Full;
	}

	public String convertToHex(String color) {
		String[] numbers = color.replace("rgba(", "").replace(")", "").split(",");
		int r = Integer.parseInt(numbers[0].trim());
		int g = Integer.parseInt(numbers[1].trim());
		int b = Integer.parseInt(numbers[2].trim());
		System.out.println("r: " + r + "g: " + g + "b: " + b);
		String hex = "#" + Integer.toHexString(r) + Integer.toHexString(g) + Integer.toHexString(b);
		return hex;
	}

	public String clickBiddingDateToday() {
		page.waitForWebElementToAppear(todayDate);
		todayDate.click();
		System.out.print(todayDate.getCssValue("color"));
		return todayDate.getCssValue("color");
	}

	public String hoverBiddingDateToday() {
		page.waitForWebElementToAppear(todayDate);
		action.moveToElement(todayDate).build().perform();
		System.out.print(todayDate.getCssValue("background-color"));
		return todayDate.getCssValue("background-color");
	}

	public String getBiddingDateTomorrow() {
		page.waitForWebElementToAppear(tomorrowDate);
		return tomorrowDate.getText();
	}

	public void clickBiddingDateTomorrow() {
		page.waitForWebElementToAppear(tomorrowDate);
		tomorrowDate.click();
	}

	public String getBiddingDateNext7() {
		page.waitForWebElementToAppear(next7Days);
		return next7Days.getText();
	}

	public void clickBiddingDateNext7() {
		page.waitForWebElementToAppear(next7Days);
		next7Days.click();
	}

	public String getBiddingDateNext30() {
		page.waitForWebElementToAppear(next30Days);
		return next30Days.getText();
	}

	public void clickBiddingDateNext30() {
		page.waitForWebElementToAppear(next30Days);
		next30Days.click();
	}

	public String getBiddingDateThisMonth() {
		page.waitForWebElementToAppear(thisMonth);
		return thisMonth.getText();
	}

	public void clickBiddingDateThisMonth() {
		page.waitForWebElementToAppear(thisMonth);
		thisMonth.click();
	}

	public String getBiddingDateLastMonth() {
		page.waitForWebElementToAppear(lastMonth);
		return lastMonth.getText();
	}

	public void clickBiddingDateLastMonth() {
		page.waitForWebElementToAppear(lastMonth);
		lastMonth.click();
	}

	public String getBiddingDateLast7() {
		page.waitForWebElementToAppear(last7Days);
		return last7Days.getText();
	}

	public void clickBiddingDateLast7() {
		page.waitForWebElementToAppear(last7Days);
		last7Days.click();
	}

	public String getBiddingDateYesterday() {
		page.waitForWebElementToAppear(yesterdayDate);
		return yesterdayDate.getText();
	}

	public void clickBiddingDateYesterday() {
		page.waitForWebElementToAppear(yesterdayDate);
		yesterdayDate.click();
	}

	public String getBiddingDateCustom() {
		page.waitForWebElementToAppear(customDate);
		return customDate.getText();
	}
	
	public void clickBiddingDateCustom() {
		page.waitForWebElementToAppear(customDate);
		customDate.click();
	}

	public String getBiddingDateSubmitButton() {
		page.waitForWebElementToAppear(submitButton);
		return submitButton.getText();
	}
	
	public void clickBiddingDateSubmitButton() {
		page.waitForWebElementToAppear(submitButton);
		submitButton.click();
	}

	public String getBiddingDateCancelButton() {
		page.waitForWebElementToAppear(cancelButton);
		return cancelButton.getText();
	}

	public void clickBiddingDateCancelButton() {
		page.waitForWebElementToAppear(cancelButton);
		cancelButton.click();
	}
}
