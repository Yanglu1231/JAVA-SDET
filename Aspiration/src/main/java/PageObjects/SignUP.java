package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUP {
	WebDriver driver;
	By signupexit = By.xpath("/html/body/div[4]/div/div/div/div[1]/button");

	public SignUP(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement SignupExit() {
		return driver.findElement(signupexit);
	}
	
}
