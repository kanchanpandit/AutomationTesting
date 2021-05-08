package Testing_Maven.end2end_test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.LandingPage;
import PageObject.LoginAccount;
import PageObject.MyAccount;
import PageObject.WomenSection;

public class ShoppingItem extends base {
	
	
	public static Logger log = LogManager.getLogger(base.class.getName()); 
	
	
	@BeforeTest
	
	public void initialize() throws Exception {
		 driver = initializeDriver(); 
		 log.info("driver is initialized");
		 driver.get(prop.getProperty("url"));	
	}
	
	@Test
	public void shoppingItems()  {
		 		
		 LandingPage lp = new LandingPage(driver); 
		 	LoginAccount la = lp.getLogin(); 
		 		la.enterEmail().sendKeys(prop.getProperty("email"));
		 		la.enterPassword().sendKeys(prop.getProperty("Password"));
		 		la.SubmitLogin().click();
		 			
		 		log.info("User successfully logged In");
					
		MyAccount myac = new MyAccount(driver);
			myac.getWomenSection().click();
			
			log.info("User has chosen women section");
		
		WomenSection ws = new WomenSection(driver); 
			ws.getTopSection().click();
			ws.getTshirts().click();
			ws.getProduct().click(); 
			ws.getAddToCart().click();
			ws.getCheckout().click();
			ws.getProceedToCheckout().click();
			ws.getProceedToCheckoutOnAddress().click();
			ws.getTermOfService().click();
			ws.getProceedToCheckout2().click();
			ws.getPaymentMode().click();
			ws.getConfirmOrder().click();
		System.out.println(ws.getOrderCompleteMsg().getText());	

		Assert.assertEquals(ws.getOrderCompleteMsg().getText(), "Your order on My Store is complete.");
		System.out.println("Test Completed");
		log.info("User has successfully placed the order");
	}
	
	@AfterTest
	public void teardown() throws Exception {
		 driver.close();
	}


}
