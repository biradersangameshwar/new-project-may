import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://speedwaytech.co.in/testing-02/automation-practice-form/");
		
		driver.manage().window().maximize();
		
	    driver.findElement(By.id("firstName")).sendKeys("Biradar");
	    
	    driver.findElement(By.id("lastName")).sendKeys("Sangameshwar");
	    
	    driver.findElement(By.xpath("//input[@placeholder='name@example.com']")).sendKeys("birader.sangameshwar@gamil.com");
	    
	    driver.findElement(By.name("gender")).click();
	    
	    driver.findElement(By.id("userNumber")).sendKeys("8019653677");
	    
	    driver.findElement(By.id("dateOfBirthInput")).sendKeys("02 oct 1993");
	    
	    driver.findElement(By.id("subjectsInput")).sendKeys("Software Testing");
	    
	    driver.findElement(By.xpath("(//input[@type='checkbox'])[3]")).click();
	    
	    driver.findElement(By.id("currentAddress")).sendKeys("BDL colony badangpet");
	    
	    WebElement sel = driver.findElement(By.id("stateSelect"));
	    
	    Select sele1 = new Select(sel);
	    
	    sele1.selectByValue("Maharashtra");
	    
	    WebElement city = driver.findElement(By.id("citySelect"));
	    
	    Select sele2 = new Select(city);
	    
	    sele2.selectByVisibleText("Mumbai");
	    
	    driver.findElement(By.id("submit")).click();
	    
	    Thread.sleep(2000);
	    
	    driver.close();

	}

}
