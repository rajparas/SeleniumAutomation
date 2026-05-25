package api;

import static org.hamcrest.Matchers.equalTo;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import files.Payload;
import groovy.util.logging.Log;

import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DynamicJson 
{
	@Test(dataProvider ="BooksData")
	public void addbook(String isbn, String aisle)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json")
		.body(Payload.Addbook(isbn,aisle))
		.when().post("/Library/Addbook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println(response);
	JsonPath js = ReUsableMethods.rawToJson(response);
	String id = js.get("ID");
	System.out.println(id);
	
	
		
	}
	//Multidiamentional Array 
	@DataProvider(name = "BooksData")
	public Object[][] getData()
	{
		
		
		return new Object[][] {{"gfrege","43455"},{"sadaff","435445"},{"daefh","35687"}};
	}
	
	@Test (dataProvider  = "DeleteData")
	public void deletebook(int id)
	{
		RestAssured.baseURI = "http://216.10.245.166";
		String response = given().log().all().header("Content-Type","application/json")
		.body(Payload.DeleteBook(id))
		.when().post("/Library/DeleteBook.php")
		.then().log().all().assertThat().statusCode(200)
		.extract().response().asString();
		System.out.println(response);
		
		JsonPath js = ReUsableMethods.rawToJson(response);
		String id1 = js.get("ID");
		System.out.println(id);
	}
	
	@DataProvider (name = "DeleteData")
	public Object[] deleteData()
	{
		return new Object[] {"gfrege43455","sadaff435445","daefh35687"};
	}

}
