package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.vtiger.pages.HomePage;
import com.vtiger.pages.LoginPage;
import com.vtiger.pages.PageObjectManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class loginStepdefinition extends PageObjectManager {
	
	@Before
	public void getScenario(Scenario scenario)
	{
		initiation();
		 TCName = scenario.getName();
		 logger = extent.createTest(TCName);
		 
	}
	
	@After
	public void savereport()
	{
		extent.flush();
	}

	
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		if(driver==null)
		launchApp();
		getPageObject();
		
	}
	@When("user enters valid userid and password and click on login button")
	public void user_enters_valid_userid_and_password_and_click_on_login_button() {		
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
	   
	}
	@Then("user should be navigated to home page")
	public void user_should_be_navigated_to_home_page() {
			hp.verifyPipeline();
	   
	}
	@Then("user can see logout link on the home page")
	public void user_can_see_logout_link_on_the_home_page() {
	   hp.verifyLogout();
	}
	
	
	@When("user enters invalid userid and password and click on login button")
	public void user_enters_invalid_userid_and_password_and_click_on_login_button() {
		lp.login(td.get(TCName).get("Userid"), td.get(TCName).get("Password"));
	}
	@When("user can see error message on login page")
	public void user_can_see_error_message_on_login_page() {
	   lp.verifyErrorMsg();
	}
	
	@When("close app")
	public void close_app() {
	   driver.quit();
	}
	
	@When("user enters invalid userid as {string} and password as {string} and click on login button")
	public void user_enters_invalid_userid_as_and_password_as_and_click_on_login_button(String uid, String pwd) {
		lp.login(uid,pwd);
	}



}
