package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SpendAndSave {

	WebDriver driver;
	By Aspiration = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[1]/div[1]/span");
	By Aspirationplus = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[1]/span");
	By YearDeal = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[2]");
	By MonthDeal = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/div[1]/div[2]/div[2]/p[1]");
	By firstchecked = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[9]/div[1]/div[3]/img");
	By firstunchecked = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[9]/div[1]/div[2]");
	By secondchecked = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[10]/div[1]/div[3]/img");
	By secondunchcked = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[10]/div[1]/div[2]");
	By thirdchecked = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[11]/div[1]/div[3]/img");
	By thirdunchcked = By.xpath("//*[@id=\"__next\"]/div/section[7]/div/div[1]/ul/li[11]/div[1]/div[2]");
	
	public SpendAndSave(WebDriver driver) {
		this.driver = driver;
	}
	

	public boolean AspirationExists() {
		return !driver.findElements(Aspiration).isEmpty();
	}
	
	public boolean AspirationPlusExists() {
		return !driver.findElements(Aspiration).isEmpty();
	}
	
	public WebElement YearDeal() {
		return driver.findElement(YearDeal);
	}
	
	public WebElement MonthDeal() {
		return driver.findElement(MonthDeal);
	}
	
	public WebElement firstchecked() {
		return driver.findElement(firstchecked);
	}
	
	public WebElement firstunchecked() {
		return driver.findElement(firstunchecked);
	}
	
	public WebElement secondchecked() {
		return driver.findElement(secondchecked);
	}
	
	public WebElement secondunchecked() {
		return driver.findElement(secondunchcked);
	}
	
	public WebElement thirdchecked() {
		return driver.findElement(thirdchecked);
	}
	
	public WebElement thirdunchecked() {
		return driver.findElement(thirdunchcked);
	}
}