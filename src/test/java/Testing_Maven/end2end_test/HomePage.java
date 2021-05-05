package Testing_Maven.end2end_test;

import org.testng.annotations.Test;

import PageObject.CreateAccount;
import PageObject.CreateAccount_details;
import PageObject.LandingPage;



public class HomePage extends base {
	
		
	@Test
	public void basePageNavigation() throws Exception {
		
	driver =	initializeDriver(); 
	driver.get(prop.getProperty("url")); 
	
	LandingPage lp = new LandingPage(driver); 
	
	
	//Click on SignInButton
	CreateAccount CreatAc = lp.getSignIn(); 
	CreatAc.getEmailCreate().sendKeys("kanchan12oct@gmail.com");

	

	CreateAccount_details crtAC_details = CreatAc.getSubmitButton(); 
	crtAC_details.getGender().click();
	
	}
	
	
	

	
}
