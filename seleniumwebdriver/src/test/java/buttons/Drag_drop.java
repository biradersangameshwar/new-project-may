package buttons;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://speedwaytech.co.in/testing-02/Drag-n-Drop/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement source = driver.findElement(By.id("box6"));
		
		WebElement target = driver.findElement(By.id("box106"));
		
		WebElement source1 = driver.findElement(By.id("box1"));
		
		WebElement target1 = driver.findElement(By.id("box101"));
		
		WebElement source2 = driver.findElement(By.id("box5"));
		
		WebElement target2 = driver.findElement(By.id("box105"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, target).perform();
		
		act.dragAndDrop(source2, target2).perform();
		
		act.dragAndDrop(source1, target1).perform();
		
		
		

	}

}
