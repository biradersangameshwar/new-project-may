package day2;
import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import java.util.HashMap;

public class Differentpostrequest {
	

    // Post request using JSONObject
    @Test(priority = 1)
    void testPostUsingHashMap() {

        JSONObject data = new JSONObject();
        data.put("name", "Scott");
        data.put("location", "France");
        data.put("phone", "9900887766");

        String[] courseArr = {"c", "c++"};
        data.put("courses", courseArr);

        given()
            .contentType("application/json")
            .body(data.toString()) // convert JSONObject to string
        .when()
            .post("http://localhost:3000/students")
        .then()
            .statusCode(201)
            .body("name", equalTo("Scott"))
            .body("location", equalTo("France"))
            .body("phone", equalTo("9900887766"))
            .body("courses[0]", equalTo("c"))
            .body("courses[1]", equalTo("c++"))
            .header("Content-Type", containsString("application/json"))
            .log().all();
    }

    // Deleting student record
    @Test(priority = 2)
    void testDelete() {
        int studentIdToDelete = 1;

        given()
        .when()
            .delete("http://localhost:3000/students/" + studentIdToDelete)
        .then()
            .statusCode(anyOf(is(200), is(204), is(404))); // Handle if it exists or not
    }
}