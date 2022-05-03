package test;

import org.testng.annotations.Test;

import page.ContactInfoPage;

public class ContactInfoPageTest extends BaseClass {
	
	@Test
	public void contactInfo() throws Exception {

		ContactInfoPage contactinfo = new ContactInfoPage();
		contactinfo.Contactus("dhanoosh369@gmail.com");
		contactinfo.contreference("ABCD123");
		contactinfo.contmessage("My order is not yet delivered");
	}
	
}
