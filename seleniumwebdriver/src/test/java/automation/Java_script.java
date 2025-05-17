package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	    WebElement inputbx =	driver.findElement(By.id("name"));
	    WebElement mail = driver.findElement(By.id("email"));
	    WebElement raidobtn =driver.findElement(By.id("male"));
	    JavascriptExecutor je = (JavascriptExecutor) driver;
	    je.executeScript("arguments[0].setAttribute('value','harish')",inputbx);
	    je.executeScript("arguments[0].setAttribute('value','harish@gmail.com')",mail);
	    je.executeScript("arguments[0].click()",raidobtn);
	    je.executeScript("document.body.style.zoom='50%'");
	    Thread.sleep(2000);
	    je.executeScript("document.body.style.zoom='100%'");


	    
	    

	}

}
