package com.noorteck.qa.runners;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(
		features = "src/test/resources/ntk360/", 
		glue = "com.noorteck.qa.steps", 
		plugin = { "pretty","html:target/cucumberR.html","json:target/cucumberR.json" }, 
		monochrome = true

)

public class RunnerT  {

} 

/**ll -------
 *     Maven Goal --> tells the system what to execute
 *     
 *     Maven Commands:
 * --> install  -----------> is used to install the dependency from central repo to local repository
 * --> clean   ----------> is used to clean up the previous execution history/ any generated report
 * --> test   --------> is used to execute test cases
 * 
 * 
 * clean -Dtest=com.noorteck.qa.runners.RunnerT test
 * 
 *                OR
 *  clean -Dtest=RunnerT test              
 */ 
