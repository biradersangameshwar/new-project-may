package wait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web_tables {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
	    int rows =driver.findElements(By.xpath("//table[@id='customers']//tbody/tr")).size();
	    Thread.sleep(2000);
	    System.out.println("Total number of rows:"+rows);
	    int colm = driver.findElements(By.xpath("//table[@id='customers']//tbody/tr/th")).size();
	    System.out.println("Total number of column:"+colm);
	    for(int r=2;r<=rows;r++) {
	    	for(int c=1;c<=colm;c++) {
	    		String str =driver.findElement(By.xpath("//table[@id='customers']//tr["+r+"]/td["+c+"]")).getText();
	    		System.out.print(str+" ");
	    	}
	    	System.out.println();
	    }
	    
	    
	    
	    
	    Thread.sleep(2000);
	    driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
