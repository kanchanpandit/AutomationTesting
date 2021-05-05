package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LandingPage {
	
	public WebDriver driver; 
	
		By SignIn = By.cssSelector("a[href*='my-account']"); 
		
		
		public LandingPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
				this.driver = driver ;
				}
  
		public CreateAccount getSignIn() {
	  
		 driver.findElement(SignIn).click();	
		 CreateAccount CreatAc = new CreateAccount(driver) ; 
		 return CreatAc ; 
  }
	
 
}
