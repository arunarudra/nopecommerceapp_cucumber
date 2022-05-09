package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import Pageobjects.AddCustomerPage;
import Pageobjects.SearchCustomer;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customers extends BaseClass {
	//public static WebDriver driver= BaseClass.driver;
	public AddCustomerPage addcust;
	public SearchCustomer srchcust;
	//addcust=new AddCustomerPage();
	
	@When("user click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {
		addcust=new AddCustomerPage(driver);
		addcust.clickCustomerMenu();
		Thread.sleep(2000);
		srchcust=new SearchCustomer(driver);
	    
	}

	@When("click on customers menu item")
	public void click_on_customers_menu_item() throws InterruptedException {
	    addcust.clickCustomerMenuItem();
	    Thread.sleep(1000);
	}

	@When("click on Add new button")
	public void click_on_add_new_button() {
	    addcust.clickAddNewButton();
	}

	@Then("user can view Add new customer page")
	public void user_can_view_add_new_customer_page() {
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcust.pageTitle());
	    
	}

	@When("user enter all customer details")
	public void user_enter_all_customer_details() throws InterruptedException {
	    String email= randomString()+"@gmail.com";
	    String name1=randomString();
	    String name2=randomString();
	    addcust.setEmail(email);
	    addcust.setpassword("test@123");
	    addcust.setFirstName(name1);
	    addcust.setLastName(name2);
	    addcust.setGender("Female");
	    addcust.setDOB("2/09/1985");
	    addcust.setCompany("busyQA");
	    addcust.setCustomerRoles("Administrators");
	    addcust.setManagerOfVendor("Vendor 2");
	    addcust.setAdminContent("This is or testing cucumber BDD using POM");
	    
	}

	@When("click on save button")
	public void click_on_save_button() {
	    addcust.clickSaveBtn();
	}

	@Then("user can see the confirmation message")
	public void user_can_see_the_confirmation_message(String docString) {
	    String actualmsg=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissable']")).getText();
	    System.out.println("confirm msg: "+actualmsg);
	    Assert.assertEquals(docString, actualmsg);
	}
	
// Search feature
	
	@When("provide email id in the email id field")
	public void provide_email_id_in_the_email_id_field() {
		srchcust.searchByMail("brenda_lindgren@nopCommerce.com");
	}
	
	@When("press search button")
	public void press_search_button() throws Exception {
	    srchcust.pressSearchButton();
	    Thread.sleep(2000);
	}

	@Then("user can see all details respective to the email id")
	public void user_can_see_all_details_respective_to_the_email_id() {
	    
	}

}
