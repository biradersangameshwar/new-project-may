package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com/login.do");	
		
		Thread.sleep(4000);
		
		driver.manage().window().maximize();
		
		String str = driver.getCurrentUrl();
		
		System.out.println(str);
		
		String expectedUrl = "https://demo.actitime.com/login.do";
		
		if(expectedUrl.equals(str)) {
			
			System.out.println("pass");
			
		}
		else {
			
			System.out.println("fail");
			
		}
	}
}
		
