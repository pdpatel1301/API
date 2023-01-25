package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Service 1\\eclipse-workspace\\AmazonBDD\\src\\test\\java\\feature", glue = {"stepDefination"}, dryRun = true, plugin = {"pretty", "html:targrt/HTMLReports"}, monochrome = true )

public class TestRunner {

}
