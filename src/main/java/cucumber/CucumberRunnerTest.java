package cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
			format = { "html:target/cucumber" , "json:target/cucumber.json"},
			glue={"cucumber.steps"},
			features ={"."}
			
			)


public class CucumberRunnerTest {
	
	
}
