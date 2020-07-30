package org.suborg.project.teamname.runner;

import org.suborg.project.teamname.baseconfig.Driver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CucumberTestRunner {

	@BeforeMethod
	public void setup() {
		 new Driver();
	}
	@AfterMethod
	public void teardown() {
		 Driver.getDriver().quit();
		 Driver.getDriver().quit();
	}
	
	@Test
	public void letsseeifitworks() {
		System.out.println("------------------it works-------------");
		Driver.getDriver().get("https://facebook.com");
		//Driver.getDriver().quit();
	}
	@Test
	public void test2() {
		System.out.println("------------------test2 works-------------");
		Driver.getDriver().get("https://facebook.com");
		//Driver.getDriver().quit();
	}
	@Test
	public void withouttag() {
		System.out.println("------------------it works-------------");
		Driver.getDriver().get("https://facebook.com");
		//Driver.getDriver().quit();
	}
	
}
