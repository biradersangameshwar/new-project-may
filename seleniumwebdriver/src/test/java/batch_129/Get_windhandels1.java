package batch_129;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_windhandels1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.naukri.com/");

		driver.manage().window().maximize();
        
		driver.findElement(By.linkText("Register")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@class='google-text']")).click();

		Thread.sleep(2000);
		
		//getWindowHandle method to get ID of main window(parent window)
        String Parent_id = driver.getWindowHandle();
        System.out.println("getWindowHandle will print IDs for parent or current window :  "+Parent_id);
		
        // getWindowHandle method to get ID of new window (child window)
		Set<String> child_id = driver.getWindowHandles();

		// for each loop
		for (String a : child_id) {
			// it will print IDs of both window
			System.out.println("child window ID "+a);
			driver.switchTo().window(a);

			System.out.println(driver.switchTo().window(a).getTitle());

		}

		driver.quit();

	}

}
		
		
	


