package generics;

import java.lang.reflect.Method;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseTest {
	public ExtentReports extent;
	public ExtentTest test;
	//@BeforeSuite
	public void initReport() {
		extent = new ExtentReports();
		ExtentHtmlReporter reportType=new ExtentHtmlReporter("./res/report.html");
		extent.attachReporter(reportType);
	}
	
	//@BeforeMethod
	public void openApp(Method m) {
		test = extent.createTest(m.getName());
	}
	//@AfterSuite
	public void endReport() {
		extent.flush();
	}
}
