package TestScripts;


import org.testng.annotations.Test;

import PageObject.RegisterPage;

public class TC001_Login extends BaseClass {
	 
	@Test
	public void LoginTest() {
		driver.get(baseURL); 
		RegisterPage lp=new RegisterPage(driver);
		
	}
	

}
