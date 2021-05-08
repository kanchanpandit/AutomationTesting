package Testing_Maven.end2end_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginAccount;

public class GetLogin extends base {
	
	public static Logger log = LogManager.getLogger(base.class.getName()); 
	
@BeforeTest
	
	public void initialize() throws Exception {
		 driver = initializeDriver(); 
		 log.info("driver is initialized");
		 driver.get(prop.getProperty("url"));	
	}
	
	@Test 
	
	public void basePageNavigation1() throws Exception {
		
		
		LandingPage lp = new LandingPage(driver); 
		
		LoginAccount la = lp.getLogin(); 
		la.enterEmail().sendKeys(prop.getProperty("email"));
		la.enterPassword().sendKeys(prop.getProperty("Password"));
		la.SubmitLogin().click();
		
		}
	
	@AfterTest
	public void teardown() throws Exception {
		 driver.close();
	}
}
