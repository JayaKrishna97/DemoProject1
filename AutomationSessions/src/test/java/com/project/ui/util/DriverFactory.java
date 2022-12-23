package com.project.ui.util;

import java.net.MalformedURLException;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import net.bytebuddy.dynamic.NexusAccessor.InitializationAppender;

public class DriverFactory {

	static String Scenario_Name;
	public static HashMap<String, String> sauceMapper = new HashMap<String, String>();
	public static HashMap<String, ThreadLocal<WebDriver>> scnDriverMapper = new HashMap<String, ThreadLocal<WebDriver>>();
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();

	private final static String DEFAULT_BROWSERTYPE = "FIREFOX";
	private final static String DEFAULT_BROWSERVERSION = "90";
	private final static String DEFAULT_BROWSERENV = "local";
//	private final static String DEFAULT_SAUCE_USER = "";
//	private final static String DEFAULT_SAUCE_ACCESSKEY = "";

	public static WebDriver createAndGetDeviceDriver(String snrName) throws  MalformedURLException{
		
		try {
			if(driver.get() != null) {
				
				return driver.get();
			}
			String BrowserVersion=System.getProperty("BrowserVersion");
			String BrowserType=System.getProperty("BrowserType");
			String BrowserEnv=System.getProperty("BrowserEnv");
//			String sauceUsername="";
//			String saucePassword="";
			
			
			if (BrowserVersion == null ) {
				BrowserVersion = DEFAULT_BROWSERVERSION;
			}
			if (BrowserType == null ) {
				BrowserType = DEFAULT_BROWSERTYPE;
			}
			if (BrowserEnv == null ) {
				BrowserEnv = DEFAULT_BROWSERENV;
			}
//			if(BrowserEnv.equals("saucelab")&&(sauceUsername == null || saucePassword == null)) {
//				sauceUsername = DEFAULT_SAUCE_USER;
//			    saucePassword= DEFAULT_SAUCE_ACCESSKEY;
//			}
			
//			if(browserEnv.equalsIgnoreCase("saucelab")) {
//				
//				
//			}
		
		

		
	}
		catch (Exception e) {
			System.out.println("Exception >>> "+e.getMessage());

}
		return getDeviceDriver();
}





public static WebDriver getDeviceDriver() throws Exception{
	
	if (driver.get() != null) {
		return driver.get();
	}
	throw new Exception("Browser Driver Not Initialized");
}
}
