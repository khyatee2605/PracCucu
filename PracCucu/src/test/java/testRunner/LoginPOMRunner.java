package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="Features\\LoginPOM.feature",
		glue="stepDefinition",
		plugin= {"html:target/cucurep/loginpom.html","json:target/cucurep/loginpom.json"}
		)
public class LoginPOMRunner {

}
