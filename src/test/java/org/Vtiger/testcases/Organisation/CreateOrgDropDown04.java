package org.Vtiger.testcases.Organisation;

import org.testng.annotations.Test;

import com.Vtiger.pomOrganisation.CreateOrgPage;
import com.Vtiger.pomOrganisation.OrgPage;

import genericUtilities.BaseClass;
import genericUtilities.Driver;
import genericUtilities.ExcelUtility;
import genericUtilities.HomePage;
import genericUtilities.Iconstant;
import genericUtilities.JavaUtility;

public class CreateOrgDropDown04 extends BaseClass {
	@Test
	public void CreateOrgDropDown()throws Throwable 
	{
		hp=new HomePage(Driver,driver);
		op=new OrgPage(Driver.driver);
		cop=new CreateOrgPage(Driver.driver);
		ju=new JavaUtility();
		eu=new ExcelUtility();
		op.getCreateorgPlusBtn().click();
		cop.getOrgNameTextBox().sendKeys(eu.fetchSingleData(Iconstant.pathExcel,"Org",1,3)+ju.randomNumberGenerate(1000));
		cop.getWebsiteTextBox().sendKeys(eu.fetchSingleData(Iconstant.pathExcel,"Org",4,4)+ju.randomNumberGenerate(1000));
		wd.DropDownBySelect(driver,cop.getIndustryDropDown());
		
		
	
	
	
	

}
}