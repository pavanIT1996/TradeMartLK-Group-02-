package UtilityClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtilityClass {
	
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

	public boolean verify_Values_In_Dropdown(List<String> listOfElements,List<String> strValues) {
		boolean bValue=false;
		List<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		String values = Arrays.toString(strValues.toArray()).replace("[", "").replace("]", "");
		String Arr[]=values.split(", ");
		
		//Check all excel values in the dropdown
		for (String strValue : Arr) {
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
		
		//Check all dropdown values in the excel
		
		for (String element : listOfElements) {
			boolean bflag = false;
			for (String strValue : Arr) {
				if (element.equals(strValue)) {
					bflag= true;
				}
			}
			if (!bflag)
				list2.add(element);
		}
		if (list2.size() > 0) {
			for(String strList : list2) {
				System.out.println("Additional Value in dropdown: "+strList);
			}
			//Assign false if any of the value not found in excel
			bValue = false;
		} else {
			//Assign true if all values found in excel
			System.out.println("No additional value(s) found in dropdown");
			bValue=true;
		}
		return bValue;
	}
}
