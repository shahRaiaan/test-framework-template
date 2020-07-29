package org.suborg.project.teamname.runner;

import org.suborg.project.teamname.baseconfig.Driver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CucumberTestRunner {

	@BeforeClass
	public void setup() {
		Driver driver = new Driver();
	}
	
	@Test
	public void letsseeifitworks() {
		System.out.println("------------------it works-------------");
		Driver.getDriver().get("https://facebook.com");
		Driver.getDriver().quit();
	}
	
}
