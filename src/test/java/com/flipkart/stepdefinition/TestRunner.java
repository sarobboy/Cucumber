package com.flipkart.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//resources//Features",
                 glue = "com.flipkart.stepdefinition",
                 plugin = "html:target",
                 monochrome = true ,
                 dryRun = true ,
                 tags = {"@smoke","@sanity"})



public class TestRunner {

}
