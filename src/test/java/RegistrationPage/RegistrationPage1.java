package RegistrationPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage1 {
	WebDriver driver2;
	
	public RegistrationPage1(WebDriver d) {
		// TODO Auto-generated constructor stub
		driver2=d;
		PageFactory.initElements(d, this);
		
	}
	WebDriver driver;
	//Method 1
	@FindBy(how = How.LINK_TEXT,using = "REGISTER")
	WebElement registerLink;
	
	//Method 2
	@FindBy(name = "firstName")
	WebElement firstName;
	
	@FindBy(name = "lastName")
	WebElement lastName;
	
	@FindBy(name = "phone")
	WebElement Phone;
	
	@FindBy(name = "userName")
	WebElement userName;
	
	@FindBy(name = "address1")
	WebElement address1;
	
	@FindBy(name = "city")
	WebElement City;
	
	@FindBy(name = "state")
	WebElement State;
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	
	@FindBy(name = "country")
	WebElement Country;
	
	@FindBy(name = "email")
	WebElement Email;
	
	@FindBy(name = "password")
	WebElement Password;
	
	@FindBy(name = "confirmPassword")
	WebElement cPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement submitBtn;
	
	public void registerBtn() {
		registerLink.click();
	}
	public void setFirstName(String fname) {
		firstName.sendKeys(fname);
	}
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	public void setPhone(String pNumber) {
		Phone.sendKeys(pNumber);
	}
	public void setUserName(String uname) {
		userName.sendKeys(uname);
	}
	public void setAddress(String address) {
		address1.sendKeys(address);
	}
	public void setCity(String city) {
		City.sendKeys(city);
	}
	public void setState(String state) {
		State.sendKeys(state);
	}
	public void setPostalCode(String pCode) {
		postalCode.sendKeys(pCode);
	}
	public void setCountry(String country) {
		Country.sendKeys(country);
	}
	public void setEmail(String email) {
		Email.sendKeys(email);
	}
	public void setPassword(String password) {
		Password.sendKeys(password);
	}
	public void setCPassword(String cpassword) {
		cPassword.sendKeys(cpassword);
	}
	public void submitBtn() {
		submitBtn.click();
	}
}
