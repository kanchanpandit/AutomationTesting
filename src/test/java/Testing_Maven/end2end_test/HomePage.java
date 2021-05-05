package Testing_Maven.end2end_test;

import org.testng.annotations.Test;

import PageObject.LandingPage;



public class HomePage extends base {
	
	
	
	@Test
	public void basePageNavigation() throws Exception {
		
	driver =	initializeDriver(); 
	driver.get("http://automationpractice.com/index.php");
	
	LandingPage lp = new LandingPage(driver); 
	lp.getSignIn().click();
	
	}
	
	
	

	
}
