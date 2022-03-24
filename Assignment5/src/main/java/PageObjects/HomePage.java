package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	By home = By.xpath("//*[@id=\"gh-logo\"]");
	By saved = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[2]/a");
	By motors = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[3]/a");
	By motorExp = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[4]");
	By CandA = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[5]/a");
	By HandG = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[6]/a");
	By sportingG = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[9]/a");
	By toy = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[8]");
	By BandI = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[10]");
	By JandW = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[11]");
	By refurbished = By.xpath("//*[@id=\"mainContent\"]/div[1]/ul/li[12]/a");
	By tdeal = By.xpath("//*[@id=\"items_list2\"]/div[1]/div/div[1]/h2/a");
	By searchItem = By.xpath("//*[@id=\"gh-ac\"]");
	By categories = By.className("gh-sb");
	By SignIn = By.xpath("//*[@id=\"gh-ug\"]/a");
	By AdvancedS = By.xpath("//*[@id=\"gh-as-a\"]");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement Home() {
		
		return driver.findElement(home);
	}
	
	public WebElement Saved() {
		return driver.findElement(saved);
	}
	
	public WebElement Motors() {
		return driver.findElement(motors);
	}
	
	public void MotorsExpand() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(motorExp)).build().perform();
	}
	
	public void CollectorandArtExpand() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(CandA)).build().perform();
	}
	
	public void HomeandGardenExpand() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(HandG)).build().perform();
	}
	
	public void SportinggoodsExpand() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(sportingG)).build().perform();
	}
	
	public void toyExpand() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(toy)).build().perform();
	}
	
	public void businessAndIndustrialExpand() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(BandI)).build().perform();
	}
	
	public void JewelryWatches() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(JandW)).build().perform();
	}
	
	public void EbayRefurbished() {
		Actions hoverOps = new Actions(driver);
		hoverOps.moveToElement(driver.findElement(refurbished)).build().perform();
	}
	
	public WebElement TodaysDeal() {
		return driver.findElement(tdeal);
	}
	
	public WebElement Search() {
		return driver.findElement(searchItem);
	}
	
	public void selectaCategoryDropDown(String name) {

		List<WebElement> element = driver.findElements(categories);

		for (WebElement e : element) {

			Select s = new Select(e);
			s.selectByVisibleText(name);
		}

	}
	
	public WebElement SignIn() {
		return driver.findElement(SignIn);
	}
	
	public WebElement AdvancedSearch() {
		return driver.findElement(AdvancedS);
	}
	
}
