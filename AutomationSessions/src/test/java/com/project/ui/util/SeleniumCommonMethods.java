package com.project.ui.util;

import java.awt.Robot;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumCommonMethods {

	public WebDriver driver = null;
	
	static int LOG_VAR;
	int failFlag;
	String fileName;
	String screenName;
	public static String DVARIABLE ="";
	public static int synctime, Longsynctime;
	public static HashMap<String,String> dataholder = new HashMap<String,String>();
	
	public static Robot robo;
	public static String ACTUALPARA= "";
	
	
	public static WebDriverWait wait;
	
	public static String fieldValue, inputSheet, testModulePath;
	
	
	
	public SeleniumCommonMethods() {
		
		try {
			if(driver ==null) {
				
				driver = DriverFactory.createAndGetDeviceDriver("");
				
				driver.manage().window().maximize();
				
			}
		}
		catch{
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
}
