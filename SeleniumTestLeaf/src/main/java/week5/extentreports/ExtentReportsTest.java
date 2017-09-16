package week5.extentreports;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ExtentReportsTest {
	
	@Test
	public void extentReports() {

	ExtentReports report = new ExtentReports("./reports/report.html",false);
	File configfile = new File("./src/main/resources/extentconfig.xml");
	report.loadConfig(configfile);
	ExtentTest test = report.startTest("Create Lead", "Create Lead Test case");
	
	//change the log status L to caps to get the automatic status suggestion
	test.log(LogStatus.PASS, "Success");
	test.log(LogStatus.FAIL, "Fail test step");
	test.log(LogStatus.INFO, "Information test step");
	test.log(LogStatus.WARNING, "Warning test step");
	
	report.endTest(test);
	
	ExtentTest test1= report.startTest("Edit Lead", "Edit Lead Test case");
	test1.log(LogStatus.PASS, "Edit is successfull");
	report.endTest(test1);

	//to add screenshot in the report 
	ExtentTest test2= report.startTest("Merge Lead", "Merge Lead Test case");
	test2.log(LogStatus.PASS, "Merge is successfull"+test2.addScreenCapture("./snap1.jpg"));
	report.endTest(test2);
	
	
	report.flush();
	
	}

}
