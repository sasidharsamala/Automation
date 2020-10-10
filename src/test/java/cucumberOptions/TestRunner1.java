package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features/placeValidations.feature",plugin="json:target/jsonReports/cucumber-report.json",
		glue="stepDefinitions"
				)

public class TestRunner1 {

}
//,tags= {"@DeletePlace"}
