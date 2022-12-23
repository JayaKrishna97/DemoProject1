package com.project.ui.stepDefinitions;

import com.project.ui.pageobjects.MondayJobs_PageObj;
import com.project.ui.util.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MondayJobs_StepDef extends DriverFactory{
	
	MondayJobs_PageObj page;
	public MondayJobs_StepDef () {
		page = new MondayJobs_PageObj();
	}
	
	
	@Given("^User should login with username and password$")
	public void User_should_login_with_username_and_password() throws Throwable {
	    page.login();
	}
	
	
	@Then("^User navigates to homepage$")
	public void user_navigates_to_homepage() throws Throwable {
		page.homepage();
	}
	
}