package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_get {

	public static void main(String[] args) {
	

		System.out.println("This is Beginning");
		
		// Open Browser
		WebDriver driver = new ChromeDriver();
		//Open URL
		
		//1. Get ---> URL
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.linkText("About")).click();
		
		// 2. GetCurrent URL ---> 
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);
		
		
		String expectedURL  = "https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header";
		String actualURL = driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL)) {
			System.out.println("Test Case Pass");
		}
		else {
			System.out.println("Test Case Fail");
		}
		driver.close();
		
		
		
		

		

	}

}
