package rest;
import static io.restassured.RestAssured.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import files.Payload;
import files.Reusable_methods;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;


public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RestAssured.baseURI = "https://rahulshettyacademy.com";
		String response = given().log().all().queryParam("key","qaclick123").header("Content-Type","application/json").body(Payload.Addpalce())
				          .when().post("/maps/api/place/add/json")
				          .then().assertThat().statusCode(200).body("scope",equalTo("APP"))
				          .header("server","Apache/2.4.52 (Ubuntu)").extract().response().asString();
		                  System.out.println(response);
		                  JsonPath js = new JsonPath(response);
		                  String placeid = js.getString("place_id");
		                  System.out.println(placeid);

		String add = "hydreabad kachiguda";

		given().queryParam("key","qaclick123").header("Content-Type","application/json")
		.body("{\r\n"
				+ "\"place_id\": \""+placeid+"\",\r\n"
				+ "\"address\":\""+add+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "}")
		.when().put("maps/api/place/update/json")
		.then().log().all().assertThat().statusCode(200).body("msg",equalTo("Address successfully updated"));

		//get place
		String placeresp =  given().log().all().queryParam("key", "qaclick123")
				.queryParam("place_id",placeid)
				.when().get("maps/api/place/get/json")
				.then().assertThat().log().all().statusCode(200).extract().response().asString();

		JsonPath js1 = Reusable_methods.rawtojson(placeresp);
		String act = js1.getString("address");
		System.out.println(act);

		Assert.assertEquals(act, add);

	}

}
