package org.suborg.project.teamname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.suborg.project.teamname.utilities.CustomWaitsUtility;


/**
 * @author raiaan
 * @summary this class contains locators and actions
 * on the homepage
 *
 */
public class HomePage extends BasePage {

	@FindBy(how = How.ID, using = "at-cv-lightbox-close")
	protected WebElement popupcloselink;
	
	@FindBy(how = How.LINK_TEXT, using = "Inputjkj Forms")
	protected WebElement inputformslink;
	
	@FindBy(how = How.LINK_TEXT, using = "Simple Form Demo")
	protected WebElement simpleformdemolink;

	
	public HomePage() {
       
    }
	
	public void closeinitialpopup() {
		CustomWaitsUtility.visibilityOf(popupcloselink, 5);
		popupcloselink.click();
	}

	public void clickInputFormsDropdown() {
		CustomWaitsUtility.delay();
		inputformslink.click();
	}

	public FormsPage clickSimpleFormsLinkAndGoToFormsPage() {
		CustomWaitsUtility.delay();
		simpleformdemolink.click();
		FormsPage formspage = new FormsPage();
		return formspage;
		
	}
	
}
