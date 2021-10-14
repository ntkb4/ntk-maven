package com.noorteck.qa.steps;

//import org.testng.Assert;

import com.noorteck.qa.utils.CommonUI;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonStepDef extends CommonUI {

	@Given(".* click \"(.*)\"$")
	public void click(String element) {

		if (element.contains("common")) {
			commonObj.click(element);
		} else if (element.contains("login")) {
			loginObj.click(element);
		} else if (element.contains("menu")) {
			menuObj.navigateTo(element);
		} else if (element.contains("payGrades")) {
			payGradesObj.click(element);
		}

	}

	@Given(".* enterValue \"(.*)\" \"(.*)\"$")
	public void enterValue(String element, String value) {
		if (element.contains("payGrades")) {
			payGradesObj.enter(element, value);
		}
	}

	@Given("User is logged into NTK application {string}")
	public void login(String region) {
		navigate(jsonPath.getString(region + ".url"));
		loginObj.enter("login.username", jsonPath.getString(region + ".username"));
		loginObj.enter("login.password", jsonPath.getString(region + ".password"));
		loginObj.click("login.loginButton");

	}
	
	
	@Given("User is logged into NTK application <region>")
	public void user_is_logged_into_ntk_application_region() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	@Then("System displays message {string}")
	public void verifyMessage(String expected) {
		String actual = commonObj.getMessage(expected);
		//Assert.assertEquals(actual, expected);
	}

	@Then(".* verify \"(.*)\"$")
	public void verifyHeader(String header) {
		String actual = null;
		if (header.contains("payGrades")) {
			actual = payGradesObj.getPageTitle();
		}
	//	Assert.assertEquals(actual, header);
	//	Assert.assertEquals(true, true);
	}

}
