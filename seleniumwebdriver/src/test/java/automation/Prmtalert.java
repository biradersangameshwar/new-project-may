package automation;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prmtalert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Thread.sleep(2000);
		Alert prmt = driver.switchTo().alert();
	   System.out.println("prompt alert text :" +prmt.getText());
		Thread.sleep(2000);
		prmt.sendKeys("sangameshwar");
		Thread.sleep(2000);
		prmt.accept();
		Thread.sleep(2000);
		driver.close();
		

	}

}
