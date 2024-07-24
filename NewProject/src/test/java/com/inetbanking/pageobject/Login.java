  package com.inetbanking.pageobject;

import javax.xml.xpath.XPath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	
	   public Login(WebDriver driver){
		   PageFactory.initElements(driver,this );
	   }   
         
	   @FindBy(xpath = "//input[@name='uid']")
	   WebElement userName;
	   
	   @FindBy(xpath ="//input[@name='password']")
	   WebElement password;
	   
	   @FindBy(xpath = "//input[@name='btnLogin']")
	   WebElement login;
	   
	   public void Login(String name, String Pwd) {
		   userName.sendKeys(name);
		   password.sendKeys(Pwd);
		   login.click();
	   }
	   
}

