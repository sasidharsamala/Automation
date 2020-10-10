package resources;

public class payLoad {
	
	public static String AddPlace(String name,String language,String address)
	
	{
		return "{\r\n" + 
	    		"  \"location\": {\r\n" + 
	    		"    \"lat\": -38.383494,\r\n" + 
	    		"    \"lng\": 33.427363\r\n" + 
	    		"  },\r\n" + 
	    		"  \"accuracy\": 50,\r\n" + 
	    		"  \"name\": \""+name+"\",\r\n" + 
	    		"  \"phone_number\": \"(+91) 944 112 3332\",\r\n" + 
	    		"  \"address\": \""+address+"\",\r\n" + 
	    		"  \"types\": [\r\n" + 
	    		"    \"shoe park\",\r\n" + 
	    		"    \"shop\"\r\n" + 
	    		"  ],\r\n" + 
	    		"  \"website\": \"http://gile.com\",\r\n" + 
	    		"  \"language\": \""+language+"\"\r\n" + 
	    		"}\r\n" + 
	    		"";
	}
public static String DeletePlace(String place_id)
	
	{
	
		return "{\r\n" + 
				"\"place_id\":\""+place_id+"\"\r\n" + 
				"}";
		
	}
public static String CoursePrice()
	
	{
	   return "{\r\n" + 
	   		"\r\n" + 
	   		"\"dashboard\": {\r\n" + 
	   		"\r\n" + 
	   		"\"purchaseAmount\": 910,\r\n" + 
	   		"\r\n" + 
	   		"\"website\": \"rahulshettyacademy.com\"\r\n" + 
	   		"\r\n" + 
	   		"},\r\n" + 
	   		"\r\n" + 
	   		"\"courses\": [\r\n" + 
	   		"\r\n" + 
	   		"{\r\n" + 
	   		"\r\n" + 
	   		"\"title\": \"Selenium Python\",\r\n" + 
	   		"\r\n" + 
	   		"\"price\": 50,\r\n" + 
	   		"\r\n" + 
	   		"\"copies\": 6\r\n" + 
	   		"\r\n" + 
	   		"},\r\n" + 
	   		"\r\n" + 
	   		"{\r\n" + 
	   		"\r\n" + 
	   		"\"title\": \"Cypress\",\r\n" + 
	   		"\r\n" + 
	   		"\"price\": 40,\r\n" + 
	   		"\r\n" + 
	   		"\"copies\": 4\r\n" + 
	   		"\r\n" + 
	   		"},\r\n" + 
	   		"\r\n" + 
	   		"{\r\n" + 
	   		"\r\n" + 
	   		"\"title\": \"RPA\",\r\n" + 
	   		"\r\n" + 
	   		"\"price\": 45,\r\n" + 
	   		"\r\n" + 
	   		"\"copies\": 10\r\n" + 
	   		"\r\n" + 
	   		"}\r\n" + 
	   		"\r\n" + 
	   		"]\r\n" + 
	   		"\r\n" + 
	   		"}";
	}
public static String Addbook(String isbn,String aisle)

{
   return "{\r\n" + 
   		"\r\n" + 
   		"\"name\":\"Learn Appium Automation with Java\",\r\n" + 
   		"\"isbn\":\""+isbn+"\",\r\n" + 
   		"\"aisle\":\""+aisle+"\",\r\n" + 
   		"\"author\":\"Nageshwar\"\r\n" + 
   		"}\r\n" + 
   		"";
}
public static String Uaddbook()

{
   return "{\r\n" + 
   		"\r\n" + 
   		"\"name\":\"Mathematics\",\r\n" + 
   		"\"isbn\":\"yrr\",\r\n" + 
   		"\"aisle\":\"751\",\r\n" + 
   		"\"author\":\"John foe\"\r\n" + 
   		"}\r\n" + 
   		"";
}

public static String oddsTest()
{
	return "{\r\n" + 
			"    \"odds\": [{\r\n" + 
			"        \"price\": 1.30,\r\n" + 
			"        \"status\": 0,\r\n" + 
			"        \"ck\": 12.2,\r\n" + 
			"        \"name\": \"1\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"        \"price\": 5.25,\r\n" + 
			"        \"status\": 1,\r\n" + 
			"        \"ck\": 13.1,\r\n" + 
			"        \"name\": \"X\"\r\n" + 
			"    },\r\n" + 
			"  \r\n" + 
			"  {\r\n" + 
			"        \"price\": 2.70,\r\n" + 
			"        \"status\": 0,\r\n" + 
			"        \"ck\": 12.2,\r\n" + 
			"        \"name\": \"0\"\r\n" + 
			"    },\r\n" + 
			"    {\r\n" + 
			"        \"price\": 1.20,\r\n" + 
			"        \"status\": 2,\r\n" + 
			"        \"ck\": 13.1,\r\n" + 
			"        \"name\": \"2\"\r\n" + 
			"    }]\r\n" + 
			"}";
}
public static String storeDetails()
{
	return " {\r\n" + 
			"   \"store\":{  \r\n" + 
			"      \"book\":[  \r\n" + 
			"         {  \r\n" + 
			"            \"author\":\"Nigel Rees\",\r\n" + 
			"            \"category\":\"reference\",\r\n" + 
			"            \"price\":8.95,\r\n" + 
			"            \"title\":\"Sayings of the Century\"\r\n" + 
			"         },\r\n" + 
			"         {  \r\n" + 
			"            \"author\":\"Evelyn Waugh\",\r\n" + 
			"            \"category\":\"fiction\",\r\n" + 
			"            \"price\":12.99,\r\n" + 
			"            \"title\":\"Sword of Honour\"\r\n" + 
			"         },\r\n" + 
			"         {  \r\n" + 
			"            \"author\":\"Herman Melville\",\r\n" + 
			"            \"category\":\"fiction\",\r\n" + 
			"            \"isbn\":\"0-553-21311-3\",\r\n" + 
			"            \"price\":8.99,\r\n" + 
			"            \"title\":\"Moby Dick\"\r\n" + 
			"         },\r\n" + 
			"         {  \r\n" + 
			"            \"author\":\"J. R. R. Tolkien\",\r\n" + 
			"            \"category\":\"fiction\",\r\n" + 
			"            \"isbn\":\"0-395-19395-8\",\r\n" + 
			"            \"price\":22.99,\r\n" + 
			"            \"title\":\"The Lord of the Rings\"\r\n" + 
			"         }\r\n" + 
			"      ]\r\n" + 
			"   }\r\n" + 
			" }";
}
}


