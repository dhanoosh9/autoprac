package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.BaseClass;

public class ContactInfoPage extends BaseClass {
	

	By contactus = By.xpath("//a[contains(@title,'Contact Us')]");
	
	public void Contactus(String text) throws InterruptedException {
		
		driver.findElement(contactus).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@id,'id_contact')]"));
		Select select = new Select(dropdown);
		select.selectByVisibleText("Customer service");
		Thread.sleep(2000);
		select.selectByVisibleText("Webmaster");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(text);
	}
	
	public void contreference(String text) {
		driver.findElement(By.xpath("//input[contains(@id,'id_order')]")).sendKeys(text);
	}
	
	public void contmessage(String text) {
		driver.findElement(By.xpath("//textarea[contains(@id,'message')]")).sendKeys(text);
		driver.findElement(By.xpath("//span[contains(.,'Send')]")).click();
	}
}
