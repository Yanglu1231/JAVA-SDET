package ebayTest;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import PageObjects.HomePage;
import PageObjects.TargetHomePage;

public class HomePageTest extends Base {

//	@Test
//	public void launcheBay() throws InterruptedException, IOException {
//		
//		String Iphone="//*[@id=\"srp-river-results\"]/ul/li[1]/div/div[2]/a/h3";
//		String result ="";
//		
//		Base b = new Base();
//		driver = b.initializer();
//		b.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		HomePage hp = new HomePage(b.driver);
//		//Search Iphone
//		hp.searchItem().sendKeys("iphone");
//		hp.getsearchText().click();
//		List<WebElement> iphones = driver.findElements(By.className("s-item__title"));
//		System.out.println(iphones.size());
//		List<WebElement> prices = driver.findElements(By.className("s-item__price"));
//		System.out.println(prices.size());
//		
//		for(int i = 0; i<iphones.size();i++) {
//			result = iphones.get(i).getText() + " - " + prices.get(i).getText();
//			System.out.println(result);
//		}
//		Thread.sleep(5000);
//		
//		b.driver.close();
//		
//	}

	@Test
	public void launchTarget() throws InterruptedException, IOException {
      
		
		Base b = new Base();
		driver = b.initializeTarget();
		b.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		TargetHomePage hp = new TargetHomePage(b.driver);
		hp.searchItem().sendKeys("iphone");
		hp.searchIcon().click();

		
		
		java.util.List<WebElement> no_of_items = driver.findElements(By.className("h-display-flex"));
		System.out.println(no_of_items.size());
		  for(int i=1;i<no_of_items.size();i++){
              WebElement productTitle = driver.findElement(By.xpath("//div["+i+"]//a[@data-test='product-title']"));
              WebElement productPrice = driver.findElement(By.xpath("//div["+i+"]//div[@data-test='current-price']"));
		  System.out.println(i+".Product title: "+productTitle.getText()+ "Product Price: \n"+productPrice.getText());
		  }
//		List<WebElement> iphones = driver.findElements(By.className("product-title"));
//		hp.getsearchButtonText().getAttribute("value"),"Search"
//		System.out.println(iphones.size());
//		List<WebElement> prices = driver.findElements(By.className("s-item__price"));
//		System.out.println(prices.size());
		
		Thread.sleep(5000);
		
		b.driver.close();
		
	}
}


