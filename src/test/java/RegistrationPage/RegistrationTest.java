package RegistrationPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest {
	@SuppressWarnings("deprecation")
	@Test
	public void verifyFlightRegistration() throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
//		RegistrationPage rPage=new RegistrationPage(driver);
		RegistrationPage1 rPage=new RegistrationPage1(driver); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://demo.guru99.com/test/newtours/");
		
		rPage.registerBtn();
		rPage.setFirstName("Janardhan");
		rPage.setLastName("Jhon");
		rPage.setPhone("9080706050");
		rPage.setUserName("jana587");
		rPage.setAddress("Srikakulam");
		rPage.setCity("Srikakulam");
		rPage.setState("Andhra Pradesh");
		rPage.setPostalCode("532427");
		rPage.setCountry("INDIA");
		rPage.setEmail("jana587@gmail.com");
		rPage.setPassword("Janardhan@123");
		rPage.setCPassword("Janardhan@123");
		rPage.submitBtn();
		
		Thread.sleep(2000);
		driver.quit();
	}
}
