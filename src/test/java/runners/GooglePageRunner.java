package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//runner will first read feature file and will go step by step in matching each feature with the corresponding step definition.
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true,
		plugin = { "pretty",
//				"usage:target/reports/usageReport",
//				"json:target/reports/jsonReport.json",
//				"junit:target/reports/junitReport.xml",
				"html:target/reports/htmlReport.html",
				"rerun:target/failed_scenarios.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
		}
		)
public class GooglePageRunner {
	
	

}