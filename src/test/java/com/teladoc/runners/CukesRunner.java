package com.teladoc.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",
                "json:target/cucumber.json",
                "rerun:target/rerun.txt"
        },

            features ="src/test/resources/feature", // we are copying the content root
            glue = "com/teladoc/step_definitions", // we are copying the source root
            dryRun = false,
            tags = ""
)

public class CukesRunner {


}
