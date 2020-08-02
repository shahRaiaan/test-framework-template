package org.suborg.project.teamname.runner;

import org.openqa.selenium.By;
import org.suborg.project.teamname.baseconfig.ApplicationConstants;
import org.suborg.project.teamname.baseconfig.Driver;
import org.suborg.project.teamname.pages.FormsPage;
import org.suborg.project.teamname.pages.HomePage;
import org.testng.annotations.AfterMethod;
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
		 
	}
	
	@Test
	public void letsseeifitworks() {
		System.out.println("------------------it works-------------");
		System.out.println("The system variable headless is ----  "+System.getProperty("headless"));
		//Driver.getDriver().get(ApplicationConstants.URL_HOMEPAGE);
		
		
	}
	@Test
	public void test2() {
		System.out.println("------------------test2 works-------------");
		//Driver.getDriver().get("https://facebook.com");
		
	}
	@Test
	public void withouttag() throws InterruptedException {
		System.out.println("------------------it works-------------");
		Driver.getDriver().get(ApplicationConstants.URL_HOMEPAGE);
		HomePage homepage = new HomePage();
		homepage.closeinitialpopup();
		homepage.clickInputFormsDropdown();
		FormsPage formspage=homepage.clickSimpleFormsLinkAndGoToFormsPage();
		formspage.enterusermessage("this is demo message");
		
	
	}
	
}
