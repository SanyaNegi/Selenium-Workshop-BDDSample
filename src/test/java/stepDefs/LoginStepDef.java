package stepDefs;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.junit.Assert;


public class LoginStepDef {
	//creating an object of webdriver i.e declaring
	WebDriver driver;
	
	
	@Given("User is on Login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		//initailising the object with chrome driver
		driver= new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/login");
	   
	}

//	@When("User enters login Credentials")
//	public void user_enters_login_credentials() {
//		driver.findElement(By.id("username")).sendKeys("tomsmith");
//		driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
//		driver.findElement(By.cssSelector(".radius")).click();
	
	//Using Parameterisation and Scenario outline
//		@When("User enters {string} and {string}")
//		public void user_enters_and(String strUser, String strPwd) {
//			driver.findElement(By.id("username")).sendKeys(strUser);
//			driver.findElement(By.id("password")).sendKeys(strPwd);
//			driver.findElement(By.cssSelector(".radius")).click();
//		    
//		}
	
//	//Datatable - Giving data step level wise - as lists
//	@When("User enters {string} and {string}")
//	public void user_enters_and(DataTable userCred) {
//		List<List<String>> data = userCred.asLists();
//		//record1 - username, pwd
//		//get(0) - get(0)  and get(1)
//		//record2 - username, pwd
//		driver.findElement(By.id("username")).sendKeys(data.get(0).get(0));
//		driver.findElement(By.id("password")).sendKeys(data.get(0).get(1));
//		driver.findElement(By.cssSelector(".radius")).click();
//	    
//	}

	
//	//DataTable - Giving data step level wise - as maps

	@When("User enters {string} and {string}")
	public void user_enters_and(DataTable userCred) {
		List<Map<String,String>> data = userCred.asMaps();
		//record1 - username, pwd
		//get(0) - get(0)  and get(1)
		//record2 - username, pwd
		driver.findElement(By.id("username")).sendKeys(data.get(0).get("username"));
		driver.findElement(By.id("password")).sendKeys(data.get(0).get("password"));
		driver.findElement(By.cssSelector(".radius")).click();
	    
	}


	@Then("User is on Home page")
	public void user_is_on_home_page() {
		boolean isValidUser = driver.findElement(By.cssSelector("div.success")).isDisplayed();
		Assert.assertTrue(isValidUser);
	}




}
