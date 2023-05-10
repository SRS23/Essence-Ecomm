package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reportss {

	ExtentReports extent;
	
	public void reportConfig() {
		String reportName = "ExtentReport.html";
		String path = System.getProperty("user.dir")+ "/test-output/Extent-Reports/" + reportName;
		ExtentSparkReporter reporter = new ExtentSparkReporter(path);
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		reporter.config().setDocumentTitle("Essence Ecomm");
		reporter.config().setReportName("Essence TesNg Testing");
		reporter.config().setTheme(Theme.STANDARD);	
		extent.setSystemInfo("S Ramana Sekhar", "Tester");
	}
	
	public void createTest(String string) {
		extent.createTest("Essence Ecomm Functionalities TestNg Test");
	}
	
	public void flush() {
		
		extent.flush();
	}
}
