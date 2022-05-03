package test;

import org.testng.annotations.Test;

import page.CreateAccountPage;

public class CreateAccountPageTest extends BaseClass {
	
	@Test
	public void createaccountpagetest() throws Exception {
		CreateAccountPage account = new CreateAccountPage();
		account.createAccount();
		account.gender();
		account.firstName("ryan");
		account.lastName("ryder");
		account.passwd("test123");
		account.days();
		account.months();
		account.years();
		account.news();
		account.afname("ryan");
		account.alname("ryder");
		account.company("tech geek");
		account.address("blah");
		account.city("monster");
		account.state();
		account.Zip("30003");
		account.Country();
		account.Addinfo("something");
		account.Homephone();
		account.Mobilephone();
		account.register();
		
	}
}
