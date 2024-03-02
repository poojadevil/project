package org.Vtiger.testcases.Organisation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Vtiger.pomOrganisation.CreateOrgPage;
import com.Vtiger.pomOrganisation.OrgPage;

import genericUtilities.BaseClass;
import genericUtilities.Driver;
import genericUtilities.ExcelUtility;
import genericUtilities.HomePage;
import genericUtilities.Iconstant;
import genericUtilities.JavaUtility;
import genericUtilities.webDriverUtility;

public class MultipleDataCreateOrg05Test extends BaseClass {
	@DataProvider(name="Org")
	public Object OrgDataProvider()throws Throwable
	{
		DataFormatter df=new DataFormatter();
		FileInputStream fis = new FileInputStream(Iconstant"./src/test/resources/sheet.xlsx	");
		Workbook book= WorkbookFactory.create(fis);
		Sheet sh= book.getSheet("DataProviderOrg");
		Object[][]obj=new Object[3][4];
		for (int i=1;i<4;i++)
		{
			for (int j=0;j<4;j++)
			{
				obj[i-1][j]= df.formatCellValue(sh.getRow(i).getCell(j));
				
			}
		}
		return obj;
	}
	@Test(dataProvider="Org")
	 public void fillData(String name,String web,String tic,String emp)
	 {
	System.out.println(name+" "+web+" "+tic+" "+emp);
	hp=new HomePage(Driver.driver);
	op=new OrgPage(Driver.driver);
	cop=new CreateOrgPage(Driver.driver);
	ju=new JavaUtility();
	eu=new ExcelUtility();
	wd=new webDriverUtility();
	hp.getOrganisationmodule().click();
	op.getCreateorg().click();
	cop.getOrgNameTextBox().sendKeys(name+ju.randomNumberGenerate(10000));
	cop.getWebsiteTextBox().sendKeys(web);
	cop.getTickerTextBox().sendKeys(tic);
	cop.getSavebtn().click();
	 }

	
	
	
	
	 }



