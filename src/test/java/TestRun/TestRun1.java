package TestRun;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
	(
	features={"Test1.feature"},
	glue={"StepDefs","Hooks1"},
	dryRun=false,
	monochrome=true,
	tags= {"@Smoke","@Regression"},
	plugin= {"pretty","html:test-output"}
	)

public class TestRun1 {
	
	

	
}
