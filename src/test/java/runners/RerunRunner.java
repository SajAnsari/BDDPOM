package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish=true,
		//features="src//test//resources//features//googlesearch.feature",
		features="@target/failed_scenarios.txt",
		glue= {"stepdefs"},
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:target/reports/HtmlReports.html",
				"usage:target/reports/UsageReport",
				"json:target/reports/JSONReport.json",
				"rerun:target/failed_scenarios.txt"
		}
		)
public class RerunRunner extends AbstractTestNGCucumberTests {

}
