package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleOneStepDef {
	

		@Given("User is loggedIn")
		public void user_is_logged_in() {
			System.out.println("User is logged in");
		    
		}
		
		@When("User create a new contact")
		public void user_create_a_new_contact() {
		    System.out.println("user crates anew contact");
		}
		@When("User view contact details")
		public void user_view_contact() {
		    System.out.println("User view contact details ");
		}
		@When("User update a contact details")
		public void user_update_contact() {
		    System.out.println("User update a contact details");
		}
		@When("User create a new deal")
		public void user_create_a_new_deal() {
		    System.out.println("User create a new deal");
		}
		@When("User view deal")
		public void user_view_deal() {
		    System.out.println("User view deal");
		}
		@When("User update a deal")
		public void user_update_deal() {
		    System.out.println("User update a deal");
		}
		@When("User logout from App")
		public void logout() {
		    System.out.println("User logout from App");
		}
		
		


	
	

}
