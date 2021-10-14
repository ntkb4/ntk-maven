package com.noorteck.qa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions (
		
		features = "src/test/resources/ntk360/PayGrades.feature", 
		glue = "com.noorteck.qa.steps", 
			plugin = {"pretty", "html:target/cucumberd-report.html"},
			monochrome = true
	
		)

public class XyzRunnerT {
	


}
 