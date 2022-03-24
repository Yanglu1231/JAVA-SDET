package EbayTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AdvancedSearch {

	WebDriver driver;
	By advanceSearch = By.xpath("//*[@id=\"gh-as-a\"]");
	By fKeyword = By.xpath("//*[@id=\"_nkw\"]");
	By SearchButton = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[1]/div[3]/button");
	By priceLowerBound = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[2]");
	By priceUpperBound = By.xpath("//*[@id=\"adv_search_from\"]/fieldset[3]/input[3]");
	By sort = By.xpath("//*[@id=\"LH_SORT_BY\"]");
	By view = By.xpath("//*[@id=\"LH_VIEW_RESULTS_AS\"]");
	By resultPerPage = By.xpath("//*[@id=\"LH_IPP\"]");
	
	public AdvancedSearch(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement advancedSearch() {

		return driver.findElement(advanceSearch);
	}

	public WebElement findByKeyword() {

		return driver.findElement(fKeyword);
	}

	public WebElement searchButton() {

		return driver.findElement(SearchButton);
	}

	public WebElement upperBound() {

		return driver.findElement(priceUpperBound);
	}

	public WebElement lowerBound() {

		return driver.findElement(priceLowerBound);
	}
	
	public void SelectSortBydropDown(String name) {

		List<WebElement> element = driver.findElements(sort);

		for (WebElement e : element) {

			Select s = new Select(e);
			s.selectByVisibleText(name);
		}
	}
	
	public void SelectViewResultsDropdown(String name) {
		List<WebElement> element = driver.findElements(view);

		for (WebElement e : element) {

			Select s = new Select(e);
			s.selectByVisibleText(name);
		}
	}
	
	public void SelectResultPageDropdown(String name) {
		List<WebElement> element = driver.findElements(resultPerPage);

		for (WebElement e : element) {

			Select s = new Select(e);
			s.selectByVisibleText(name);
		}
	}

}
