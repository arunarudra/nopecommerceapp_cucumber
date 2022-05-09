package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinitions.BaseClass;

public class LoginPage {
	public WebDriver ldriver;
	
	@FindBy(id="Email")
	@CacheLookup
	WebElement userid;
	
	@FindBy(id ="Password")
	@CacheLookup
	WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	@CacheLookup
	WebElement loginbtn;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	@CacheLookup
	WebElement logout;
	
	public LoginPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	public void setUsername(String uname) {
		userid.clear();
		userid.sendKeys(uname);
	}
	
	public void setPassword(String pass) {
		password.clear();
		password.sendKeys(pass);
	}
	
	public void loginBtnClick() {
		loginbtn.click();
	}
	
	public void logoutBtnClick() {
		logout.click();
	}
	
}
