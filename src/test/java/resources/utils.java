package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class utils {
	public  RequestSpecification reqspec() throws IOException
	{
	RequestSpecification reqspec=new RequestSpecBuilder().setBaseUri(globalvariables("BaseUri"))
			.addQueryParam("key","qaclick123").setContentType(ContentType.JSON).build();
	return reqspec;

}
	public  String globalvariables(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\eclipse-workspace\\Automation\\src\\test\\java\\resources\\global.properties");
	    prop.load(fis);
	    return prop.getProperty(key.toString());
	}


public String getJsonPathValue(Response response,String key)
{
	String responseString=response.asString();
	JsonPath js=new JsonPath(responseString);
	return js.get(key);
	
}
}
