package com.vtiger.Runner;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@io.cucumber.junit.CucumberOptions(
		features = "src/test/resources/Features/",
		glue="com.vtiger.stepdefinitions",
		//plugin = { "pretty", "html:target/cucumber-reports.html" }
		plugin = { "pretty", "json:target/Cucumber.json" }
		//,dryRun=true
		//,tags="@test"	
		)
public class TestRunner {

}
