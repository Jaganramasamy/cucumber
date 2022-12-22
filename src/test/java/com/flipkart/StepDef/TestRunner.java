package com.flipkart.StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Admin\\workspace\\New\\cucumber\\src\\test\\resources\\Feature",
glue="com.flipkart.StepDef",
plugin="html:target/report/report.html",
monochrome=true,
dryRun= false,tags= "@smoke")

public class TestRunner {


}
