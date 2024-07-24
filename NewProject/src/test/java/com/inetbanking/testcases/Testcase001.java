package com.inetbanking.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;
import com.inetbanking.pageobject.Login;

public class Testcase001 extends BaseClass{
	
	
	@Test
	
 
	public void Logging() {
		
		driver.get(fromPropertyFile("baseURL"));
		
		Login lp=new Login(driver);
		lp.Login(fromPropertyFile("userName"), fromPropertyFile("password"));
	}

}
