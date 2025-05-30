package utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import testBase.BaseClass;

public class ExtentReportManager implements ITestListener {
	
	public ExtentSparkReporter sparkreporter;  // UI of the report
	public ExtentReports extent;  // populate common info on the report
	public ExtentTest test;  // creating test case entries in the report and update status of the test methods
	String repName;
	
	
	
	public void onStart(ITestContext testcontext) {
		
		/*SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");
		Date dt = new Date();
		String currentdatetimestamp = df.format(dt); */
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.MM.SS").format(new Date()); //time stamp
		repName = "Test-Report-" + timeStamp + ".html";
		
		sparkreporter = new ExtentSparkReporter(".\\reports\\" + repName); // specify location of reports
		sparkreporter.config().setDocumentTitle("Ecommerce Report"); // Title of the report
		sparkreporter.config().setReportName("Functional Testing"); // name of the report
		sparkreporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(sparkreporter);
		
		extent.setSystemInfo("Application", "Ecommerce");
		extent.setSystemInfo("Module", "Admin");
		extent.setSystemInfo("Sub Module", "Customers");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environment", "Qa");
		
		String os = testcontext.getCurrentXmlTest().getParameter("os");
		extent.setSystemInfo("Operating System", os);
		
		String browser = testcontext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String> includedGroups = testcontext.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
			extent.setSystemInfo("Groups", includedGroups.toString());
		}
		
		
		
		
				
		
		
	}
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName()); // create new entry in the report
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.PASS, result.getName() + " got successfully executed"); //updates status p/f/s
	}
	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getTestClass().getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.FAIL,result.getName()+" got failed");
		test.log(Status.FAIL, result.getThrowable().getMessage());
		
		try {
			String imgpath = new BaseClass().captureScreen(result.getName());
			test.addScreenCaptureFromPath(imgpath);
		} catch(IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getClass().getName()); 
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP,result.getName() + " got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
		
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
		String pathOfExtentReport = System.getProperty("user.dir") + ".\\reports\\"+repName;
		File extentReport = new File(pathOfExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
