package StepDefinitions;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.AddCustomerPage;
import Pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void setup() {
		System.setProperty("WebDriver.chrome.driver", "chrome.exe");
	    driver=new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	}
	
	public static void tearDown() {
		driver.close();
	} 
	
	// Additional mthod created or generating random string for unique email id
	
	public static String randomString() {
		String generatedString=RandomStringUtils.randomAlphabetic(5);
		return(generatedString);
		

	}

}
