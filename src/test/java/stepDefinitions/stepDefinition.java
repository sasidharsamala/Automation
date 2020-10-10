package  stepDefinitions;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page()  {
        System.out.println("I am on landing page");
    }

    @When("^User Login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)  {
    	System.out.println("I logged-in") ;
    	System.out.println(strArg1) ;
    	System.out.println(strArg2) ;
    }

    @Then("^HomePage is displayed$")
    public void homepage_is_displayed()  {
    	System.out.println("I am displayed with Homepage");
        
    }

    @And("^Cards are displayed$")
    public void cards_are_displayed()  {
    	System.out.println("I am displayed with cards");
        
    }
    @And("^Cards are not displayed$")
    public void cards_are_not_displayed() throws Throwable {
    	System.out.println("I am not displayed with cards");
        
    }

}