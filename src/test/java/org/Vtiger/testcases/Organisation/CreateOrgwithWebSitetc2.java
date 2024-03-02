package org.Vtiger.testcases.Organisation;

import org.testng.Reporter;

import com.Vtiger.pomOrganisation.CreateOrgPage;
import com.Vtiger.pomOrganisation.OrgPage;

import genericUtilities.BaseClass;
import genericUtilities.ExcelUtility;
import genericUtilities.HomePage;
import genericUtilities.Iconstant;
import genericUtilities.JavaUtility;

public class CreateOrgwithWebSitetc2 extends BaseClass
{
public void createwithmultipleElements() 
{
	hp=new HomePage(driver);
	op=new OrgPage(driver);
	cop=new CreateOrgPage(driver);
	ju=new  JavaUtility();
	eu=new  ExcelUtility();
	op.getCreateorgPlusBtn().click();
	cop.getOrgNameTextBox().sendKeys(eu.fetchSingleData(Iconstant.pathEcxcel,"Org",1,3)+ju.randomNumberGenerate(1000));
	cop.getWebsiteTextBox().sendKeys(eu.fetchSingleData(Iconstant.pathExcel,"Org",4,4)+ju.randomNumberGenerate(1000));
	 
	cop.getSavebtn().click();
	String actData="-"+"  Organization Information";
	String expData=cop.getCreateOrgValidation().getText();
	System.out.println(actData);
	System.out.println(expData);
	{
		if(expData.contains(actData))
		{
			Reporter.log("Organisation created successfull", true);	
		}
	else
	{
		Reporter.log("Please check the actData", true);
	}
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

