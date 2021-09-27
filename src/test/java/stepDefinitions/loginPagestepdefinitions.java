package stepDefinitions;

import java.io.IOException;
import Base.Base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.sLpo;

public class loginPagestepdefinitions extends Base{

	
	sLpo pageObject;
	
	
	@Before
	public void browsersetup() throws IOException 
	{	
		loadproperties();
		Instantiatebrowser();
	}
	
	
	@After
	public void browserteardown()
	{
		driver.close();
		driver.quit();
	}
	
	
		
	@Given("^User is in the login page$")
	public void user_is_in_the_login_page() throws Throwable {
		
		driver.get(Website);
		Thread.sleep(1000);
	}

	 @When("^user logins with \"([^\"]*)\" and pwd \"([^\"]*)\" and clicks login button$")
	    public void user_logins_with_something_and_pwd_something_and_clicks_login_button(String strArg1, String strArg2) throws Throwable {
		 
		 pageObject = new sLpo(driver);
		 pageObject.enterUsername(strArg1);
		 pageObject.enterPassword(strArg2);
		 pageObject.clickLoginbutton();
		 
		 		 
	    }

	@Then("^user is navigated to the home page of the internet banking account$")
	public void user_is_navigated_to_the_home_page_of_the_internet_banking_account() throws Throwable {
		   
				System.out.println("i am inside then method");
	}
	
	@When("^user logins in the firstpage with (.+) and pwd (.+) and clicks login button$")
    public void user_logins_in_the_firstpage_with_and_pwd_and_clicks_login_button(String un, String pd) throws Throwable {
		 pageObject = new sLpo(driver);
		 pageObject.enterUsername(un);
		 pageObject.enterPassword(pd);
		 pageObject.clickLoginbutton();
    }


	    @Then("^user should not be navigated to the home page$")
	    public void user_should_not_be_navigated_to_the_home_page() throws Throwable {
	    	System.out.println("S4");
	    }

	    @And("^Appropriate error message should be displayed$")
	    public void appropriate_error_message_should_be_displayed() throws Throwable {
	    	System.out.println("S5");
	    }

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
