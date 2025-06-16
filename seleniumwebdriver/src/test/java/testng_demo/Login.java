package testng_demo;
import org.testng.annotations.Test;

	public class Login extends BaseTest {

	    @Test
	    public void validLogin() {
	        System.out.println("Executing validLogin on " + driver);
	        // Selenium steps for valid login
	        // driver.findElement(By.id("username")).sendKeys("validUser");
	        // driver.findElement(By.id("password")).sendKeys("validPass");
	        // driver.findElement(By.id("login")).click();
	    }

	    @Test
	    public void invalidLogin() {
	        System.out.println("Executing invalidLogin on " + driver);
	        // Selenium steps for invalid login
	    }
	}



