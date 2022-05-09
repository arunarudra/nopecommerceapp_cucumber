package StepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
    	features = "src/test/java/Features/customers.feature",
    	//tags= {"@regression,@sanity"},
    	glue = {"StepDefinitions"},
    	monochrome = true,
    	dryRun=true,
    	plugin = {"pretty","html:test-output","json:test-output/cucumber.json"}
    	
    		
		)
public class TestRunner {

}
