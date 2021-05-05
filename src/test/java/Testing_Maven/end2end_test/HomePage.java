package Testing_Maven.end2end_test;

import org.openqa.selenium.support.ui.Select;
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
	CreatAc.getEmailCreate().sendKeys(prop.getProperty("CreateEmail"));

	//Click on SubmitButton
	CreateAccount_details crtAC_details = CreatAc.getSubmitButton(); 
	crtAC_details.getGender().click();
	
	//Enter Customer details
	crtAC_details.getCustomerFirstName().sendKeys("Kanchan");
	crtAC_details.getCustomerLastName().sendKeys("Pandit");
	crtAC_details.getCreatePassword().sendKeys("Blackrose");
	
	
	Select dropdown = new Select (crtAC_details.getBirthDate());
	dropdown.selectByValue("12");
	System.out.println(dropdown.getFirstSelectedOption().getText());
	
	
	Select dropdown1 = new Select (crtAC_details.getBirthMonth());
	dropdown1.selectByIndex(10);
	System.out.println(dropdown1.getFirstSelectedOption().getText());
	
	Select dropdown2 = new Select (crtAC_details.getBirthyear());
	dropdown2.selectByValue("1990");
	System.out.println(dropdown2.getFirstSelectedOption().getText());
	
	
	//Enter Customer Address Details
	crtAC_details.getAddressFirstName().sendKeys("Kanchan");
	crtAC_details.getAddressLastName().sendKeys("Pandit");
	crtAC_details.getAddress().sendKeys("RoseMary Roadm, HouseNo-12 ");
	crtAC_details.getAddressCity().sendKeys("NewDelhi");
	
	Select dropdown3 = new Select (crtAC_details.getAddressState());
	dropdown3.selectByIndex(5);
	System.out.println(dropdown3.getFirstSelectedOption().getText());
	
	crtAC_details.getPostCode().sendKeys("BX4 102");
	crtAC_details.getAdditonalInfo().sendKeys("Hello, Please send the delivery after 0900 AM");
	crtAC_details.getAddressPhone().sendKeys("95999123459");
	
	}
	
	
}
