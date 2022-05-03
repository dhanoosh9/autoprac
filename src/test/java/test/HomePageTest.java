package test;




import java.time.Duration;

import org.testng.annotations.Test;


import page.HomePage;

public class HomePageTest extends BaseClass {
	

	@Test
	public void homepageTest() throws InterruptedException {
		
		HomePage homepage = new HomePage();
		
		homepage.homeBtn();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		homepage.Search("t-shirt");
		
	}
}
