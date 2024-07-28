package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith (Cucumber.class)
	@CucumberOptions(
			features = { "src/test/resources/Feature/Home.feature",
			"src/test/resources/Feature/Maisonconnectee.feature",
			"src/test/resources/Feature/Panier.feature",
			},
			glue="TestSuite",
					
	plugin = {"pretty","html:target/cucumber-report.html"}
	)


	public class Runner {
		
	}
