package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	
			public WebDriver driver; 
		
		
		By SelectWomen = By.xpath("//*[@id='block_top_menu']/ul/li[1]/a"); 
		
		public MyAccount(WebDriver driver) {
			// TODO Auto-generated constructor stub
			
				this.driver = driver ;
				}
		
		public WebElement getWomenSection () {
			
			return driver.findElement(SelectWomen); 
		}
		
		
	}



