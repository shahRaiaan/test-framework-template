package org.suborg.project.teamname.runner;

import java.net.MalformedURLException;

import org.suborg.project.teamname.baseconfig.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, plugin = { "pretty", "json:target/cucumber.json",
		"html:target/site/cucumber-pretty" }, features = { "src/test/resources/features" }, glue = {
				"org.suborg.project.teamname.stepdefinition" }, dryRun = false, tags = { "@DemoFeature1" })
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

	@BeforeSuite
	public void beforealltestonceonly() {
		System.out.println("before all trest once---------------------------");
	}
 
	@AfterSuite
	public void afteralltestonceonly() {
		System.out.println("after all trest once---------------------------");
	}
	@BeforeMethod
	public void setup() throws MalformedURLException {
		new Driver(); //test -Dcucumber.options="--tags '@tag1'"
		
		
	}
	
	@AfterMethod
	public void teardown() {
		Driver.getDriver().quit();

	}




}
