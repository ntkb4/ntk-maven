package com.noorteck.qa.runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/ntk360/PayGrades.feature", 
		glue = "com.noorteck.qa.steps", 
		plugin = { "pretty","html:target/cucumber-report.html","json:target/cucumber-report.json" }, 
		monochrome = true, tags = "@scruml"

)

public class RunnerT  {

} 