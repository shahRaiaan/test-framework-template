package org.suborg.project.teamname.runner;

import java.net.MalformedURLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.suborg.project.teamname.baseconfig.ApplicationConstants;
import org.suborg.project.teamname.baseconfig.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, plugin = { "pretty", "json:target/cucumber.json",
		"html:target/site/cucumber-pretty" }, features = { "src/test/resources/features" }, glue = {
				"org.suborg.project.teamname.stepdefinition" }, dryRun = false, tags = { "@DemoFeature1" })
public class CucumberTestRunner extends AbstractTestNGCucumberTests {
	private static Logger logger = LoggerFactory.getLogger(CucumberTestRunner.class);

	@BeforeMethod
	public void setup() throws MalformedURLException {
		logger.debug("--------------setup iniated for the test-------------------");
		String browserName = System.getProperty("browser");

		if (browserName.equals(ApplicationConstants.BRWOSER_CHROME)) {
			new Driver(ApplicationConstants.BRWOSER_CHROME);
		} else if (browserName.equals(ApplicationConstants.BRWOSER_FIREFOX)) {
			new Driver(ApplicationConstants.BRWOSER_FIREFOX);
		} else {
			new Driver(ApplicationConstants.BRWOSER_CHROME);// default
		}
		logger.debug("--------------setup completed. ready for test execution-------");
	}

	@AfterMethod
	public void teardown() {
		Driver.getDriver().quit();
		logger.debug("--------------teardown() completed -------------------");
	}

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}
}
