package cucumber.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.Test;

@Test(groups = {"cucumber-system"})
@CucumberOptions(features = {"src/test/java/cucumber/features/"},
        glue = {"cucumber/hooks","cucumber/stepdefinition"},
        plugin = {"html:target/cucumber-reports/cucumber-reports.html","json:target/cucumber-reports/Cucumber.json"},
        publish = true, tags = "@registerAccountOutline")
public class TestRunner extends AbstractTestNGCucumberTests {
}
