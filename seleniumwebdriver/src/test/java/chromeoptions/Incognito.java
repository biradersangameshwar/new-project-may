package chromeoptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Incognito {

	public static void main(String[] args) throws InterruptedException {
     
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		//options.addArguments("start-maximized", "--disable-extensions");
		//options.addArguments("--headless", "--window-size=1920,1080");
		//options.addArguments("--headless");

		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://admin-demo.nopcommerce.com/login?");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

	}

}
