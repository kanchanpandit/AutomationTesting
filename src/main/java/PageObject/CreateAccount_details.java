package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateAccount_details {

	public WebDriver driver; 
	
	By  SelectGender =  By.xpath("//*[@id='uniform-id_gender2']"); 
	
	
	public CreateAccount_details(WebDriver driver) {
		
		this.driver = driver ; 
		
	}
		
		public WebElement getGender () {
			return driver.findElement(SelectGender) ; 
		}
		
	}
	
	
		
	
	

