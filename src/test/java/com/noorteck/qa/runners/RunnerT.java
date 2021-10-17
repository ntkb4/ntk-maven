package com.noorteck.qa.runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/ntk360/", 
		glue = "com.noorteck.qa.steps", 
		plugin = { "pretty","html:target/cucumberR.html","json:target/cucumberR.json" }, 
		monochrome = true, tags = "@NTKB4-7"

)

public class RunnerT  {

} 