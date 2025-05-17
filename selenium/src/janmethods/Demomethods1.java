package janmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demomethods1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		String Actualtext = driver.findElement(By.xpath("//a[text()='Register']")).getText();
		
		System.out.println(Actualtext);
		
		String expectedtext = "Regisetr";
		
		if(Actualtext.equals(expectedtext)) {
			
			System.out.println("pass");
		}
		
		else {
			
			System.out.println("fail");
		}
	}

}
