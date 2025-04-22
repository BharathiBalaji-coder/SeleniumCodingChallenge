package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/Features",
        glue = {"Steps"},
        tags = " @smoke",
        plugin = {"pretty", "html:target/htmlreport/cucumber.html", "json:target/json-report/cucumber.json","junit:target/junit-report/report.xml"
        },
        monochrome = true,
        publish = true
)
public class TestRunner {


}
