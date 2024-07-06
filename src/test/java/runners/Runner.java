package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features", // path of the feature files
        glue = "stepdefinitions" // path of the step definitions
)
public class Runner {
}

/*
Runner class is used to run the feature files
Runner has path of the feature files
Runner has path of the step definitions
Runner has tags
Runner has report plugins and other plug ins
-----------------------------
@RunWith(Cucumber.class) makes this java class runnable
@CucumberOptions is used to add the settings such as path of features & step definitions, reports plugins,...
features is used for the path of features
glue is used for the path of step definitions
 */