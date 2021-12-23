package stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class ModuleTwoStepDef {
	//ordering the execution of before hooks
	@Before(order=1, value="@RegressionTest")
	public void innitChrome() {
		System.out.println("innit chrome");
}
	@Before(order=3, value="@RegressionTest")
	public void readPropertyFile() {
		System.out.println("Read Property File");
}
	@Before(order=2,value="@SmokeTest")
	public void openDB() {
		System.out.println("open DB");
}
//	//Tagged Hook
//	@Before("@RegressionTest")
//	public void innitChrome() {
//		System.out.println("innit chrome");
//	}
//	//Tagged Hook
//		@Before("@SmokeTest")
//		public void innitEdge() {
//			System.out.println("innit edge");
//		}
//	
//	
//	@Before
//	public void openDb() {
//		System.out.println("open DB");
//	}
	@When("User create a new task")
	public void user_create_a_new_task() {
	    System.out.println("user crates a new task");
	}
	@When("User view contact task")
	public void user_view_task() {
	    System.out.println("User view  task ");
	}
	@When("User update a contact task")
	public void user_update_task() {
	    System.out.println("User update a task");
	}
	
	@After
	public void closeDb() {
		System.out.println("close DB");
	}
	
	
}
