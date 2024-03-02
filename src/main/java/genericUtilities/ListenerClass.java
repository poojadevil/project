package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerClass implements ITestListener {

	ExtentReports er;
	ExtentTest test;
	ExtentSparkReporter esr;
	
	public void onTestStart(ITestResult result) {
	String methodName=result.getName();
	
	test= er.createTest(methodName);
	Reporter.log("Test case Started--"+methodName,true);
	
	}

	public void onTestSuccess(ITestResult result) {
		String methodName=result.getName();
		
		test.log(Status.PASS,"Test Case is passed");
		Reporter.log("Test case Executed--"+methodName,true);
		
	}

	public void onTestFailure(ITestResult result) {
		
	String methodName=result.getName();
	test.log(Status.FAIL,"Test case is Failed");
	Reporter.log("Test case Failed--"+methodName,true);
	}

	public void onTestSkipped(ITestResult result) {
		String methodName=result.getName();
		test.log(Status.SKIP,"Test case is skipped");
		Reporter.log("Test Case Skipped--"+methodName,true);
		
	}
	public void onStart1(ITestContext context) {
		Reporter.log("Projecxt Started--",true);
		
		esr = new ExtentSparkReporter("./testng.xml");
		esr.config().setReportName("pooja");
       esr.config().setTheme(Theme.DARK);
       esr.config().setDocumentTitle("Vtiger Project");
		
		er=new ExtentReports();
		er.attachReporter(esr);
		er.setSystemInfo("Operating System","Windows");
		er.setSystemInfo("Bits","64Bits");
		er.setSystemInfo(System used","Hp");
	}
	
				

	public void onFinish(ITestContext context) {
	 
		Reporter.log("Project Finished--",true);
		
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	}	
}
