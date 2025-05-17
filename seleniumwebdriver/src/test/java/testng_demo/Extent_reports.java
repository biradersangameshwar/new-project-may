package testng_demo;

import java.io.File;
import java.io.IOException;



import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.edge.EdgeDriver;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

public class Extent_reports {
	WebDriver driver;
	ExtentReports extent;
	ExtentTest test;
	
	@BeforeSuite
	public void setupreport() {
		ExtentSparkReporter report = new ExtentSparkReporter("Demoreport.html");
		report.config().setReportName("Demo report");
		report.config().setDocumentTitle("Demo test report");
		
		extent = new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester","Sangam");
	}
	@BeforeMethod
	public void browsersteup() {
		//driver = new ChromeDriver();
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void scrnshot(String filename) throws IOException {
		File screenshots1 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(screenshots1, new File("screenshots/"+filename+".png"));
		
	}
	@Test
	public void orangeHRm() throws IOException, InterruptedException {
		driver.get("https://www.saucedemo.com");
		Thread.sleep(2000);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(2000);
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		Thread.sleep(2000);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		scrnshot("loginpage");
		//wait.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		}
	@AfterMethod
	public void close() {
		driver.close();
	}
	
	

}
