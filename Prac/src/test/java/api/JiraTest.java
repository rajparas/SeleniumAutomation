package api;
import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.filter.session.SessionFilter;
import io.restassured.path.json.JsonPath;


public class JiraTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
RestAssured.baseURI ="http://localhost:8080";

// Login cookie senario
SessionFilter session = new SessionFilter();
String response = given().relaxedHTTPSValidation().log().all().header("Content-Type","application/json").body("{ \r\n"
		+ "    \"username\": \"Nidhi\", \r\n"
		+ "    \"password\": \"Nidhi8600!\" \r\n"
		+ "    }")
.log().all().filter(session).when().post("/rest/auth/1/session").then().extract().response().asString();
				
String ExpectedMessage ="Hi How are you?";
//Add comment

		String addCommentResponse = given().log().all().pathParam("key", "10004").header("Content-Type","application/json").body("{\r\n"
				+ "    \"body\": \""+ExpectedMessage+"\",\r\n"
				+ "    \"visibility\": {\r\n"
				+ "        \"type\": \"role\",\r\n"
				+ "        \"value\": \"Administrators\"\r\n"
				+ "    }\r\n"
				+ "}")
		.filter(session)
		.when().post("/rest/api/2/issue/{key}/comment").then().log().all().assertThat().statusCode(201).extract().response().asString();
		JsonPath js = new JsonPath(addCommentResponse);
		String commentId=js.getString("id");
		
	
	// Add Attachment
	
	given().header("X-Atlassian-Token","no-check").filter(session).pathParam("key", "10004")
	.header("Content-Type","multipart/form-data")
	.multiPart("file" , new File("JiraF1.txt"))
	.when().post("rest/api/2/issue/{Key}/attachments")
	.then().log().all().assertThat().statusCode(200);
	
	
	//Get Issue
	String issueDetails = given().filter(session).pathParam("key", "10004")
			.queryParam("fields", "comment")
			.log().all().when().get("rest/api/2/issue/{Key}")
			.then().log().all().extract().response().asString();
	System.out.println(issueDetails);
	
	JsonPath js1 = new JsonPath(issueDetails);
	int commentCount = js1.getInt("fields.comment.comments.size()");
	for(int i = 0; i<commentCount; i++)
	{
		String commentIdIssue = js1.get("fields.comment.comments["+i+"].id").toString();
		
		if(commentIdIssue.equalsIgnoreCase(commentId))
		{
			String message = js1.get("fields.comment.comments["+i+"].body").toString();
			System.out.println(message);
			Assert.assertEquals(message, ExpectedMessage);
		}
	}

	}
}
