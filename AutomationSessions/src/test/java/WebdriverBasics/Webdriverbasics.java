package WebdriverBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import com.project.ui.util.SeleniumCommonMethods;



public class Webdriverbasics extends SeleniumCommonMethods{

	@FindBy (xpath = "//*[@id=\"gb\"]/div[2]/div[3]/div[1]/div/div[1]/a")
	private static WebElement gmail;
	
	
	
	public static void main(String[] args) {


	
	System.setProperty("webDriver.chrome.driver","C:\\Users\\krish\\Automation\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
		driver.get("www.google.com");
		
		
		gmail.click();
		
		
		
		

	}

}
