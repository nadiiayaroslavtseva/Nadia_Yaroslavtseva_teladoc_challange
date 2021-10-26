package com.teladoc.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features ="src/test/rerun.txt", // we are copying the content root
        glue = "com/teladoc/step_definitions" // we are copying the source root
)

public class FailedScenario {
}
