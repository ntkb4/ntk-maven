package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayGradesPage extends CommonElementPage {

	@FindBy(id = "name")
	WebElement nameField;
	
	
	public PayGradesPage()  {
		PageFactory.initElements(driver, this);
	}
	
	
	public void enter(String element, String value) {
		switch (element) {
		case "payGrades.name":
			enter(nameField, value);
			break;

		}
	}

}

