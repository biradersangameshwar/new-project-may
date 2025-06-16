package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				    
		         // WebDriverManager.chromedriver().setup();
					
					WebDriver driver = new ChromeDriver();
					
					driver.manage().window().maximize();
					
					// 1. Get
					driver.get("https://agilekey.co.in/");
				
					String getTitle=driver.getTitle();
					System.out.println(getTitle);
					
					String exceptedTitle="AgileKey12";
					
					String actualTitle = driver.getTitle();
					
					if(exceptedTitle.equals(actualTitle)) {
						System.out.println("Test Case Pass");
					}else {
						System.out.println("Test Case Fail");
					}
					driver.close();
				}

			
		
		
	}


