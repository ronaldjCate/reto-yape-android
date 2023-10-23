package com.bdd.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:targe/build/cucumber.json"},
        features = {"src/test/resources/"},
        glue = "com.bdd.stepdefinition",
        tags = "@IngresaraBooking"
)
public class RunnerTest {
}
