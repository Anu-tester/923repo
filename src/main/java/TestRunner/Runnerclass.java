package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Anu\\Ecommercenew\\com.qa.ecommerce\\src\\main\\java\\Features", //the path of the feature files
		glue={"StepDefinitions"}, //the path of the step definition files
		format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}, //to generate different types of reporting
		monochrome = true, //display the console output in a proper readable format
		strict = true, //it will check if any step is not defined in step definition file
		dryRun = false,//to check the mapping is proper between feature file and step def file
		tags= {"@SmokeTest,@RegressionTest"}
		
		//tags = {"@Tagging,@Login,@Window"}	[ , means or tag	]
		//tags={"@Login","@Tagging",}[and tag which will execute all tests with login and tagging]
		)
 



public class Runnerclass {

}
