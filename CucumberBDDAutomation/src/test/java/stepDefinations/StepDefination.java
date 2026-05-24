package stepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {

	@Given("^User is on NetBanking landing page$")
	public void user_is_on_netbanking_landing_page() throws Throwable {
		System.out.println("User is on NetBanking landing page");
	}

	@When("User login into application with {string} and Password {string}")
	public void user_login_into_application_with_and_password(String username, String password) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(username);
		System.out.println(password);
	}

	@Then("^Home page is populated$")
	public void home_page_is_populated() throws Throwable {
		System.out.println("Home page is navigated");
	}

	@And("^cards are displayed are \"([^\"]*)\"$")
	public void cards_are_displayed_are(String string) {
		// Write code here that turns the phrase above into concrete actions
		System.out.println(string);
	}
	
	@And("^cards are not displayed are \"([^\"]*)\"$")
	public void cards_are_displayed_are_something(String strArg1) throws Throwable {
		System.out.println(strArg1);
	}
	
	@When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_login_into_application_with_something_and_something(String strArg1, String strArg2)throws Throwable {
		System.out.println(strArg1);
		System.out.println(strArg2);
	}

}
