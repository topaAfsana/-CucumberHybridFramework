package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class Login {
	WebDriver driver;
	LoginPage loginpage = new LoginPage(driver);
	
	
	
	@Given("User has naviagetd to login page")
	public void user_has_naviagetd_to_login_page() {
		loginpage.enterSearchText("Javabook");
	}

	@When("Users enters valid email address {string} into email field")
	public void users_enters_valid_email_address_into_email_field(String string) {
	   
	}

	@When("User has entered valid password {string} into password field")
	public void user_has_entered_valid_password_into_password_field(String string) {
	    
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	    
	}

	@Then("User should get successfully logged in")
	public void user_should_get_successfully_logged_in() {
	    
	}

	@When("Users enters invalid email address {string} into email field")
	public void users_enters_invalid_email_address_into_email_field(String string) {
	    
	}

	@When("User has entered invalid password {string} into password field")
	public void user_has_entered_invalid_password_into_password_field(String string) {
	    
	}

	@Then("User should get proper warning message about credentials mismatch")
	public void user_should_get_proper_warning_message_about_credentials_mismatch() {
	    
	}


}
