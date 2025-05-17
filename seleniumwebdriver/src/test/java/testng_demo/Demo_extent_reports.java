package testng_demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class Demo_extent_reports {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	public void steupreport() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("simplereport.html");
		reporter.config().setReportName("Demo Report");
		reporter.config().setDocumentTitle("Simple test report");
		
		extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester","Sangam");
	}
	@BeforeMethod
	public void setupBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public void googletest() {
		test = extent.createTest("Google title test");
		driver.get("https://www.google.co.in/");
		String title = driver.getTitle();
		test.info("Page title is:"+title);
		}
	@Test
	public void Scrnshot(String filename) throws IOException {
		File screenshots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshots, new File("screenshots/"+filename+".png"));
	}
	@Test
	public void googletestFail() throws IOException, InterruptedException {
		test = extent.createTest("Google title test fail");
		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);
		Scrnshot("Failed test");
		
		String title = driver.getTitle();
		Assert.assertEquals(title, "Not equals");
		test.pass("This title is not present so it fails");
		
		
		
		}
	@Test
	public void skipTestExample() {
		test.getExtent().createTest("Skipped Test Example");
		throw new SkipException("This test is skipped");
	}@AfterMethod
	public void getTestResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE) {
			test.log(Status.FAIL,MarkupHelper.createLabel(result.getName()+"Fail",ExtentColor.RED));
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			test.log(Status.PASS,MarkupHelper.createLabel(result.getName()+"Pass",ExtentColor.GREEN));
		}else if(result.getStatus()==ITestResult.SKIP) {
			test.log(Status.SKIP,MarkupHelper.createLabel(result.getName()+"Skip",ExtentColor.ORANGE));
		}
	}
	
	
	@AfterMethod
	public void teatDown() {
		driver.quit();
	}
	@AfterSuite
	public void flushReport() {
		extent.flush();
	}
	

}
