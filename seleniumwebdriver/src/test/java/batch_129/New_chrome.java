package batch_129;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_chrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
	    driver.get("https://online.actitime.com/speedwaytech/login.do");
	    
	    driver.manage().window().maximize();
	    
	    driver.findElement(By.id("username")).sendKeys("speedwaytech74@gamil.com");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.name("pwd")).sendKeys("Sujeet@123");
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.partialLinkText("Return ")).click();
	    
	    driver.findElement(By.tagName("a")).click();
	    
	    
	    
	    
	    
		
		

	}

}
