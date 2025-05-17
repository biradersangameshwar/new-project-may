package batch_129;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_windowhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://speedwaytech.co.in/testing-02/PracticeAutomation/");
		driver.manage().window().maximize();
		String windowid = driver.getWindowHandle();
		System.out.println(windowid);
		driver.findElement(By.xpath("//a[text()='Browser Windows']")).click();
		driver.findElement(By.id("windowButton")).click();
		Set<String> windowid2 = driver.getWindowHandles();
		 Iterator<String> itr = windowid2.iterator();
		 while(itr.hasNext()) {
			// String window = itr.next();
			 System.out.println("window");
		 }
		 
		 
		 
		
       
	}

}
