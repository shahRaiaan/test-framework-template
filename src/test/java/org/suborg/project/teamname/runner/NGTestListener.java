package org.suborg.project.teamname.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

/**
 * @author raiaan listener for the CucumberTestRunner for good explanation on
 *         testng listeners use the following url -
 *         https://blog.trigent.com/how-to-use-listeners-of-testng-to-generate-test-logs#
 */
public class NGTestListener implements ITestListener{
	private static Logger logger = LoggerFactory.getLogger(NGTestListener.class);

	@Override
	public void onStart(ITestContext iTestContext) {// same as @BeforeSuite
		logger.info("--------resource initialization for all tests completed-----------------------");
	}

	@Override
	public void onFinish(ITestContext iTestContext) {// same as @AfterSuite
		logger.info("--------entire test suite execution is completed-----------------------");
	}

	@Override
	public void onTestStart(ITestResult iTestResult) {
		logger.info("On test start--------------starting test-------------------");
		
	}

	@Override
	public void onTestSuccess(ITestResult iTestResult) {
		logger.info("--The test was successful--");
	}

	@Override
	public void onTestFailure(ITestResult iTestResult) {
		logger.info("--The test failed--");
	}

	@Override
	public void onTestSkipped(ITestResult iTestResult) {
		logger.info("--The test was skipped--");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
	
	}
	

}
