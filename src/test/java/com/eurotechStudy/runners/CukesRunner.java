package com.eurotechStudy.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        features = "src/test/resources/features",
        glue = "com/eurotechStudy/step_definitions",
        dryRun = false,
        tags = "@wip"                       // Before version 4  {"@wip", "@smoke"} - - and
                                              // Before version 5  "@wip, @smoke" - - or
                                            // Before version 5    {"@smoke" , "~wip"} - - and not
)
public class CukesRunner {
}
