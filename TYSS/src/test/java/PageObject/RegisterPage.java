package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class RegisterPage {
	WebDriver driver;
	
	public RegisterPage(WebDriver driver){
		driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[text()='Register']")
	WebElement RegisterTitle;
	
	public WebElement getRegisterTitle() {
		return RegisterTitle;
	}
	
	
	@FindBy(xpath="//label[@class='forcheckbox' and text()='Male']")
	WebElement Gender;
	
	public WebElement getGender() {
		return Gender;
	}
	
	@FindBy(xpath="//input[@id='FirstName']")
	WebElement FirstName;
	 
	public WebElement getfirstName() {
		return FirstName;
	}
	
	@FindBy(xpath="//input[@id='LastName']")
	WebElement LastName;
	
	public WebElement getLastName() {
		return LastName;
	}
	
	@FindBy(xpath="//input[@id='Email']")
	WebElement Email;
	
	public WebElement getEmail() {
		return Email;
	}
	
	@FindBy(xpath="//input[@id='Password']")
	WebElement password;
	
	public WebElement getpassword() {
		return password;
	}
	@FindBy(xpath="//input[@id='ConfirmPassword']")
	WebElement confirmpassword;
	
	public WebElement getconfirmpassword() {
		return confirmpassword;
	}
	
	@FindBy(xpath="//input[@id='register-button']")
	WebElement Register;
	
	public WebElement getRegister() {
		return Register;
	}
	
	

}
