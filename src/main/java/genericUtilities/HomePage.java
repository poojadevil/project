package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(linkText ="calendar")
	private WebElement calendarmodule;
	
	@FindBy(linkText ="Leads")
	private WebElement leadsmodule;
	
	@FindBy(linkText ="Contacts")
private WebElement contactmodule;
	
@FindBy(linkText ="Product")
private WebElement productmodule;
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public WebElement getCalendarmodule() {
	return calendarmodule;
}
public void setCalendarmodule(WebElement calendarmodule) {
	this.calendarmodule = calendarmodule;
}
public WebElement getLeadsmodule() {
	return leadsmodule;
}
public void setLeadsmodule(WebElement leadsmodule) {
	this.leadsmodule = leadsmodule;
}
public WebElement getContactmodule() {
	return contactmodule;
}
public void setContactmodule(WebElement contactmodule) {
	this.contactmodule = 
			contactmodule;
}
public WebElement getProductmodule() {
	return productmodule;
}
public void setProductmodule(WebElement productmodule) {
	this.productmodule = productmodule;
}
public WebElement getOrganisationmodule() {
	// TODO Auto-generated method stub
	return null;
}
}