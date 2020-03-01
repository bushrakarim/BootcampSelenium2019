package letsKodeitRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features={"src/test/java/letsKodeItFeature"},
        glue={"stepDefinition"},
        plugin={"pretty","json:target/cucumber-reports/cucumber.jason"},
        strict = true,
        monochrome = true,
        tags={}
)
public class cucumberRunner extends AbstractTestNGCucumberTests {



}
