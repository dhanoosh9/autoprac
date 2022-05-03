package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;


import test.BaseClass;



public class HomePage extends BaseClass {

	By homebtn = By.xpath("//img[@alt='My Store']");
	By search = By.xpath("(//input[contains(@class,'input')])[1]");
	By contactus = By.xpath("//a[contains(@title,'Contact Us')]");
	
	
	public void homeBtn()
	{
		driver.findElement(homebtn).click();
	}
	
	public void Search(String text) {
		driver.findElement(search).sendKeys(text);
		driver.findElement(search).sendKeys(Keys.RETURN);
	}
	
	
	
}
