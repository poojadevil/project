package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.Vtiger.pomOrganisation.CreateOrgPage;
import com.Vtiger.pomOrganisation.OrgPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public ChromeDriver driver;
	public webDriverUtility wd;
	public PropertyUtility  pu;
	public LoginPage lp;
	public HomePage hp;
	public OrgPage op;
	public CreateOrgPage cop;
	public JavaUtility ju;
	public ExcelUtility eu;
	
	@BeforeSuite
	public void JDBC_Connected()
	{
		Reporter.log( " JDBC Connected");
		
	}
	@BeforeClass
	public void setUP()throws Throwable
	{
		wd= new webDriverUtility();
		pu= new PropertyUtility();
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver= new Driver;
		wd.implicitwait(driver, 10);
		wd.maximize(driver);
		wd.getApplication(driver,pu.propertyFetch("url"));
		
	}
	@BeforeMethod
	public void login()throws Throwable
	{
     lp=new LoginPage(driver);
     pu=new PropertyUtility();
	}
	@Test
	public void demo()
	{
		

	}
	
 
	
		

	


}
