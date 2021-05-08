package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount_details {

	public WebDriver driver; 
	
	By  SelectGender =  By.xpath("//*[@id='uniform-id_gender2']");
	By Cust_FirstName=  By.cssSelector("input[id='customer_firstname']"); 
	By Cust_LastName=  By.cssSelector("input[id='customer_lastname']");
	By Create_pwd =  By.cssSelector("input[id='passwd']");
	By DOB_Date = By.cssSelector("select[id='days']"); 
	By DOB_Month = By.cssSelector("select[id='months']"); 
	By DOB_Year = By.cssSelector("select[id='years']"); 
	
	By AddressFirstName = By.xpath("//input[@id='firstname']"); 
	By AddressLastName  = By.xpath("//input[@id='lastname']"); 
	By Address  = By.xpath("//input[@id='address1']"); 
	By Addresscity	= By.xpath("//input[@id='city']"); 
	By Addressstate = By.xpath("//select[@id='id_state']");
	By PostCode = By.xpath("//input[@id='postcode']"); 
	By AdditionalInfo = By.xpath("//textarea[@id='other']"); 
	By MobilePhone = By.xpath("//input[@id='phone_mobile']"); 
	By SubmitButtonAccount = By.xpath("//button[@id='submitAccount']"); 
	
	
	public CreateAccount_details(WebDriver driver) {
		
		this.driver = driver ; 
		
	}
		
		public WebElement getGender () {
			return driver.findElement(SelectGender) ; 
		}
		
		public WebElement getCustomerFirstName () {
			return driver.findElement(Cust_FirstName) ; 
		}
		
		public WebElement getCustomerLastName () {
			return driver.findElement(Cust_LastName) ; 
		}
		
		public WebElement getCreatePassword() {
			return driver.findElement(Create_pwd) ; 
		}
		
		
		public WebElement getBirthDate() {
			 return driver.findElement(DOB_Date); 
		}
		
		
		public WebElement getBirthMonth() {
			 return driver.findElement(DOB_Month); 
		}
		
		public WebElement getBirthyear() {
			 return driver.findElement(DOB_Year); 
		}
		
		public WebElement getAddressFirstName() {
			 return driver.findElement(AddressFirstName); 
		}
		
		public WebElement getAddressLastName() {
			 return driver.findElement(AddressLastName); 
		}
		
		public WebElement getAddress() {
			 return driver.findElement(Address); 
		}
		
		public WebElement getAddressCity() {
			 return driver.findElement(Addresscity); 
		}
		
		public WebElement getAddressState() {
			 return driver.findElement(Addressstate); 
		}
		
		public WebElement getPostCode() {
			 return driver.findElement(PostCode); 
		}
		
		public WebElement getAdditonalInfo() {
			 return driver.findElement(AdditionalInfo); 
		}
		
		public WebElement getAddressPhone() {
			 return driver.findElement(MobilePhone); 
		}
		
		public WebElement getSubmitAccount() {
			 return driver.findElement(SubmitButtonAccount); 
		}
		
	}
	
	
		
	
	

