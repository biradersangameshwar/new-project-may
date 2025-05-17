package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		glue= "stepdefination" ,
		features= ".\\features\\Loginpage.Feature"
		)
public class TestRunner {

}
