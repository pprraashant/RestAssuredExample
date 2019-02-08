package RestAssuredExample.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class IFSC {
	
	@Test
	public boolean validateWeather()
	{
		baseURI="https://ifsc.razorpay.com";
		 RequestSpecification httpRequest= given();
		 
		 Response response=httpRequest.request("/CITI0000005");
		
		 String responseBody=response.getBody().asString();
		 System.out.println("The response is :"+responseBody);
		return true;
	}
	
	public static void main(String [] args)
	{
		baseURI="https://ifsc.razorpay.com";
		 RequestSpecification httpRequest= given();
		 
		 Response response=httpRequest.request(Method.GET,"/CITI0000005");
		
		 String responseBody=response.getBody().asString();
		 System.out.println("The response is :"+responseBody);
		 
		 given().get("/Pune").then().body("City", equalTo("Pune"));
	}

}
