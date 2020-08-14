package org.suborg.project.teamname.stepdefinition;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.suborg.project.teamname.baseconfig.ApplicationConstants;
import org.suborg.project.teamname.baseconfig.Driver;
import org.suborg.project.teamname.pages.FormsPage;
import org.suborg.project.teamname.pages.HomePage;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoFeature1Step {
	private static Logger logger = LoggerFactory.getLogger(DemoFeature1Step.class);

	@Given("^_1df1 I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
		logger.info("Writing step with precondition");
	}

	@And("^_1df1 some other precondition")
	public void some_other_precondition() {
		logger.info("Writing step with some other precondition");
		Driver.getDriver().get(ApplicationConstants.URL_HOMEPAGE);
		HomePage homepage = new HomePage();
		homepage.closeinitialpopup();
		homepage.clickInputFormsDropdown();
		FormsPage formspage = homepage.clickSimpleFormsLinkAndGoToFormsPage();
		formspage.enterusermessage("this is demo message");
	}

	@When("^_1df1 I complete action")
	public void i_complete_action() {
		logger.info("completing the action right now");
	}

	@And("^_1df1 some other action")
	public void some_other_action() {
		logger.info("completing some other action");
	}

	@And("^_1df1 yet another action")
	public void yet_another_action() {
		logger.info("completing yet another action");
		
		Assert.assertFalse(true);
	}

	@Then("^_1df1 I validate the outcomes")
	public void i_validate_the_outcomes() {
		logger.info("validating the outcomes");
	}

	@And("^_1df1 check more outcomes")
	public void check_more_outcomes() {
		logger.info("validating more outcomes");
	}

	
	
	
	
	@Given("^_2df1 I want to write a step with (.+)$")
	public void _2_i_want_to_write_a_step_with_name1(String name) {
		logger.info("writing a step with the name - " + name);
	}

	@When("^_2df1 I check for the (.+) in step$")
	public void _2i_check_for_the_in_step(String value) throws Throwable {
		logger.info("checking for the value - " + value);
	}

	@Then("^_2df1 I verify the (.+) in step$")
	public void i_verify_the_in_step(String status) throws Throwable {
		logger.info("verifying the status in  step as - " + status);
	}
}
