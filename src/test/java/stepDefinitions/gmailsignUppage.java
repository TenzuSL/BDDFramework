package stepDefinitions;



import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import objectRepository.gmailSignuppageobjects;

public class gmailsignUppage {
		WebDriver driver = null;	
		gmailSignuppageobjects Obj1 ;
		
	
	    @Given("^User is in the gmail signup page$")
	    public void user_is_in_the_gmail_signup_page() throws Throwable {
	    	System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe");
		    driver = new ChromeDriver();
			driver.get("https://accounts.google.com/signup/v2/webcreateaccount?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Fpc%3Dtopnav-about-n-en&flowName=GlifWebSignIn&flowEntry=SignUp");
			driver.manage().window().maximize();
			Thread.sleep(1000);
	    }

	    @When("^User fills in all the deatils$")
	    public void user_fills_in_all_the_deatils(DataTable data) throws Throwable {
	       List<List<String>> Values = data.raw();
	      String firstname = Values.get(0).get(0);
	      String lastname = Values.get(0).get(1);
	      String username = Values.get(0).get(2);
	      String password = Values.get(0).get(3);
	      String confirmpassword = Values.get(0).get(4);
	      
	      Obj1 = new gmailSignuppageobjects(driver);
	      Obj1.fillsignupdeatils(firstname, lastname, username, password, confirmpassword);
	      
	    }

	    @And("^User clicks show password check box$")
	    public void user_clicks_show_password_check_box() throws Throwable {
	    	Obj1 = new gmailSignuppageobjects(driver);
	        Obj1.clickshowpasswordcheckbox();
	    }


	    @Then("^User clicks on next button$")
	    public void user_clicks_on_next_button() throws Throwable {
	    	Obj1 = new gmailSignuppageobjects(driver);
	    	Obj1.clicknextbutton();
	    	
	    }

	   
}
