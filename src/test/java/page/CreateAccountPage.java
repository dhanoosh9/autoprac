package page;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import test.BaseClass;

public class CreateAccountPage extends BaseClass {
	SigninPage signin = new SigninPage();
	By email = By.cssSelector("[id=email_create]");
	By firstname = By.id("customer_firstname");
	By lastname = By.id("customer_lastname");
	By password = By.cssSelector("[type=password]");
	
	public void createAccount() throws Exception {
		signin.Sigin();
		String Email = randomstring() + "@gmail.com";
		driver.findElement(email).sendKeys(Email);
		driver.findElement(By.cssSelector("[id=SubmitCreate]")).click();
		Thread.sleep(3000);
	}
	
	public void gender() {
		driver.findElement(By.cssSelector("[for=id_gender1]")).click();
		//driver.findElement(By.cssSelector("[for=id_gender2]")).click();
	}
	
	public void firstName(String name) {
		driver.findElement(firstname).sendKeys(name);
	}
	
	public void lastName(String lname) {
		driver.findElement(lastname).sendKeys(lname);
	}
	
	public void passwd(String Password) {
		driver.findElement(password).sendKeys(Password);
	}
	
	public void days() {
		WebElement days = driver.findElement(By.cssSelector("[id=days]"));
		Select select = new Select(days);
		select.selectByValue("4");
	}
	
	public void months() {
		WebElement months = driver.findElement(By.cssSelector("[id=months]"));
		Select select = new Select(months);
		select.selectByIndex(2);
	}
	
	public void years() {
		WebElement years = driver.findElement(By.cssSelector("[id=years]"));
		Select select = new Select(years);
		select.selectByValue("2000");
	}
	
	public void news() {
		driver.findElement(By.name("newsletter")).click();
		driver.findElement(By.id("optin")).click();
	}
	
	public void afname(String text) {
		WebElement firstname = driver.findElement(By.name("firstname"));
		firstname.sendKeys(text);
	}
	
	public void alname(String text) {
		WebElement lastname = driver.findElement(By.id("lastname"));
		lastname.sendKeys(text);
	}
	
	public void company(String text) {
		driver.findElement(By.id("company")).sendKeys(text);
	}
	
	public void address(String text) {
		driver.findElement(By.name("address1")).sendKeys(text);
		driver.findElement(By.name("address2")).sendKeys(text);
	}
	
	public void city(String text) {
		driver.findElement(By.name("city")).sendKeys(text);
	}
	
	public void state() {
		WebElement State = driver.findElement(By.name("id_state"));
		Select select = new Select(State);
		select.selectByValue("22");
	}
	
	public void Zip(String text) {
		driver.findElement(By.id("postcode")).sendKeys(text);
	}
	
	public void Country() {
		WebElement country = driver.findElement(By.name("id_country"));
		Select select = new Select(country);
		select.selectByValue("21");
	}
	
	public void Addinfo(String text) {
		driver.findElement(By.name("other")).sendKeys(text);
	}
	
	public void Homephone() {
		String hphone = randomNum();
		driver.findElement(By.name("phone")).sendKeys(hphone);
	}
	
	public void Mobilephone() {
		String mphone = randomNum();
		driver.findElement(By.id("phone_mobile")).sendKeys(mphone);
	}
	
	public void register() {
		driver.findElement(By.xpath("//span[contains(.,'Register')]")).click();
	}
 }
