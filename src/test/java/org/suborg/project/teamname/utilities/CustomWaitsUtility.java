package org.suborg.project.teamname.utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.suborg.project.teamname.baseconfig.Driver;

public class CustomWaitsUtility {
	private static long executionspeedslowdown = 1L;

	private static Logger logger = LoggerFactory.getLogger(CustomWaitsUtility.class);

	public static void delay() {

		TimeUnit time = TimeUnit.SECONDS;
		try {
			time.sleep(executionspeedslowdown);
			logger.debug("Execution speed set to - " + executionspeedslowdown);
		}

		catch (InterruptedException e) {
			e.printStackTrace();
			logger.debug("Interrupted " + "while Sleeping");
		}

	}

	public static WebElement visibilityOf(WebElement webelement, int timeout) {
		WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.visibilityOf(webelement));

	}

}
