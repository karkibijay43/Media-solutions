
package adPortal.extentReporter;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.model.Log;
import com.aventstack.extentreports.model.Test;
import adPortalManagers.WebDriverManager;
import adPortalUtilities.AdPortalScreenShots;

public class TestListener implements ITestListener {
//ExtentManager extentManager = new ExtentManager(ExtentManager.driver);
	WebDriver driver;
	

	public void onStart(ITestContext context) {
		System.out.println("*** Test Suite " + context.getName() + " started ***");
	}

	public void onFinish(ITestContext context) {
		System.out.println(("*** Test Suite " + context.getName() + " ending ***"));
		ExtentTestManager.endTest();
		ExtentManager.getInstance().flush();
	}

	public void onTestStart(ITestResult result) {
		System.out.println(("*** Running test method " + result.getMethod().getMethodName() + "..."));
		ExtentTestManager.startTest(result.getMethod().getMethodName());
		
	}

	
	  public void onTestSuccess(ITestResult result) {
		  
	  System.out.println("*** Executed " + result.getMethod().getMethodName() +
	  " test successfully..."); ExtentTestManager.getTest().log(Status.PASS,
	  "Test passed");
		/*
		 * ExtentManager extentManager = new ExtentManager(ExtentManager.driver); try{
		 * extentManager.ExtentReportScreenshot(); }catch (IOException e){
		 * e.printStackTrace(); }
		 */
	  
	  }
	  
	  public void onTestFailure(ITestResult result) {
	  System.out.println("*** Test execution " + result.getMethod().getMethodName()
	  + " failed..."); ExtentTestManager.getTest().log(Status.FAIL, "Test Failed");
		/*
		 * try{ extentManager.ExtentReportScreenshot(); }catch (IOException e){
		 * e.printStackTrace(); }
		 */
	  }
	 
	 
	/*
	 * public void onTestSuccess(ITestResult result) { AdPortalScreenShots
	 * screenshot = new AdPortalScreenShots(WebDriverManager.driver);
	 * screenshot.takeScreenShot(result.getInstanceName());
	 * 
	 * System.out.println("*** Executed " + result.getMethod().getMethodName() +
	 * " test successfully..."); ExtentTestManager.getTest().log(Status.PASS,
	 * "Test passed"); }
	 * 
	 * public void onTestFailure(ITestResult result) { AdPortalScreenShots
	 * screenshot = new AdPortalScreenShots(WebDriverManager.driver);
	 * screenshot.takeScreenShot(result.getInstanceName()); }
	 */

	public void onTestSkipped(ITestResult result) {
		System.out.println("*** Test " + result.getMethod().getMethodName() + " skipped...");
		ExtentTestManager.getTest().log(Status.SKIP, "Test Skipped");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("*** Test failed but within percentage % " + result.getMethod().getMethodName());
	}
}
