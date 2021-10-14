package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.CommonUI;

public class CommonElementPage extends CommonUI {

	@FindBy(xpath = "//*[@class='page-title']")
	WebElement pageHeader;

	@FindBy(xpath = "//*[contains(text(),'add')]")
	WebElement addIcon;

	@FindBy(xpath = "//*[contains(text(),'edit')]")
	WebElement editIcon;

	@FindBy(xpath = "//*[contains(text(),'Save')]")
	WebElement saveButton;

	@FindBy(xpath = "//*[contains(text(),'Cancel')]")
	WebElement cancelButton;

	@FindBy(xpath = "//*[contains(text(),'Successfully Saved')]")
	WebElement savedSuccess;

	@FindBy(xpath = "//*[contains(text(),'Successfully Updated')]")
	WebElement updatedSuccess;

	@FindBy(xpath = "//*[contains(text(),'Successfully Deleted')]")
	WebElement deletedSuccess;

	public CommonElementPage() {
		PageFactory.initElements(driver, this);
	}

	public void click(String element) {

		switch (element) {
		case "common.addIcon":
			click(addIcon);
			break;
		case "common.editIcon":
			click(editIcon);
			break;
		case "common.saveButton":
			click(saveButton);
			break;
		case "common.cancelButton":
			click(cancelButton);
			break;
		}

	}

	public String getMessage(String action) {

		if (action.contains("Updated")) {
			return getText(updatedSuccess);
		} else if (action.contains("Saved")) {
			return getText(savedSuccess);
		} else if (action.contains("Deleted")) {
			return getText(deletedSuccess);
		} else {
			return null;
		}

	}

	public String getPageTitle() {
		return getText(pageHeader);
	}
}
