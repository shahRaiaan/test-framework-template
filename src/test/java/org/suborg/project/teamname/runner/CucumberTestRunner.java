package org.suborg.project.teamname.runner;

import java.net.MalformedURLException;

import org.suborg.project.teamname.baseconfig.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, plugin = { "pretty", "json:target/cucumber.json", "json:target/cucumber.json",
		"html:target/site/cucumber-pretty" }, features = { "src/test/resources/features" }, glue = {
				"org.suborg.project.teamname.stepdefinition" }, dryRun = false, tags = { "@DemoFeature1" })
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

@BeforeMethod
public void setup() throws MalformedURLException {
		new Driver(); //test -Dcucumber.options="--tags '@tag1'"
		System.out.println("Does it still work");
		
	}
	
	
	
	@AfterMethod
	public void teardown() {
		Driver.getDriver().quit();

	}



}
