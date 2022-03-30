package AspirationTest;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import PageObjects.HomePage;
import PageObjects.SignUP;
import PageObjects.SpendAndSave;

public class AspirationTest extends Base {
	
	@Test
	public void launchAspiration() throws InterruptedException, IOException {
		
		Base b = new Base();
		driver = b.initializer();
		b.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		HomePage hp = new HomePage(b.driver);
		
		//Maximize the window in order to see Spend and Save button
		driver.manage().window().maximize();
		
		//Verify we can see products and prices after clicking "Spend and Save"
		hp.SpendandSave().click();
		
		//Verify that you see 2 card products, Aspiration and Aspiration Plus, else the test will fail
		SpendAndSave ss = new SpendAndSave(b.driver);
		if(ss.AspirationExists() && ss.AspirationPlusExists()) {
			System.out.println("Two Card Products are seen");
		}
		else {
			System.out.println("Two Card Products not seen");
			fail();
		}
		
		//Verify that when you click Get Started - User is redirected to sign-up page
		hp.Started().click();
		if(hp.signupExists()) {
			System.out.println("Signup page is here");
		}
		else {
			System.out.println("Signup page not found");
			fail();
		}
		
		SignUP sup = new SignUP(b.driver);
		sup.SignupExit().click();
		
		//Verify that yearly cost for Aspiration Plus is $5.99 per month paid yearly
		hp.SpendandSave().click();
//		System.out.println(ss.YearDeal().getText());
		if(ss.YearDeal().getText().equals("$5.99/mo if you pay annually")) {
			System.out.println("Yearly Cost per month is 5.99");
		}
		else {
			System.out.println("Not matching yearly Cost");
			fail();
		}
		
		//Verify that monthly cost for Aspiration Plus is $7.99 paid monthly
		System.out.println(ss.MonthDeal().getText());
		if(ss.MonthDeal().getText().equals("$7.99/mo")) {
			System.out.println("Monthly deal Cost per month is 7.99");
		}
		else {
			System.out.println("Not matching monthly Cost");
			fail();
		}
		
//		Verify that the following option are not showing check boxes on Aspiration and checked on Aspiration Plus. 
//		Automatic offsets for the negative climate impact of driving your car with Planet Protection
//      One out-of-network ATM reimbursement monthly
//      Purchase Assurance provides coverage for items that are damaged or stolen within 90 days
		WebElement i = ss.firstchecked();
		WebElement j = ss.firstunchecked();
		Boolean p = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i);
		Boolean f = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", j);
		if(f == null && p) {
			System.out.println("checkbox test pass for Automatic offsets for the negative climate impact of driving your car with Planet Protection");
		}
		else {
			fail();
		}
		
		WebElement i2 = ss.secondchecked();
		WebElement j2 = ss.secondunchecked();
		Boolean p2 = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i2);
		Boolean f2 = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", j2);
		if(f2 == null && p2) {
			System.out.println("checkbox test pass for One out-of-network ATM reimbursement monthly");
		}
		else {
			fail();
		}
		
		WebElement i3 = ss.thirdchecked();
		WebElement j3 = ss.thirdunchecked();
		Boolean p3 = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", i3);
		Boolean f3 = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", j3);
		if(f3 == null && p3) {
			System.out.println("checkbox test pass for Purchase Assurance provides coverage for items that are damaged or stolen within 90 days");
		}
		else {
			fail();
		}
		
		Thread.sleep(5000);
		
		b.driver.close();
		
	}
}
