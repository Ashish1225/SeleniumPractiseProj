package jan_29;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Media;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportDemo {

	@Test
	public void generateExtentReport() {

		ExtentReports extentReport = new ExtentReports();
		ExtentSparkReporter sparkReport = new ExtentSparkReporter(
				System.getProperty("user.dir") + "//ExtentReports//MyHtmlReport.html");

		sparkReport.config().setReportName("Automation Report");
		sparkReport.config().setTheme(Theme.DARK);
		sparkReport.config().setDocumentTitle("Sprint 1 Automation Report");

		extentReport.attachReporter(sparkReport);

		ExtentTest extentTest1 = extentReport.createTest("Login test");

		extentTest1.log(Status.INFO, "Login Info");

		ExtentTest extentTest2 = extentReport.createTest("Account Test");

		extentTest2.log(Status.PASS, "Account Test Pass");

		ExtentTest extentTest3 = extentReport.createTest("Payment Page");

		extentTest3.log(Status.FAIL, "Payment failed",MediaEntityBuilder.createScreenCaptureFromPath("C:\\Users\\ashu2\\OneDrive\\Desktop\\abc\\Dalhausie.jpg").build());
		
		ExtentTest extentTest4 = extentReport.createTest("Add to cart page");

		extentTest4.log(Status.SKIP, "Item added to cart");

		extentReport.flush();

	}

}
