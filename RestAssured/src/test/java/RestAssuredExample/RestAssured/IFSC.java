package RestAssuredExample.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class IFSC {
	
	@Test
	public void validateWeather()
	{
		baseURI="https://ifsc.razorpay.com";
		 RequestSpecification httpRequest= given().proxy("135.28.13.11", 8080);
		 
		 Response response=httpRequest.request(Method.GET,"/CITI0000005");
		
		 String responseBody=response.getBody().asString();
		 System.out.println("The response is :"+responseBody);
		// ValidatableResponse re=given().get("/Pune").then().body("City", equalTo("Pune"));
		 
		// Assert.assertTrue(given().proxy("135.28.13.11", DEFAULT_PORT).get("/CITI0000005").then().body("CITY", equalTo("PUNE")).equals(true));
		//return true;
	}
	
	public static void main(String [] args)
	{
//		RestAssured.proxy=host("135.28.13.11").
		baseURI="https://ifsc.razorpay.com";
		 RequestSpecification httpRequest= given().proxy("135.28.13.11", DEFAULT_PORT);
		 
		 Response response=httpRequest.request(Method.GET,"/CITI0000005");
		
		 String responseBody=response.getBody().asString();
		 System.out.println("The response is :"+responseBody);
		 
		 given().get("/Pune").then().body("City", equalTo("Pune"));
	}

}
