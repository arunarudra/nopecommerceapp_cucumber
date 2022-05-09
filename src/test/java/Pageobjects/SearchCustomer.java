package Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchCustomer {
	public WebDriver ldriver;
	
	@FindBy(id="SearchEmail")
	@CacheLookup
	WebElement email;
	
	@FindBy(id="search-customers")
	@CacheLookup
	WebElement searchbtn;
	
	@FindBy(css = "td:nth-child(2)")
	@CacheLookup
	WebElement element;
	public SearchCustomer(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
	}
	
	public void searchByMail(String mail) {
		email.sendKeys(mail);
	}
	
	public void pressSearchButton() {
		
		searchbtn.click();
		JavascriptExecutor obj = (JavascriptExecutor)ldriver;
		obj.executeScript("arguments[1].scrollIntoView();", element,element);
	}

}
