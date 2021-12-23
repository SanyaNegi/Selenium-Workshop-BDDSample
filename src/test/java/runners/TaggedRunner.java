package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
//runner will first read feature file and will go step by step in matching each feature with the corresponding step definition.
@CucumberOptions(
		publish = true,
		features = "src//test//resources//taggedFeatures//ModuleTwo.feature",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true
		//tags="@RegressionTest",
		//tags="@SmokeTest",
		//tags="@RegressionTest or @SmokeTest",
		//tags= "@RegressionTest and @SmokeTest",
		//tags= "not @RegressionTest and not @SmokeTest"
		
		//tags= "@PhaseOne or @RegressionTest"
		//tags="@PhaseOne and RegressionTest or @SmokeTest"
		//tags="@RegressionTest and not @PhaseOne"
		//tags= "@PhaseOne and @RegressionTest or@PhaseTwo and @SmokeTest"
		)

public class TaggedRunner {

}
