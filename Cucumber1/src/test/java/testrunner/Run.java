package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= ".//Features/Customers.feature",
		glue= "stepDefination",
		dryRun = false,
		monochrome=true,
		plugin= {"pretty","html:target/cucumber-reports/reports2.html"}
		//plugin= {"pretty","json:target/cucumber-reports/report_json.json"}
		)


public class Run {

}
