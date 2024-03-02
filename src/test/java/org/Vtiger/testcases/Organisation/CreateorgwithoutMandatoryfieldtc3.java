 package org.Vtiger.testcases.Organisation;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Vtiger.pomOrganisation.CreateOrgPage;
import com.Vtiger.pomOrganisation.OrgPage;

import genericUtilities.BaseClass;
import genericUtilities.Driver;
import genericUtilities.ExcelUtility;
import genericUtilities.HomePage;
import genericUtilities.Iconstant;
import genericUtilities.JavaUtility;

public class CreateorgwithoutMandatoryfieldtc3 extends BaseClass {
	@Test
	public void CreatewithoutMandatoryfield()
	{
		hp=new HomePage(Driver.driver);
		op=new OrgPage(Driver.driver);
		cop=new CreateOrgPage(Driver.driver);
		ju=new JavaUtility();
		eu=new ExcelUtility();
		op.getOrgPlusBtn().click();
		cop.getOrgNameTextBox().sendKeys(eu.fetchSingleData(Iconstant./src/test/resources/sheet.xls,"Org",1,3)+ju.randomNumberGenerate(1000));
		cop.getOrgNameTextBox().sendKeys(eu.fetchSingleData(Iconstant./src/test/resources/sheet.xlsx,"Org",4,4)+ju.randomNumberGenerate(1000));
		String actData=wd.AlertFetch(driver);
		String expData="Organization Name cannot be empty";
		wd.AlertOk(driver);
		Assert.assertEquals(actData, expData);
		Assert.log("Organisation pages not created withoutMandatory fields",true);
	}

}
