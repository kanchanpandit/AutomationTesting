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
	By DOB_Date = By.cssSelector("div[id='uniform-days']"); 
	
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
		
	}
	
	
		
	
	

