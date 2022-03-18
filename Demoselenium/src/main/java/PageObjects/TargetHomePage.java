package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TargetHomePage {
	
	WebDriver driver;
	By search = By.id("search");

	public TargetHomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement searchIcon() {
		return driver.findElement(By.xpath("//*[@id=\"headerPrimary\"]/div[2]/form/button"));
	}
	
	public WebElement searchItem() {
		
		return driver.findElement(search);
	}
	
}
