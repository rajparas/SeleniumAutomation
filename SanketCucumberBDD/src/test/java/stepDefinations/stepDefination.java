package stepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefination 
{
	
	@Given("^User is on landing page$")
	public void User_is_on_landing_page()
	{
		System.out.println("Runnning - User is on landing page");
	}
	
	@When("^User login to application with \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void user_login_to_application_with_something_and_password_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }
	
	@Then("^Home page is populated$")
	public void Home_page_is_populated()
	{
		System.out.println("Runnning - Home page is populated");
	}

	@And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_something(String strArg1) throws Throwable {
        System.out.println(strArg1);
    }
	
	/*
	@Given("^User is on loan landing page$")
	public void User_is_on_loan_landing_page()
	{
		System.out.println("Runnning - User is on loan landing page");
	}
	@When("^User login to application with username and password$")
	public void User_login_to_application_with_username_and_password()
	{
		System.out.println("Runnning - User login to application with username and password");
	}
	
	@And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
		System.out.println("Runnning - Cards are displayed");
    } 
    */
	
}
