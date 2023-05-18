package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features/scenarioOutline.feature"},
        glue = {"stepdefinitions","Hooks"}
)

public class HookRunner {



}
