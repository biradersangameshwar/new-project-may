package testng_demo;

import java.io.File;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;

import org.testng.annotations.*;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;


public class Demo_Extent_rep {

	
	public class Demo_extent_reports {
        
		public Logger logger;
	    WebDriver driver;
	    ExtentReports extent;
	    ExtentTest test;

	    @BeforeSuite
	    public void setupReport() {
	        ExtentSparkReporter reporter = new ExtentSparkReporter("simplereport.html");
	        reporter.config().setReportName("Demo Report");
	        reporter.config().setDocumentTitle("Simple Test Report");

	        extent = new ExtentReports();
	        extent.attachReporter(reporter);
	        extent.setSystemInfo("Tester", "Sangam");
	    }

	    @BeforeMethod
	    public void setupBrowser() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	    }

	    @Test
	    public void googleTestPass() {
	        test = extent.createTest("Google Title Test - Pass");
	        driver.get("https://www.google.co.in/");
	        String title = driver.getTitle();
	        test.info("Page title is: " + title);
	        Assert.assertTrue(title.contains("Google")); // Should pass
	        
	    }

	    @Test
	    public void googleTestFail() {
	        test = extent.createTest("Google Title Test - Fail");
	        driver.get("https://www.google.co.in/");
	        Assert.assertEquals(driver.getTitle(), "Incorrect Title");  // Will fail
	        logger.error("Test Failed");
	    }

	    @Test
	    public void skipTestExample() {
	        test = extent.createTest("Skipped Test Example");
	        throw new SkipException("This test is skipped intentionally");
	    }

	    // 🔻 Screenshot method used when a test fails
	    public String takeScreenshot(String testName) throws IOException {
	        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        String path = "screenshots/" + testName + ".png";
	        File dest = new File(path);
	        dest.getParentFile().mkdirs();  // Create directory if not exists
	        Files.copy(src, dest);
	        return path;
	    }

	    @AfterMethod
	    public void tearDown(ITestResult result) throws IOException {
	        if (result.getStatus() == ITestResult.FAILURE) {
	            test.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - FAILED", ExtentColor.RED));
	            test.log(Status.FAIL, result.getThrowable());

	            String screenshotPath = takeScreenshot(result.getName());
	            test.addScreenCaptureFromPath(screenshotPath);
	        } else if (result.getStatus() == ITestResult.SUCCESS) {
	            test.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " - PASSED", ExtentColor.GREEN));
	        } else if (result.getStatus() == ITestResult.SKIP) {
	            test.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - SKIPPED", ExtentColor.ORANGE));
	        }

	        driver.quit();
	    }

	    @AfterSuite
	    public void flushReport() {
	        extent.flush();
	    }
	}


}
