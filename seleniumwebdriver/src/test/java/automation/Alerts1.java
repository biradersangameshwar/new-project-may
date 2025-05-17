package automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
		Thread.sleep(2000);
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.accept();
		System.out.println("simple alert text: "+alrt);
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        Thread.sleep(2000);
		alrt.dismiss();
		Thread.sleep(2000);
		System.out.println("confirm alert text: "+alrt);
		Thread.sleep(2000);
		driver.close();
		
		
		
		

	}

}
