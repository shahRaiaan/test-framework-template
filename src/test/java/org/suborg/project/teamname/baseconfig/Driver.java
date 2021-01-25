package org.suborg.project.teamname.baseconfig;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Driver {
	private static Logger logger = LoggerFactory.getLogger(Driver.class);
	private static String headless = System.getProperty("headless");
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	int defaultimplicitwaittime = 15;
	int executionslowdowntime = 6;
	int pageloadtimeout = 10;


	public static WebDriver getDriver() {
		return driver.get();
	}

	public Driver(String browserName) {

		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();

			if ("true".equals(headless)) {
				options.addArguments("--headless");
				logger.info("chrome browser running with headless mode on");
			} else {
				logger.debug("chrome browser running with headless mode off");
			}

			String chromedriverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			driver.set(new ChromeDriver(options));
			driver.get().manage().timeouts().implicitlyWait(defaultimplicitwaittime, TimeUnit.SECONDS);
			driver.get().manage().timeouts().pageLoadTimeout(pageloadtimeout, TimeUnit.SECONDS);
			

		}

		else if (browserName.equalsIgnoreCase("firefox")) {
			String firefoxdriverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";
			System.setProperty("webdriver.gecko.driver", firefoxdriverpath);
			FirefoxOptions options = new FirefoxOptions();
			driver.set(new FirefoxDriver(options));

		}

		else if (browserName.equalsIgnoreCase("ie")) {

		} else if (browserName.equalsIgnoreCase("remote")) {
			// in future modify maven with sytemvariables (remote browser-name,
			// browser-version, platform-name)
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setBrowserName("chrome");
			// dc.setPlatform(Platform.WIN10);
			try {
				driver.set(new RemoteWebDriver(new URL(ApplicationConstants.URL_SELENIUMGRID_HUB), dc));
			} catch (MalformedURLException e) {
				logger.debug("----malformed hub ip address entered, check the ip address---");
				e.printStackTrace();
			}
		}

		else {
			logger.debug("Unknown browser name specified in the system variable");
		}

	}

}
