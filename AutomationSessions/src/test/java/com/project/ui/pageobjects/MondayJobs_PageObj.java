package com.project.ui.pageobjects;

import com.project.ui.util.SeleniumCommonMethods;

public class MondayJobs_PageObj extends SeleniumCommonMethods{
	

	
	
	
	
	public void login ()throws Throwable{
		
		waitForPageLoad(driver);
		Usercred.sendKeys(readXMLdata.getTestData("user","Username"));
		
		
		
	}
	
	
	public void homepage() throws Throwable{
		
		
	}
	
	
}