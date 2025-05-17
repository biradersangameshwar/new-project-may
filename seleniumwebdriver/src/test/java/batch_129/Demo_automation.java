package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_automation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(4000);
		
		driver.findElement(By.linkText("About")).click();
		
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		
		String expectedURL = "https://about.google/?fg=1&utm_source=google-IN&utm_medium=referral&utm_campaign=hp-header";
		
        String actualURL = currentURL;
        
        if(expectedURL.equals(actualURL)) {
        	System.out.println("test case passed");
        }
        else { 
        	System.out.println("test case failed");
        }
		

	}

}
