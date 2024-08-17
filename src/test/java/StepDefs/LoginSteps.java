package StepDefs;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

   
	
	
	@Given("User navigate to Login page")
	
	public void User_navigate_to_Login_page() {
		
		System.out.println("User is on Bank landing page");
	}
	
	
	@When ("User enters username")
	
	public void User_enters_username(){
		
		System.out.println("User Enters User Name");
	}
	
	@And ("User enters password")
	
	
public void User_enters_password(){
		
		System.out.println("User Enters password");
	}	
		
	
	@And ("User clicks Login")
	
	
	public void User_clicks_Login(){
			
			System.out.println("User hit login button");
		}	
			
	
	
@Then ("Bank homepage displayed")
	
	public void Bank_homepage_displayed(){
		
		System.out.println("User logs in successfully");
	}
	
	
@And ("User account information displayed")


public void User_account_information_displayed(){
		
		System.out.println("User Account Info is displayed");
	}	


	}
	
	
	
	
	
	

