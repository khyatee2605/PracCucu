package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features\\login.feature",
		glue="stepDefinition",
		plugin="json:target/cucu-rep/cucurep.json"
		)

public class LoginRunner {

}
