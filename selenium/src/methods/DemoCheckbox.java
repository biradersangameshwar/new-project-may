package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoCheckbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.krninformatix.com/sample.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
	    boolean checkboxstatus = driver.findElement(By.id("rem")).isSelected();
		
	    System.out.println(checkboxstatus);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("rem")).click();
	    boolean checkboxstatus1 = driver.findElement(By.id("rem")).isSelected();
	    System.out.println(checkboxstatus1);
	    
	    Thread.sleep(2000);
	    
	    driver.findElement(By.id("rem")).click();
	    boolean checkboxstatus2 = driver.findElement(By.id("rem")).isSelected();
	    System.out.println(checkboxstatus2);

	}

}
