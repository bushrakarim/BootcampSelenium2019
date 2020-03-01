package googleRunner;

import googlestepdefinition.GoogleStepDefinition;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions (
        features = {"src/test/java/googlefeature"},
        glue = {"GoogleStepDefinition"},
        plugin = {"pretty","json:target/cucumber-reports/cucumber.json"},
        strict = true,
        monochrome=true,
        tags={}
        )
public class GoogleRunner extends AbstractTestNGCucumberTests {

}
