package org.suborg.project.teamname.baseconfig;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Driver implements WebDriver {

	private static String browserName = System.getProperty("browser");
	private static WebDriver driver;

	public Driver() {
	

		if (browserName.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			
			String chromedriverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver";
			System.setProperty("webdriver.chrome.driver", chromedriverpath);
			Driver.driver = new ChromeDriver(options);
		}

		if (browserName.equalsIgnoreCase("firefox")) {
			String firefoxdriverpath = System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver";
			System.setProperty("webdriver.gecko.driver", firefoxdriverpath);
			Driver.driver = new FirefoxDriver();
		}

		if (browserName.equalsIgnoreCase("ie"))
			Driver.driver = new InternetExplorerDriver();
		{

		}

	}

	@Override
	public void get(String url) {
		Driver.driver.get(url);

	}

	@Override
	public String getCurrentUrl() {
		return Driver.driver.getCurrentUrl();
	}

	@Override
	public String getTitle() {

		return Driver.driver.getTitle();
	}

	@Override
	public List<WebElement> findElements(By by) {

		return Driver.driver.findElements(by);
	}

	@Override
	public WebElement findElement(By by) {
		return Driver.driver.findElement(by);
	}

	@Override
	public String getPageSource() {
		return Driver.driver.getPageSource();
	}

	@Override
	public void close() {
		Driver.driver.close();

	}

	@Override
	public void quit() {
		Driver.driver.quit();
	}

	@Override
	public Set<String> getWindowHandles() {
		return Driver.driver.getWindowHandles();
	}

	@Override
	public String getWindowHandle() {
		return Driver.driver.getWindowHandle();
	}

	@Override
	public TargetLocator switchTo() {
		return Driver.driver.switchTo();
	}

	@Override
	public Navigation navigate() {
		return Driver.driver.navigate();
	}

	@Override
	public Options manage() {
		return Driver.driver.manage();
	}

	public static WebDriver getDriver() {
		return driver;
	}
}
