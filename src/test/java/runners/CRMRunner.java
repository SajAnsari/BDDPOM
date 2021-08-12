package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		publish=true,
		features="src//test//resources//features//CRMLoginfeature.feature",
		glue= {"stepdefs"},
		monochrome=true,
		plugin= {"html:target/reports/CRMReport.html"}
		)
public class CRMRunner extends AbstractTestNGCucumberTests{

}
