package RegistrationPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
	
public class RegistrationPage {
	WebDriver driver;
	RegistrationPage(WebDriver driver1){
		driver=driver1;
		System.out.println(driver+"this is firefox driver");
	}
	
	By registerLink=By.linkText("REGISTER");
	By firstName=By.name("firstName");
	By lastName=By.name("lastName");
	By Phone=By.name("phone");
	By userName=By.name("userName");
	By address1=By.name("address1");
	By City=By.name("city");
	By State=By.name("state");
	By postalCode=By.name("postalCode");
	By Country=By.name("country");
	By Email=By.name("email");
	By Password=By.name("password");
	By cPassword=By.name("confirmPassword");
	By submitBtn=By.xpath("//input[@type='submit']");
	
	public void registerBtn() {
		driver.findElement(registerLink).click();
	}
	public void setFirstName(String fname) {
		driver.findElement(firstName).sendKeys(fname);
	}
	public void setLastName(String lname) {
		driver.findElement(lastName).sendKeys(lname);
	}
	public void setPhone(String pNumber) {
		driver.findElement(Phone).sendKeys(pNumber);
	}
	public void setUserName(String uname) {
		driver.findElement(userName).sendKeys(uname);
	}
	public void setAddress(String address) {
		driver.findElement(address1).sendKeys(address);
	}
	public void setCity(String city) {
		driver.findElement(City).sendKeys(city);
	}
	public void setState(String state) {
		driver.findElement(State).sendKeys(state);
	}
	public void setPostalCode(String pCode) {
		driver.findElement(postalCode).sendKeys(pCode);
	}
	public void setCountry(String country) {
		Select select=new Select(driver.findElement(Country));
		select.selectByValue(country);
	}
	public void setEmail(String email) {
		driver.findElement(Email).sendKeys(email);
	}
	public void setPassword(String password) {
		driver.findElement(Password).sendKeys(password);
	}
	public void setCPassword(String cpassword) {
		driver.findElement(cPassword).sendKeys(cpassword);
	}
	public void submitBtn() {
		driver.findElement(submitBtn).click();
	}
	

}
