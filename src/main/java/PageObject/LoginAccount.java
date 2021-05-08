package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAccount {
	
	public WebDriver driver; 
	
	By email = By.cssSelector("input[id='email']");
	By Password = By.cssSelector("input[id='passwd']"); 
	By SubmitLogin = By.cssSelector("button[id='SubmitLogin']"); 
	
	public LoginAccount (WebDriver driver) {
		this.driver = driver ; 
		}
	
	
		public WebElement enterEmail () {
			return driver.findElement(email); 
		}
	
		public WebElement enterPassword() {	
			return driver.findElement(Password); 
		}
	
		public WebElement SubmitLogin() {
			return driver.findElement(SubmitLogin); 
		}
		
		
		
	}
	
