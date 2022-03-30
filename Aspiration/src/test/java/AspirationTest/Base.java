package AspirationTest;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;

	public WebDriver initializer() throws IOException {

		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("resources/config.properties");
		p.load(fis);

		if (p.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			driver = new ChromeDriver();		
			driver.get("https://aspiration.com/");
		}

		return driver;

	}

}
