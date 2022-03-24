package EbayTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import PageObjects.HomePage;

public class HomePageTest extends Base {

	@Test
	public void launcheBay() throws InterruptedException, IOException {
		
		Base b = new Base();
		driver = b.initializer();
		b.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage hp = new HomePage(b.driver);
		AdvancedSearch sa = new AdvancedSearch(b.driver);
		hp.MotorsExpand();
		hp.CollectorandArtExpand();
		sa.advancedSearch().click();
		sa.findByKeyword().sendKeys("Iphone");
		sa.SelectSortBydropDown("Best Match");
		sa.SelectResultPageDropdown("120");
		sa.SelectViewResultsDropdown("Picture Gallery");
		Thread.sleep(5000);
		
		b.driver.close();
		
	}
}