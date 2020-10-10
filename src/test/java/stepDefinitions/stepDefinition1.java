package  stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import resources.APIresources;
import resources.payLoad;
import resources.utils;
import io.restassured.RestAssured;
import static org.hamcrest.Matchers.*;

import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseOptions;
import io.restassured.specification.RequestSpecification;
//import junit.framework.Assert;
//import static org.junit.Assert.*;
import io.restassured.specification.ResponseSpecification;

import static org.junit.Assert.*;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition1 extends utils{
	RequestSpecification reqspec;
	ResponseSpecification respec;
	Response response1;
	String response;
	JsonPath js;
	static 	String place_id;
	
	@Given("^User builds Addplace request \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void user_builds_Addplace_request(String name, String language, String address) throws Throwable {
	    System.out.println("Lets Build the Request Specification");
	   

		
		 reqspec=reqspec();
		 reqspec=given().spec(reqspec).
				    body(payLoad.AddPlace(name,language,address));
	}


@When("^User submits \"([^\"]*)\" with \"([^\"]*)\" request$")
public void user_submits_with_request(String resource, String httpmethod) throws Throwable {
		 System.out.println("Lets Build the "+httpmethod+" request to be submitted");
            APIresources b=APIresources.valueOf(resource);
            String resourcevalue=b.getresource();
            if(httpmethod.equals("post"))
            {
			respec=new ResponseSpecBuilder().expectStatusCode(200)
					.expectContentType(ContentType.JSON)
					.expectHeader("server", "Apache/2.4.18 (Ubuntu)").build();
			
			response1=reqspec.when().post(resourcevalue).then()
					.spec(respec)
		            //.body("scope",equalTo("APP"))
		            //.header("server",equalTo("Apache/2.4.18 (Ubuntu)"))
		            .extract().response();
			response=response1.asString();
			System.out.println(response);
			//place_id=getJsonPathValue(response1,"place_id");
			
			assertEquals(200,response1.getStatusCode());
            }
            else if(httpmethod.equals("get"))
            		{
            	place_id=getJsonPathValue(response1,"place_id");
       		 reqspec=reqspec();
       		 reqspec=given().spec(reqspec).queryParam("place_id",place_id);
       		response1=reqspec.when().get(resourcevalue).then()
					.spec(respec)
		            //.body("scope",equalTo("APP"))
		            //.header("server",equalTo("Apache/2.4.18 (Ubuntu)"))
		            .extract().response();
			
            		}
			
			
			
	}

	@Then("^A new place is created$")
	public void a_new_place_is_created() throws Throwable {
		 System.out.println("Lets validate the response");
		 //js=new JsonPath(response);
		 //System.out.println(js.getInt("StatusCode"));
		 
	}

	@Then("^statuscode is displayed as (\\d+)$")
	public void statuscode_is_displayed_as(int arg1) throws Throwable {
		 System.out.println("Lets validate additional response parameters");
		 
			System.out.println(response1.getStatusCode());

			assertEquals(arg1,response1.getStatusCode());
	    
	}
	@When("^verify place_id created has \"([^\"]*)\" with \"([^\"]*)\" and \"([^\\\"]*)\" request$")
	public void verify_place_id_created_has_with_request(String expectedname, String resource,String httpmethod) throws Throwable {
		user_submits_with_request(resource, httpmethod);
		response=response1.asString();
		System.out.println(response);

		System.out.println(getJsonPathValue(response1,"name"));
		assertEquals(expectedname,getJsonPathValue(response1,"name"));
	}
	@Given("^DeletePlace PayLoad$")
	public void deleteplace_PayLoad() throws Throwable {

		 reqspec=reqspec();
		 reqspec=given().spec(reqspec).
				    body(payLoad.DeletePlace(place_id));
	    
	}

	@Then("^\"([^\"]*)\" is \"([^\"]*)\"$")
	public void is(String key, String keyvalue) throws Throwable {
		assertEquals(keyvalue,getJsonPathValue(response1,key));
	}
}
