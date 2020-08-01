package org.suborg.project.teamname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.suborg.project.teamname.baseconfig.Driver;

/**
 * @author raiaan
 * 
 * @summary this class contains all the common elements found in all or almost
 *          all pages in the AUT. It is most likely to contain elements in the
 *          headers and footers. This class should also contain the methods
 *          related exclusively to these elements.
 * 
 * 
 *          usage - any new page class that contains these elements should
 *          extend this class
 */

public abstract class BasePage {
	//protected WebDriver driver = Driver.getDriver();
	private static final int TIMEOUT = 5;
	private static final int POLLING = 100;

	@FindBy(how = How.ID, using = "easycont")
	protected WebElement sidenav;

	public BasePage() {
		PageFactory.initElements(new AjaxElementLocatorFactory(Driver.getDriver(), TIMEOUT), this);
	}
}
