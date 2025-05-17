package automation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class dataprovider {

	
	@Test(dataProvider= "logindata")
	public void testlogin(String username, String password) {
		System.out.println("Testing login with username : "+username+" and password : "+password);
	}


   @DataProvider(name="logindata")
   public Object[][] dataproviderMethod(){
	   
	   return new Object[][] {
		   
		   
		   {"username1","pass1"},
		   {"username2","pass2"}
	   };
   }
}






