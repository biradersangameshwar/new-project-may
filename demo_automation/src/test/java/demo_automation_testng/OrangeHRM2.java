package demo_automation_testng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM2 {
	WebDriver driver;
  @Test
  public void Launchapp() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.manage().window().maximize();
}
 @Test
  public void logindetails() throws InterruptedException {
		
	 Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		
 }
 
 @Test
 
 public void navigatetoMyinfo() throws InterruptedException {
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//a[@class='oxd-main-menu-item active']")).click();
 }
 
 @Test
 
 public void searcheng() {
 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Maintenance",Keys.ENTER);
 }
 
 
 
 
		
		
		
  }
