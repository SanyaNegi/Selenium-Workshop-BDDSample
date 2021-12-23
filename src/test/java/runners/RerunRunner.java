package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//runner will first read feature file and will go step by step in matching each feature with the corresponding step definition.
@CucumberOptions(
		publish = true,
		features = "@target/failed_scenarios.txt",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = { "pretty",
				"html:target/reports/htmlReport.html",
				"rerun:target/failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)

public class RerunRunner {

}
