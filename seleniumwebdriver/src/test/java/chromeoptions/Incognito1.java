package chromeoptions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito1 {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless", "--window-size=1920,1080");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.w3schools.com/sql/default.asp");
		Thread.sleep(2000);
		System.out.println("Title: " + driver.getTitle());
        
		
		//maximize browser by using chromeoptions
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized", "--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.wikipedia.org");
        */
		
	}

}
