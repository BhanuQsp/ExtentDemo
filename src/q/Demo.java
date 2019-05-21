package q;

import java.io.File;
import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Demo {

	public static void main(String[] args) throws IOException {
		ExtentReports extent = new ExtentReports();
		
		ExtentHtmlReporter reportType=new ExtentHtmlReporter("./res/report.html");
		extent.attachReporter(reportType);
		
		ExtentTest t1 = extent.createTest("Test1");
		t1.log(Status.INFO,"Starting the Test1");
		t1.log(Status.PASS,"Open Application");
		t1.log(Status.PASS,"Login to application");
		
		ExtentTest t2 = extent.createTest("Test2");
		t2.log(Status.INFO,"Starting the Test1");
		t2.log(Status.PASS,"Open Application");
		String p = new File("./img/ab.png").getAbsolutePath();
		t2.log(Status.FAIL,"Screen shot"+ t2.addScreenCaptureFromPath(p));
		t2.log(Status.PASS,"Close Application");
		
		extent.flush();
		
	}
}
