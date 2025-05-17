package day1;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

public class Httprequest {
	
	int id;
   	@Test(priority=1)
	void getUsers() 
	{
		given()
		
		.when()
		  .get("https://reqres.in/api/users?page=2")
		
		.then()
		  .statusCode(200)
		  .body("page",equalTo(2))
		  .log().all();
	}
	@Test(priority=2)
	void createUser()
	{
		
		HashMap data = new HashMap();
		data.put("name","sujeet");
	    data.put("job", "Engineer");
	    
		id=given()
		.contentType("application/json")
		.body(data)
		
		.when()
		  .post("https://reqres.in/api/users")
		  .jsonPath().getInt("id");
		
		
		//.then()
		//.statusCode(201)
		//.log().all();
	}
   @Test(priority=3,dependsOnMethods= {"createUser"})
   public void updateUser() {
	    baseURI = "https://reqres.in";

	    given()
	        .header("Content-Type", "application/json")
	        .body("{\"name\":\"sujeet\",\"job\":\"QA Engineer\"}")
	    .when()
	        .put("/api/users/" + id)  // ✅ Make sure this ID exists
	    .then()
	        .statusCode(200)       // ✅ Expect 200 if user exists
	        .log().all();
	}
}


