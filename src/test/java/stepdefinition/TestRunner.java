package stepdefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"stepdefinition"},
        monochrome = true,
        plugin = {"pretty", "html:target/htmlReports/report.html",
                "json:target/jsonReports/report.json",
                "junit:target/JUnitReports/report.xml"
        }
)
public class TestRunner {
}
