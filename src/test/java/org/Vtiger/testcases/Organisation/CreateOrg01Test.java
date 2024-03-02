package org.Vtiger.testcases.Organisation;

import org.testng.annotations.Test;

import com.Vtiger.pomOrganisation.CreateOrgPage;
import com.Vtiger.pomOrganisation.OrgPage;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.HomePage;
import genericUtilities.Iconstant;
import genericUtilities.JavaUtility;

public class CreateOrg01Test extends BaseClass
{
	@Test
	public void CreateOrg01()throws Throwable
	{
		hp=new HomePage(driver);
		op=new OrgPage(driver);
		cop=new CreateOrgPage(driver);
		ju=new  JavaUtility();
		eu=new  ExcelUtility();
		op.getCreateorgPlusBtn();
		cop.getOrgNameTextBox().sendKeys(eu.fetchSingleData(Iconstant./src/test/resources/sheet.xlsx,"org", 1,3)+ju.randomNumberGenerate(1000));
		
		cop.getSavebtn().click();


	}
	

}
