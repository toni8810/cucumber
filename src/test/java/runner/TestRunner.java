package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/feature/Login.feature"},
        format = {"json:target/report.json", "html:target/report"},
        glue = {"steps"})
public class TestRunner extends AbstractTestNGCucumberTests {
}
