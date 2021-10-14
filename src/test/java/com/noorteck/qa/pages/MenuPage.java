package com.noorteck.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.noorteck.qa.utils.Constants;

public class MenuPage extends CommonElementPage {

	@FindBy(xpath = "//span[text()='Admin']")
	WebElement admin;

	@FindBy(xpath = "//span[text()='Job']")
	WebElement job;

	@FindBy(xpath = "//span[text()='Job Titles']")
	WebElement jobTitles;

	@FindBy(xpath = "//span[text()='Components']")
	WebElement salaryComp;

	@FindBy(xpath = "//span[text()='Pay Grades']")
	WebElement payGrades;

	@FindBy(xpath = "//span[text()='Employment Status']")
	WebElement empStatus;

	@FindBy(xpath = "//span[text()='Job Categories']")
	WebElement jobCategories;

	public MenuPage() {
		PageFactory.initElements(Constants.driver, this);

	}

	public void navigateTo(String pageName) {
		switch (pageName) {
		case "menu.jobTitles":
			click(admin);
			click(job);
			click(jobTitles);
			break;
		case "menu.salaryComp":
			click(admin);
			click(job);
			click(salaryComp);
			break;
		case "menu.payGrades":
			click(admin);
			click(job);
			click(payGrades);
			break;
		case "menu.empStatus":
			click(admin);
			click(job);
			click(empStatus);
			break;
		case "menu.jobCategories":
			click(admin);
			click(job);
			click(jobCategories);
			break;
		}
	}
}
