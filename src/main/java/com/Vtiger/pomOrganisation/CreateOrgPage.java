package com.Vtiger.pomOrganisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateOrgPage {
	@FindBy(css="Create Organisation...")
	private WebElement createPulsbtn;
	
	@FindBy(name="accountname")
	private WebElement OrgNameTextBox;
	

	@FindBy(name="website")
	private WebElement WebsiteTextBox;
	
	@FindBy(name="tickersymbol")
	private WebElement TickerTextBox;
	 
    @FindBy(name="button")
    private WebElement Savebtn;
    
    @FindBy(className ="crmbutton small cancel")
    private WebElement cancelbtn;
    public CreateOrgPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
    public WebElement getCreatePulsbtn() {
		return createPulsbtn;
	}
	public WebElement getOrgNameTextBox() {
		return OrgNameTextBox;
	}
	public WebElement getWebsiteTextBox() {
		return WebsiteTextBox;
	}
	public WebElement getTickerTextBox() {
		return TickerTextBox;
	}
	public WebElement getSavebtn() {
		return Savebtn;
	}
	public WebElement getCancelbtn() {
		return cancelbtn;
	}

	public Object getIndustryDropDown() {
		// TODO Auto-generated method stub
		return null;
	}
    
	
}
