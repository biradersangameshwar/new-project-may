package interview;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.nopcommerce.com/en");
		
		 String title = driver.getTitle();
		 
		 System.out.println(title);
		 
		 String url = driver.getCurrentUrl();
		 
		 System.out.println("current url is: ".concat(url));

	}

}
