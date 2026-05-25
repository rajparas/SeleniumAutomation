package api;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.testng.Assert.assertEquals;

import org.testng.Assert;

import files.Payload;
public class ApiBasic 
{
	public static void main(String[] args) 
	{
		//Validate if add place API is working as expected
		
		//Given - All input details
		//When - Submit the API - resourcec and http method
		//Then - Validate the response
		
		RestAssured.baseURI ="https://rahulshettyacademy.com";
		
		String response = given().log().all().queryParam("key", "qaclick123").header("Content-Type" , "application/json")
		.body(Payload.AddPlace()).when().post("maps/api/place/add/json")
		.then().assertThat().statusCode(200).body("scope",equalTo("APP")).header("server", "Apache/2.4.41 (Ubuntu)").extract().response().asString();
		
		
		System.out.println(response);	
		JsonPath js = new JsonPath(response); // for parsing json
		String placeId = js.getString("place_id");
		
		System.out.println("Place ID is :" + placeId);
		
		//Update Place
		
		String newAddress = "spruce st, New jersey";
		given().log().all().queryParam("key", "qaclick123").header("Content-Type" , "application/json")
		.body("{\r\n"
				+ "\"place_id\":\""+placeId+"\",\r\n"
				+ "\"address\":\""+newAddress+"\",\r\n"
				+ "\"key\":\"qaclick123\"\r\n"
				+ "}\r\n"
				+ "\r\n"
				+ "")
		.when().put("maps/api/place/update/json")
		.then().assertThat().log().all().statusCode(200).body("msg",equalTo ("Address successfully updated"));
		
		// Get Place
		
		String getplaceResponse = given().log().all().queryParam("key", "qaclick123")
		.queryParam("place_id", placeId)
		.when().get("maps/api/place/get/json")
		.then().assertThat().log().all().statusCode(200).extract().response().asString();
		
		JsonPath js1 = new JsonPath(getplaceResponse);
		String Actualaddress = js1.getString("address");
		System.out.println(Actualaddress);
		
		Assert.assertEquals(Actualaddress, newAddress);
	}

}
