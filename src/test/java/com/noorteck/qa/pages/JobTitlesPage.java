package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobTitlesPage extends CommonElementPage {

	@FindBy(id = "jobTitleName")
	WebElement naameField;

	@FindBy(id = "jobDescription")
	WebElement descriptionField;

	@FindBy(id = "note")
	WebElement noteField;

	public JobTitlesPage() {
		PageFactory.initElements(driver, this);
	}

	public void enter(String element, String value) {
		switch (element) {
		case "job.name":
			enter(naameField, value);
			break;
		case "job.description":
			enter(descriptionField, value);
			break;
		case "job.note":
			enter(noteField, value);
			break;
		}
	}
}
