package genericUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	public static WebDriver driver;
	public static ThreadLocal<WebDriver> tr = new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver()
	{
		return tr.get();
	}
	public static void setDriver( WebDriver Driver)
	{
		tr.set(Driver);
	}
	public static void removeDriver()
	{
		tr.remove();
	}
	
	public void launchBrowser(String browser)throws Throwable
	{
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			Driver.setDriver(driver);
		}
		else if(browser.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			Driver.setDriver(driver);
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			Driver.setDriver(driver);
		}
		else
		{
			throw new Exception("Check the browser Launch");
			
		}
	
		
	}

}
