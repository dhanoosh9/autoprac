package test;


import org.testng.annotations.Test;

import page.SigninPage;

public class SigninPageTest extends BaseClass{
	
	
	@Test
	public void signintest() {
		SigninPage signin = new SigninPage();
		signin.Sigin();
		signin.enterEmail(username);
		signin.enterPasswd(password);
		signin.clickSubmit();
	}
	
}
