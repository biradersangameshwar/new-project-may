package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First_test_Case {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//launching browser(chrome)
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		//open url 
		driver.get("https://demo.opencart.com/");
		
		Thread.sleep(2000);
		
		/*
		String titl = driver.getTitle();
		System.out.println(titl);
		*/
		 
		
		// validate titile should be "Your Store"
		String ttle = driver.getTitle();
		
		Thread.sleep(2000);
		
		if(ttle.equals(ttle))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		}

		// close browser
		
		Thread.sleep(2000);
		
		driver.close();
		
		

	}

}
