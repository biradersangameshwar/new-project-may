package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload_download {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.navigate().to("https://speedwaytech.co.in/testing-02/upload-and-download/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("uploadFile")).sendKeys("C:\\Updated Resume - 2024.pdf");
		Thread.sleep(3000);
		driver.close();
		

	}

}
