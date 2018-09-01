package RestAssuredExample.RestAssured;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.junit.Test;

import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WeatherRestAPITest {
	
	@Test
	public boolean validateWeather()
	{
		baseURI="http://restapi.demoqa.com/utilities/weather/city";
		 RequestSpecification httpRequest= given();
		 
		 Response response=httpRequest.request("/Pune");
		
		 String responseBody=response.getBody().asString();
		 System.out.println("The response is :"+responseBody);
		return true;
	}
	
	public static void main(String [] args)
	{
		baseURI="http://restapi.demoqa.com/utilities/weather/city";
		 RequestSpecification httpRequest= given();
		 
		 Response response=httpRequest.request(Method.GET,"/Pune");
		
		 String responseBody=response.getBody().asString();
		 System.out.println("The response is :"+responseBody);
		 
		 given().get("/Pune").then().body("City", equalTo("Pune"));
	}

}
