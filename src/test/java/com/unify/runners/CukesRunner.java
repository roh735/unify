package com.unify.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "rerun:target/rerun.txt", // store failed scenarios
                "json:target/cucumber.json"
        },
        features = "src/test/resources/features/",
        glue = "com/affiniPay/step_definitions/",
        dryRun = false,
        tags = "@ui"
)

public class CukesRunner {
}
