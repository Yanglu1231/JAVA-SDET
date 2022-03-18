package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	By categories = By.className("gh-sb");
	By bellIcon = By.id("gh-Alerts-i");
	By signinLink = By.id("ghn-err");
	By logo = By.id("gh-la");
	By searchText = By.id("gh-btn");
	By search = By.id("gh-ac");

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement clickBellIcon() {

		return driver.findElement(bellIcon);
	}

	public WebElement clickSigninLink() {
		return driver.findElement(signinLink);
	}

	public WebElement clicklogo() {
		return driver.findElement(logo);
	}

	public WebElement getsearchText() {
		return driver.findElement(searchText);
	}

	public void selectaCategoryDropDown(String name) {

		List<WebElement> element = driver.findElements(categories);

		for (WebElement e : element) {

			Select s = new Select(e);
			s.selectByVisibleText(name);
		}

	}

	public WebElement searchItem() {
		
		return driver.findElement(search);
	}
	
	
}
