package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_isenable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		
		driver.manage().window().maximize();
		
		 WebElement btn = driver.findElement(By.id("but2"));
		 
		 if(btn.isEnabled()) {
			 System.out.println("test case passed");
		 }
		 else {
			 System.out.print("test case failed");
		 }
		 
		 driver.close();
		 

	}

}
