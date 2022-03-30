package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	WebDriver driver;
	By SpendandSave = By.xpath("//*[@id=\"__next\"]/div/header/ul[1]/li[1]/a");
	By Started = By.xpath("//*[@id=\"__next\"]/div/header/ul[2]/li[2]/button");
	By signup = By.xpath("/html/body/div[4]/div/div/div/div[2]/form/div[1]/div/input");
	By signupexit = By.xpath("/html/body/div[4]/div/div/div/div[1]/button/svg");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement SpendandSave() {
		return driver.findElement(SpendandSave);
	}
	
	public WebElement Started() {
		return driver.findElement(Started);
	}
	
	public boolean signupExists() {
		return !driver.findElements(signup).isEmpty();
	}
	
	public WebElement SignupExit() {
		return driver.findElement(signupexit);
	}
	
}
