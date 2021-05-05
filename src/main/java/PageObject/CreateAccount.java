package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount {
	
	public WebDriver driver; 
	
	By email_create =  By.cssSelector("input[id='email_create']"); 
	By Submit_Create = By.cssSelector("button[id='SubmitCreate']"); 
	
	public CreateAccount(WebDriver driver) {
		
		this.driver = driver ; 
		
	}
	
	public WebElement getEmailCreate() {
		
		return driver.findElement(email_create) ; 
	}

	
	public CreateAccount_details getSubmitButton() {
		
	driver.findElement(Submit_Create).click(); 
	
	CreateAccount_details crtAC_details = new CreateAccount_details(driver); 
	return crtAC_details ; 
		
	}
}
