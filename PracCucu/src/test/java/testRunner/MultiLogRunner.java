package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features\\multilog.feature",
		glue="stepDefinition",
		plugin="json:target/cucurep/cucurep.json"
		)
public class MultiLogRunner {

}
