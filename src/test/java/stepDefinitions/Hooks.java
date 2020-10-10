package stepDefinitions;

import cucumber.api.java.Before;

public class Hooks {
	@Before("@DeletePlace")
	public void beforedelete() throws Throwable
	{
		stepDefinition1 m=new stepDefinition1();
		if(stepDefinition1.place_id==null)
	{
		
		m.user_builds_Addplace_request("sasi", "english", "joburg");
		m.user_submits_with_request("AddPlaceAPI", "post");
		m.verify_place_id_created_has_with_request("sasi", "GetPlaceAPI","get");
	}
		
	}

}
