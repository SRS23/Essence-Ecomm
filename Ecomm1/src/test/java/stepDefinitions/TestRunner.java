package stepDefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src\\test\\java\\featureResources\\EssenceEcomm.feature",
		glue= "stepDefinitions",
		plugin="html:target/JunitHtmlReports/report.html"
		)

public class TestRunner {

}
