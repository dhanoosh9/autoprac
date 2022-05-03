package page;
import org.openqa.selenium.By;

import test.BaseClass;

public class SigninPage extends BaseClass{
	
	By signinbtn = By.cssSelector("[class='login']");
	By email = By.cssSelector("[id=email]");
	By passwd = By.cssSelector("[id=passwd]");
	By submit = By.cssSelector("[id=SubmitLogin]");
	
	public void Sigin() {
		driver.findElement(signinbtn).click();
	}
	
	public void enterEmail(String Username) {
		driver.findElement(email).sendKeys(Username);
	}
	
	public void enterPasswd(String Password) {
		driver.findElement(passwd).sendKeys(Password);
	}
	
	public void clickSubmit() {
		driver.findElement(submit).click();
	}
}
