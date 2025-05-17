package mouseAction;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromelatest\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		WebElement ritbtn = driver.findElement(By.id("rightClickBtn"));
		
		Actions act = new Actions(driver);
		
		act.contextClick(ritbtn).perform();
		
        
	}

}
