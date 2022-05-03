package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageValidations extends BaseClass {
	
	@Test
	public void validations() {

		boolean callDisp = driver.findElement(By.xpath("//span[contains(.,'Call us now: 0123-456-789')]")).isDisplayed();
		Assert.assertTrue(callDisp);
		
		boolean savingsDisp = driver.findElement(By.xpath("(//img[contains(@class,'img-responsive')])[1]")).isDisplayed();
		Assert.assertTrue(savingsDisp);
		
		boolean contactDisp = driver.findElement(By.xpath("//a[contains(@title,'Contact Us')]")).isDisplayed();
		Assert.assertTrue(contactDisp);
		
		boolean Signin = driver.findElement(By.xpath("//a[@class='login'][contains(.,'Sign in')]")).isDisplayed();
		Assert.assertTrue(Signin);
		
		boolean searchDisp = driver.findElement(By.xpath("//input[contains(@placeholder,'Search')]")).isDisplayed();
		Assert.assertTrue(searchDisp);
		
		boolean searchsubDisp = driver.findElement(By.xpath("//button[contains(@name,'submit_search')]")).isDisplayed();
		Assert.assertTrue(searchsubDisp);
		
		boolean homebtnDisp = driver.findElement(By.xpath("//img[contains(@class,'logo img-responsive')]")).isDisplayed();
		Assert.assertTrue(homebtnDisp);
		
		boolean cartbtnDisp = driver.findElement(By.xpath("//a[contains(@title,'View my shopping cart')]")).isDisplayed();
		Assert.assertTrue(cartbtnDisp);
		
		boolean womenbtnDisp = driver.findElement(By.xpath("//a[contains(@title,'Women')]")).isDisplayed();
		Assert.assertTrue(womenbtnDisp);
		
	}
	
}
