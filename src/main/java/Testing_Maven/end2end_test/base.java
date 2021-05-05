package Testing_Maven.end2end_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base {
	
	
	public WebDriver driver; 
	public Properties prop ; 
	
	public WebDriver initializeDriver() throws Exception {
		
		prop = new Properties(); 
		FileInputStream fis = new FileInputStream ("C:\\Users\\kpandit\\eclipse-workspace\\end2end_test\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser"); 
		
		
		if (browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", 
					"C:\\Users\\kpandit\\Desktop\\Automation\\Webdriver\\chromedriver\\chromedriver.exe"); 
			
			 driver = new ChromeDriver(); 
			
		} else if (browserName.equals("firefox")) {
			
			//writecode
			
			driver = new FirefoxDriver(); 
			
			
		} else if (browserName.equals("IE")) {
			//writecode
			
		}

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		return driver; 
		
	}
		
}
	
	
	


