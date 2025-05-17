package janmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demomethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//String currenturl = driver.getCurrentUrl();
		
		//System.out.println(currenturl);
		
		String expectedtitle = "nopCommerce demo store";
		
		String actualtitle = driver.getTitle();
		
		System.out.println(actualtitle);
		
		if(actualtitle.equals(expectedtitle)) {
			
			System.out.println("pass");
		}
		else {
			
			System.out.println("fail");
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		
		
		
		

	}

}
