package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 ChromeOptions options = new ChromeOptions();
	        // This may not bypass auth popup, but can allow insecure origins
	        options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://admin:admin123@admin-demo.nopcommerce.com/");
		
	//	https://admin-demo.nopcommerce.com/


	}

}
