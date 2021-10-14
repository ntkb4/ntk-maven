package com.noorteck.qa.steps;


 import com.noorteck.qa.utils.CommonUI;
import com.noorteck.qa.utils.Constants;
import com.noorteck.qa.utils.ObjInitialize;
import com.noorteck.qa.utils.ReadJsonFile;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void setUp(Scenario scenario) {
		System.out.println("Executing Test Scenario: [" + scenario.getName() + "]");
		Constants.jsonPath = ReadJsonFile.loadJsonFile("Region");
		CommonUI.openBrowser("chrome");
		ObjInitialize.initializeClassObj();

	}

	@After
	public void tearDown(Scenario scenario) {
		System.out.println("Finished Exeucting Test Scenario: [" + scenario.getName() + "]");
		CommonUI.quitBrowser();
	}

}
