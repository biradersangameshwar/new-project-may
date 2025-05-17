package data_drn_testing;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		

			
				Fb xlib = new Fb();
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				
				
				for(int i=1;i<=3;i++) {
					String un = xlib.getExcelData("Sheet1", i,0);
					System.out.println(un);

					String pw = xlib.getExcelData("Sheet1", i, 1);
					System.out.println(pw);


				

					driver.get("https://www.facebook.com/");
					driver.findElement(By.id("email")).sendKeys(un);
					driver.findElement(By.id("pass")).sendKeys(pw);
					driver.findElement(By.id("u_0_9_54")).click();



				}

			}

		}	


