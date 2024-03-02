package com.Vtiger.pomOrganisation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrgPage {
@FindBy(css="Create Organisation...")
private  WebElement createorg;
@FindBy(name="'search_text")
private WebElement SearchTextbox;
@FindBy(id="bas_searchfield")
private WebElement SearchDropDown;
@FindBy(name="submit")
private WebElement SearchBox;
public OrgPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getCreateorg() {
	return createorg;
}
public WebElement getSearchTextbox() {
	return SearchTextbox;
}
public WebElement getSearchDropDown() {
	return SearchDropDown;
}
public WebElement getSearchBox() {
	return SearchBox;
}
}
