package automation;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Java_script_scroll {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//js.executeScript("window.scrollBy(0,1000)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		//WebElement ele1 = driver.findElement(By.xpath("//a[text()='Youtube']"));
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		Thread.sleep(3000);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		driver.close();

	}

}
