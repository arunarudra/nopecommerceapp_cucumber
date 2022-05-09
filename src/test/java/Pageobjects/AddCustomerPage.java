package Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import StepDefinitions.BaseClass;

public class AddCustomerPage {
	public WebDriver ldriver;
	
	//Writing all locators
	
	By customersMenuLink=By.xpath("//a[@href='#']//p[contains(text(),'Customers')]");
	
	By customersItem=By.xpath("//a[@href='/Admin/Customer/List']//p[contains(text(),'Customers')]");
	
	By AddnewCust=By.xpath("//a[@href='/Admin/Customer/Create']");
	By email=By.id("Email");
	
	By password=By.id("Password");
	
	By fname=By.id("FirstName");
	By lname=By.id("LastName");
	By rbmale=By.id("Gender_Male");
	By rbfemale=By.id("Gender_Female");
	By txtdob=By.id("DateOfBirth");
	By companyName=By.id("Company");
	By chkboxTaxExempt=By.id("IsTaxExempt");
	By listBoxCustomerRoles=By.xpath("(//div[@role='listbox'])[2]");
			
	By listItemAdministrator=By.xpath("//li[contains(text(),'Administrators')]");
	
	By listItemForumModerator=By.xpath("//li[contains(text(),'Forum Moderators')]");
	By listItemGuests=By.xpath("//li[contains(text(),'Guests')]");
	By listItemRegistered=By.xpath("//li[contains(text(),'Registered')]");
	By listItemVendors=By.xpath("//li[contains(text(),'Vendors')]");
	By drpMgrVendor=By.xpath("//*[@id='VendorId']");
	By chkboxActive=By.xpath("//input[@id='Active']");
	By adminComment=By.xpath("//textarea[@id='AdminComment']");
	By btnSave=By.xpath("//button[@name='save']");
	
	
	public AddCustomerPage(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver, this);
		
	}
	
	public String pageTitle() {
		return ldriver.getTitle();
	}
	
	public void clickCustomerMenu() {
		ldriver.findElement(customersMenuLink).click();
	}
	
	public void clickCustomerMenuItem() {
		ldriver.findElement(customersItem).click();
	}
	
	public void clickAddNewButton() {
		ldriver.findElement(AddnewCust).click();
	}
	
	public void setEmail(String username) {
		ldriver.findElement(email).sendKeys(username);
		
	}
	
	public void setpassword(String pass) {
		ldriver.findElement(password).sendKeys(pass);
	}
	
	public void setFirstName(String firstname) {
		ldriver.findElement(fname).sendKeys(firstname);
	}
	
	public void setLastName(String lastname) {
		ldriver.findElement(lname).sendKeys(lastname);
	}
	
	public void setGender(String gender) {
		if (gender.equals("Male")) {
			ldriver.findElement(rbmale).click();
		}
		else if (gender.equals("Female")) {
			ldriver.findElement(rbfemale).click();
		}
	}
	
	public void setDOB(String dob) {
		ldriver.findElement(txtdob).sendKeys(dob);
		
	}
	
	public void setCompany(String compname) {
		ldriver.findElement(companyName).sendKeys(compname);
	}
	
	public void setTaxExempt() {
		ldriver.findElement(chkboxTaxExempt).click();
	}
	
	public void setCustomerRoles(String roles) throws InterruptedException {
		/*if(!roles.equals("Vendors")) {
			driver.findElement(By.xpath("//*[@id=\"SelectedCustomerRoleIds_taglist\"]/li/span[normalize-space()='Vendors']"));
		}*/
		ldriver.findElement(listBoxCustomerRoles).click();
		WebElement listitem;
		Thread.sleep(2000);
		if(roles.equals("Administrator")) {
			listitem=ldriver.findElement(listItemAdministrator);
		}
		else if(roles.equals("Guests")) {
			listitem=ldriver.findElement(listItemGuests);
		}
		else if(roles.equals("Registered")) {
			listitem=ldriver.findElement(listItemGuests);
		}
		else if(roles.equals("Vendors")) {
			listitem=ldriver.findElement(listItemVendors); 
		}
		else {
			listitem=ldriver.findElement(listItemForumModerator);
		}
		listitem.click();
	}
	
	public void setManagerOfVendor(String value) {
		Select drp=new Select(ldriver.findElement(drpMgrVendor));
		drp.selectByVisibleText(value);
	}
	
	public void setAdminContent(String content) {
		ldriver.findElement(adminComment).sendKeys(content);
	}
	
	public void clickSaveBtn() {
		ldriver.findElement(btnSave).click();
	}

}
