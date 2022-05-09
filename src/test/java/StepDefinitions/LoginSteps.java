package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobjects.AddCustomerPage;
import Pageobjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps extends BaseClass{
	//static WebDriver driver= new ChromeDriver();
	public LoginPage lp;
	
	

	
/*	@Before
	public static void setup() {
		System.setProperty("WebDriver.chrome.driver", "chrome.exe");
		WebDriver driver= new ChromeDriver();
	    driver.manage().deleteAllCookies();
	    driver.manage().window().maximize();
	}*/
	
	
/*	public static void tearDown() {
		driver.close();
	} */
	
	@Given("user launch the browser")
	public void user_launch_the_browser() {
		setup();
	    lp= new LoginPage(driver);
	}

	@When("user opens the url {string} in the browser")
	public void user_opens_the_url_in_the_browser(String url) {
		driver.get(url);
	}
	
	@When("user enters Email as {string} and password as {string}")
	public void user_enters_Email_as_and_password_as(String uname, String pass) {
		lp.setUsername(uname);
		lp.setPassword(pass);
	}

	@When("click on login button")
	public void click_on_login_button() {
		lp.loginBtnClick();
	}
;
	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) {
		if (driver.getPageSource().contains("Login was unsuccessful.")) {
	    	Assert.assertTrue(false);
	    }
	    else {
	    	Assert.assertEquals(title, driver.getTitle());
	    }
	}

	@When("user clik on logout link")
	public void user_clik_on_logout_link() {
	    lp.logoutBtnClick();
	}	
	
	@Then("error message displayed will be")
	public void error_message_displayed_will_be(String docString) {
	    String errormsg=driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
	    System.out.println(errormsg);
	    Assert.assertEquals(docString, errormsg);
	}
	
	@Then("close the browser")
	public void close_the_browser() {
	    tearDown();
	}

}
