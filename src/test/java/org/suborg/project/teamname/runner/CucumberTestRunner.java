package org.suborg.project.teamname.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(monochrome = true, plugin = { "pretty", "json:target/cucumber.json", "json:target/cucumber.json",
		"html:target/site/cucumber-pretty" }, features = { "src/test/resources/features" }, glue = {
				"org.suborg.project.teamname.stepdefinition" }, dryRun = false, tags = { "@DemoFeature1" })
public class CucumberTestRunner extends AbstractTestNGCucumberTests {

//	@BeforeSuite
//	public void beforealltestonceonly() {
//		System.out.println("before all trest once---------------------------");
//	}
// "json:target/cucumber.json","html:target/site/cucumber-pretty"
//	@AfterSuite
//	public void afteralltestonceonly() {
//		System.out.println("after all trest once---------------------------");
//	}
//	@BeforeMethod
//	public void setup() {
//		new Driver(); //test -Dcucumber.options="--tags '@tag1'"
//		System.out.println("Does it still work");
//		
//	}
//	
//	
//	
//	@AfterMethod
//	public void teardown() {
//		Driver.getDriver().quit();
//
//	}

//	@Test
//	public void letsseeifitworks() {
//		System.out.println("------------------it works-------------");
//		System.out.println("The system variable headless is ----  " + System.getProperty("headless"));
//		// Driver.getDriver().get(ApplicationConstants.URL_HOMEPAGE);
//	}
//
//	@Test
//	public void test2() {
//		System.out.println("------------------test2 works-------------");
//		// Driver.getDriver().get("https://facebook.com");
//
//	}
//
//	@Test
//	public void withouttag() throws InterruptedException {
//		System.out.println("------------------it works-------------");
//		Driver.getDriver().get(ApplicationConstants.URL_HOMEPAGE);
//		HomePage homepage = new HomePage();
//		homepage.closeinitialpopup();
//		homepage.clickInputFormsDropdown();
//		FormsPage formspage = homepage.clickSimpleFormsLinkAndGoToFormsPage();
//		formspage.enterusermessage("this is demo message");
//
//	}

}
