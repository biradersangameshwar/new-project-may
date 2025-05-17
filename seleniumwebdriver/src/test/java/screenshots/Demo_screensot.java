package screenshots;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo_screensot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo/");
		WebElement ele1 = driver.findElement(By.xpath("//h3[text()='Featured']"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		jse.executeScript("arguments[0].style.border = '5px solid red'",ele1);
		Thread.sleep(2000);
		
		WebElement ele2= driver.findElement(By.id("content"));
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ele2.getScreenshotAs(OutputType.FILE);
		String trg = (".\\screnshots\\feature.png");
		Files.copy(src.toPath(),new File(trg).toPath());
		
		Thread.sleep(2000);
		driver.close();

	}

}
