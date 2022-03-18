package ebayTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.remote.Browser;

public class Base {
	
		
		WebDriver driver;
		public WebDriver initializer() throws IOException {
					
			
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream("resources/config.properties");
			p.load(fis);
			
			String browser = p.getProperty("browser");
			
			if (p.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.ebay.com/");
				
				
			}
			
			if (p.getProperty("browser").equals("firefox")) {
				
				System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://www.ebay.com/");
				
				
			}
			
			return driver;
			
		}
		
		public WebDriver initializeTarget() throws IOException {
			Properties p = new Properties();
			FileInputStream fis = new FileInputStream("resources/config.properties");
			p.load(fis);
			
			String browser = p.getProperty("browser");
			
			if (p.getProperty("browser").equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://www.target.com/");
				
				
			}
			
			if (p.getProperty("browser").equals("firefox")) {
				
				System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
				driver = new FirefoxDriver();
				driver.get("https://www.target.com/");
				
				
			}
			
			return driver;
		}
		

	


}
