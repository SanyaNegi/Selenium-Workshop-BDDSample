//package stepDefs;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.io.File;
//import java.io.IOException;
//
//import org.apache.commons.io.FileUtils;
//import org.junit.Assert;
//
//import io.cucumber.java.After;
//import io.cucumber.java.Scenario;
//import io.cucumber.java.en.And;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//public class GooglePageStepDef {
//	
//		static  WebDriver driver;
//		@Given("User is on Google Page")
//		public void user_is_on_google_page() {
//			WebDriverManager.chromedriver().setup();
//			driver = new ChromeDriver();
//			driver.get("https://www.google.com/");
//		    
//		}
//
//		@When("User search Java Tutorial")
//		public void user_search_java_tutorial() {
//			driver.findElement(By.name("q")).sendKeys("Java");
//			driver.findElement(By.name("q")).submit();
//		}
//		@Then("Should display Java Result Page")
//		public void should_display_java_result_page() {
//			Assert.assertEquals(driver.getTitle(), "Java - Google Search");
//			System.out.println("After Search: " + driver.getTitle());
//		}
//		
//
//		@When("User search Selenium Tutorial")
//		public void user_search_selenium_tutorial() {
//			driver.findElement(By.name("q")).sendKeys("Selenium");
//			driver.findElement(By.name("q")).submit();
//		}
//		@Then("Should display Selenium Result Page")
//		public void should_display_selenium_result_page() {
//			Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
//			System.out.println("After Search: " + driver.getTitle());
//		}
//		
//		@And("close the browser")
//		public void close_the_browser() {
//			driver.close();
//		}
//		
//		@After
//		public void attachImage(Scenario scenario) throws IOException {
//			if(scenario.isFailed()) {
//				TakesScreenshot scr = (TakesScreenshot)driver;
//				File scrFile = scr.getScreenshotAs(OutputType.FILE);
//				byte[] byteImg = FileUtils.readFileToByteArray(scrFile);
//				scenario.attach(byteImg, "image/png", "image1");
//			}
//		}
//
//
//
//}



package stepDefs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;



import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePageStepDef {
	
		static WebDriver driver;
	
		@Before 
		public void setUp() throws Exception {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		
	
		@Given("User is on Google Page")
		public void user_is_on_google_page() {
			
			driver.get("https://www.google.com/");
		    
		}

		@When("User search Java Tutorial")
		public void user_search_java_tutorial() {
			driver.findElement(By.name("q")).sendKeys("Java");
			driver.findElement(By.name("q")).submit();
		}
		@Then("Should display Java Result Page")
		public void should_display_java_result_page() {
			Assert.assertEquals(driver.getTitle(), "Java - Google Search");
			System.out.println("After Search: " + driver.getTitle());
		}
		

		@When("User search Selenium Tutorial")
		public void user_search_selenium_tutorial() {
			driver.get("https://www.google.com/");
		    
			driver.findElement(By.name("q")).sendKeys("Selenium");
			driver.findElement(By.name("q")).submit();
		}
		@Then("Should display Selenium Result Page")
		public void should_display_selenium_result_page() {
			Assert.assertEquals(driver.getTitle(), "Selenium - Google Search");
			System.out.println("After Search: " + driver.getTitle());
		}
		
		@And("close the browser")
		public void close_the_browser() {
			driver.close();
		}
		
		@After
		public void attachImage(Scenario scenario) throws IOException {
			if(scenario.isFailed()) {
				TakesScreenshot scr = (TakesScreenshot)driver;
				File scrFile = scr.getScreenshotAs(OutputType.FILE);
				byte[] byteImg = FileUtils.readFileToByteArray(scrFile);
				scenario.attach(byteImg, "image/png", "image1");
			}
		}



}

