package org.suborg.project.teamname.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * @author raiaan
 * @summary this class contains locators and actions
 * on the formspage
 *
 */
public class FormsPage extends BasePage {

	@FindBy(how = How.ID, using = "user-message")
	protected WebElement entermessageplaceholder;
	
	
	public FormsPage() {
        
    }


	public void enterusermessage(String usermessage) {
		entermessageplaceholder.sendKeys(usermessage);
		
	}
}
