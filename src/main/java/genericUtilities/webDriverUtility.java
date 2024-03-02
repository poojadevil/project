package genericUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

/**
 * 
 * @param Driver HP
 * This class will store all the selenium WebDriver 
 * Syntax
 * 
 */

public class webDriverUtility {
	/**
	 * This method is used to open the Application
	 * 
	 * @param Driver here we need to pass ID od webPage
	 * @param url provide url of webApplication
	 * 
	 */
	public void getApplication(WebDriver driver,String url)
	{
	/**
	 * This method is used to open the Appilcation with Navigate
	 *  
	 *  @param driver here we need to pass ID of Webpage
	 *  @param url provide url of application
	 * 
	 */
	}
	//public void getApplicationNavigateWebDriver driver, String url()
	{
		WebDriver driver;
	//	driver.navigate().to();
	}
	/**
	 *  This method is used to refresh the Webpage
	 * @param driver Id of WebPag
	 * @param Driver is the ID of WebPage
	 * 
	 */
public void refreshWebPage1(WebDriver driver)
{
	driver.navigate().refresh();
}
/**
 *  This method is used to forward the Webpage
 * @param driver Id of WebPage
 * @param the title if the webPage	
 */

public void ForwardWebPage(WebDriver driver)
{
driver.navigate().forward();
}
/**
 *  This method is used to Backward the Webpage
 * @param driver Id of WebPage
 * @param the title if the webPage	
 */
public void BackwardWebPage(WebDriver driver)
{
driver.navigate().back();
}
/**
 * This method is used Check the Checkbox
 * @param ele will fetch the address
 * @return type is boolean
 * 
 */
public boolean checkCheckBox(WebElement ele)
{
	return ele.isSelected();
}
/**
 * 
 * 
 *   
 */
public String fetchAttributeValue(WebElement ele, String attName)
{
	return ele.getAttribute(attName);
}
/**
 * 
 * 
 * 
 */
public void rightClick(WebDriver driver,WebElement ele)
{
	Actions act = new Actions(driver);
	act.contextClick(ele).perform();
}
/**
 * 
 * 
 * 
 */
public void doubleClick(WebDriver driver,WebElement ele)
{
	Actions act = new Actions(driver);
	act.doubleClick(ele).perform();	
}
/**
 * 
 * 
 * 
 */
public void moveTheCursor(WebDriver driver, WebElement ele)
{
	Actions act = new Actions(driver);
	act.moveToElement(ele).perform();
}
/**
 * 
 * 
 * 
 */
public void takeScreenShot(WebDriver driver,String path)throws IOException

{
	TakeScreenShot sh= (TakeScreenShot)driver;
	File src = sh.getScreenshotAs(OutputType.FILE);
	File dist = new File(path);
	Files.copy(src, dist);
}
/**
 * 
 * 
 * 
 */
public void implicitwait(WebDriver driver, int timeUnit)
{
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeUnit));
}
/**
 * 
 * 
 * 
 */
public void maximize(WebDriver driver)
{
	driver.manage().window().maximize();
}
/**
 * 
 * 
 * 
 */
public void minimize(WebDriver driver)
{
	driver.manage().window().minimize();
}
/**
 * 
 * 
 * 
 */
public void explicitWaitForVisibility(WebDriver driver, int timeUnit,By b)
{
	WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(timeUnit));
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(b));	
}
/**
 * 
 * 
 * 
 */
public void frameHandleByIndex(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
/**
 * 
 * 
 * 
 */
public void frameHandleByWebElement(WebDriver driver,int index)
{
	driver.switchTo().frame(index);
}
public void  switchWindow(WebDriver driver,String title)
{
	Set<String> allID= driver.getWindowHandles();
	for(String i:allID)
	{
		String i1;
		String currTitle= driver.switchTo().window(i).getTitle();
				if(title.contains(currTitle))
				{
					break;
				}	
				}	
				}
public String excelFetch(String path, String shName,int row,int cell)throws IOException				
{
	DataFormatter df= new DataFormatter();
	FileInputStream fis= new FileInputStream(path);
	Workbook book = WorkbookFactory.create(fis);
	return df.formatCellValue(book.getSheet(shName).getRow(row).getCell(cell));
}
public void drpdwnbyslctclvisibletext(WebDriver driver, WebElement ele,String value)
{
	Select s=new Select(ele);
	String text = null;
	s.selectByVisibleText(text);
}

public void drpdwnbyslcbyValue(WebDriver driver, WebElement ele,String value)
{
	Select s= new Select(ele);
	String text = null;
	s.selectByVisibleText(text);
}

{
	WebElement ele = null;
	Select s=new Select(ele);
	String text = null;
	s.selectByVisibleText(text);
}

public void drpdwnbyslcbyIndex(WebDriver driver, WebElement ele,int num)
{
	Select s= new Select(ele);
	String text;
	s.deselectByIndex(num);
}

public void drpdwnbydeSelectall(WebDriver driver, WebElement ele)
{
	Select s= new Select(ele);
	String text;
	s.deselectAll();
}

public void drpdwnbydeslcvisibletext(WebDriver driver, WebElement ele,String value)
{
	Select s= new Select(ele);
	String text;
	s.selectByVisibleText(text);
}

public void drpdwnbydeslcbyValue(WebDriver driver, WebElement ele,String value)
{
	Select s= new Select(ele);
	String text;
	s.deselectByValue(value);
}

public void alertok(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.accept();
}

public void alertcancel(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.dismiss();
}

public void alertFetchMSG(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	alt.getText();

}

public void alertWritedata(WebDriver driver)
{
	Alert alt=driver.switchTo().alert();
	String s = null;
	alt.sendKeys(s);

}
}
					
					
					
					
					
					
					
					
					
			
	


