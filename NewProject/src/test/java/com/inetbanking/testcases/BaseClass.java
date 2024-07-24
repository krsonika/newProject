package com.inetbanking.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	 
	static  WebDriver driver;
    Properties properties;
    

	    

    public static String fromPropertyFile(String key) {
		FileInputStream fis=null;
		Properties properties=null;
		try {
			fis=new FileInputStream(new File("C:\\Users\\User\\eclipse\\NewProject\\Configuration\\properties"));
			properties=new Properties();
			properties.load(fis);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return properties.getProperty(key);
	}
	
	
	
	@BeforeClass
	public void setup() {
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	
	@AfterClass
	public void Close() {
		driver.quit();
		
	}
	

}
