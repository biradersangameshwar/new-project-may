package automation;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class Dataprv {
  @Test(dataProvider = "dp")
  public void testlogin( String s) {
	  System.out.println(s);
  }

  @DataProvider
  public String[] dp() {
    String[] data = new String[] {
    		"hari","sai","raju","amith"
    };
	return data;
      }
}
